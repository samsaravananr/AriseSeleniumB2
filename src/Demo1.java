import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.get("https://www.google.com/");
	String vTitle=myD.getTitle();
	System.out.println("The Title is "+vTitle);
	Thread.sleep(5000);
	myD.close();
	
	
	
	
	
	
	
	}
	

}

