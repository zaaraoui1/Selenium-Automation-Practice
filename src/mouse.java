import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.ebay.com/");
		Actions action= new Actions(chrome);
		
		action.moveToElement(chrome.findElement(By.linkText("Electronics"))).build().perform();	
		action.moveToElement(chrome.findElement(By.id("gh-ac"))).click().sendKeys("laptop").doubleClick().build().perform();
		action.moveToElement(chrome.findElement(By.id("gh-btn"))).click().build().perform();
	}

}
