import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.get("https://www.linkedin.com/login");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	myD.findElement(By.id("username")).sendKeys("admin");
	myD.findElement(By.name("session_password")).sendKeys("1234");
	myD.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	Thread.sleep(5000);
	myD.close();
	
		
	}
	

}

