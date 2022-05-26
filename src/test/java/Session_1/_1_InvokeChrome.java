package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_InvokeChrome {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Batch17SeleniumWebDriver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver.exe");
		
		WebDriver driver	= new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	
	System.out.println("Web page title is ->" + title);
	
	String titleExpected = "Facebook – log in or sign up";
	
//	validation
	
	if(title.equals(titleExpected))
	{
		System.out.println("title metched");
	}
	else
	{
		System.out.println("title doesn't matched");
	}
	
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().back();
	driver.navigate().forward();
	
//	driver.close();
	driver.quit();
	
	}

}
