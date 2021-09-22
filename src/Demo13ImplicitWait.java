import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo13ImplicitWait 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	myD.get("https://www.linkedin.com/login");
	
	
	myD.manage().window().maximize();
	
	myD.findElement(By.id("username")).sendKeys("admin");
	
	//myD.findElement(By.id("this is wrong username id")).sendKeys("admin");
	//Thread.sleep(5000);
	myD.close();
	
		
	}
	

}

