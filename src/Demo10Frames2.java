import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Demo10Frames2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(5000);
		
		int vFrame=myD.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames "+vFrame);
		
		//myD.switchTo().frame(0);
		//myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
		
		//You can navigate to the frame by index
		
		System.out.println(myD.findElement(By.id("draggable")).getText());
		
		
		myD.close();

	}

}
