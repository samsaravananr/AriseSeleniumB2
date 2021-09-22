import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\msedgedriver.exe");
	WebDriver myD=new EdgeDriver();
	myD.get("https://www.linkedin.com/login");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	myD.findElement(By.id("username")).sendKeys("admin");
	myD.findElement(By.name("session_password")).sendKeys("1234");
	myD.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	

    String msg=myD.findElement(By.xpath("//*[@id=\"error-for-username\"]")).getText();
    System.out.println("Error is: "+msg);

	
	Thread.sleep(5000);
	myD.close();
	
		
	}
	

}

