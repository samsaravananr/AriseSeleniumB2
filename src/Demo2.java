import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\geckodriver.exe");
	WebDriver myD=new FirefoxDriver();
	myD.get("https://www.google.com/");
	String vTitle=myD.getTitle();
	System.out.println("The Title is "+vTitle);
	Thread.sleep(5000);
	myD.close();	
	}
	

}

