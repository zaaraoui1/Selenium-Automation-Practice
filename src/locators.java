import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://www.google.com/");
	   
	     //==> locator by id
	     //chrome.findElement(By.id("APjFqb")).sendKeys("selenium with java tutorial");
	    
	     //==> locator by class
	     //chrome.findElement(By.className("gLFyf")).sendKeys("by classe");
	     
	     //==> locator by name
	     //chrome.findElement(By.name("q")).sendKeys("Name");
	     
	     //==> locator by link text
	     //chrome.findElement(By.linkText("Gmail")).click();
	     
	     //==> locator by part link text
	     chrome.findElement(By.partialLinkText("Gmai")).click();
	     
	     
	     
	     
	     
	     //chrome.close();

	}

}
