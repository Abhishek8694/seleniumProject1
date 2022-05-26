package webTableHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class prizeValidateVertical {
	
	static WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://letcode.in/table");
	}
	
	@Test
	public void webTabHandle()
	{
		List<WebElement> pricesFrmList = driver.findElements(By.xpath("//table[@id='shopping']//tbody//tr//td[2]"));
		
		WebElement TotalPrice = driver.findElement(By.xpath("//table[@id='shopping']//tfoot/td/b"));
		
		int sum = 0;
		for( int i=0; i<pricesFrmList.size();i++)
		{
			sum+= Integer.parseInt(pricesFrmList.get(i).getText());
		}
		
		if(sum == Integer.parseInt(TotalPrice.getText())) {
			Assert.assertTrue(true);
			System.out.println("total is matching");
		}
		else {
			Assert.assertFalse(false);
			System.out.println("total is not matching");
		}
	}
		
		@After
		
		public void tearDown() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		
	}
	
	
	
	
	
	

}
