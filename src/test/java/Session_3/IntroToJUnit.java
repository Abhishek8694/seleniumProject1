package Session_3;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileSystemUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToJUnit {
	
	
	WebDriver driver;
	String url = "http://demo.automationtesting.in/Register.html";
	
	@Before
	public void SetUp()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	}
	
	@Test
	public void Execution()
	{
	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	WebElement adress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
	WebElement MobNo = driver.findElement(By.xpath("//input[@type='tel']"));
	WebElement FeMale = driver.findElement(By.xpath("//input[@value='FeMale']"));
	WebElement Male = driver.findElement(By.xpath("//input[@value='Male']"));
	WebElement Cricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	WebElement Movies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	WebElement Hockey = driver.findElement(By.xpath("//input[@id='checkbox3']"));
	WebElement Lang = driver.findElement(By.xpath("//div[@id='msdd']"));
	WebElement Passw = driver.findElement(By.xpath("//input[@ng-model='Password']"));
	WebElement ConfPassw = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));

	
	
	firstName.sendKeys("Abhishek");
	lastName.sendKeys("Vaidya");
	adress.sendKeys("Yavatmal");
	Email.sendKeys("anv@gmail.com");
	MobNo.sendKeys("86001111111");
	FeMale.click();
	Male.click();
	Cricket.click();
	Movies.click();
	Hockey.click();
	//Lang.sendKeys("Marathi");
	Passw.sendKeys("abc@123");
	ConfPassw.sendKeys("abc@123");
	}
	
	

	@After
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
	
	
	}
	


