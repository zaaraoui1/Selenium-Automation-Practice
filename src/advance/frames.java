package advance;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * driver.switchTo().frame("frame");
		 * driver.switchto().defaultcontent(); on peut revenir vers le frame principale depuis n'import quel frame
		 * driver.switchTo().parentFrame(); revenir vers le frame parent
		 */
		
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demo.guru99.com/test/guru99home/");
		chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		chrome.switchTo().frame("a077aa5e");
		chrome.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		Set <String> ids = chrome.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent_id = it.next();
		String child_id = it.next();
		
		chrome.switchTo().window(child_id);
		chrome.findElement(By.linkText("Home")).click();
		
		
	}

}
