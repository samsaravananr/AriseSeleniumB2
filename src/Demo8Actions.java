import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Demo8Actions {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("http://www.youcandealwithit.com/");
		Thread.sleep(3000);
		Actions vact= new Actions(myD);
		vact.moveToElement(myD.findElement(By.linkText("BORROWERS"))).build().perform();
		
		
		
		Thread.sleep(2000);
		myD.findElement(By.linkText("Calculators & Resources")).click();


	}

}
