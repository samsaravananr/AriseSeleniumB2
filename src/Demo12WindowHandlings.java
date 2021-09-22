import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12WindowHandlings {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\ArisGlobalB2\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
        myD.manage().window().maximize();
        myD.get("https://accounts.google.com");
        Thread.sleep(3000);
        System.out.println(myD.getTitle());
        myD.findElement(By.xpath("//a[text()='Help']")).click();
        
        Set<String> ids=myD.getWindowHandles();
        //System.out.println(ids);
        
        Iterator<String> it=ids.iterator();
        String ParentID=it.next();
        String ChildID=it.next();
        
        //System.out.println(ParentID);
        //System.out.println(ChildID);
        myD.switchTo().window(ChildID);
        
        Thread.sleep(2000);
        System.out.println(myD.getTitle());
        Thread.sleep(2000);
        myD.quit();
        
        

	}

}
