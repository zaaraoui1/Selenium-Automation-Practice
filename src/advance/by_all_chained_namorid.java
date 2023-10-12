package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class by_all_chained_namorid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://facebook.com");
		
		//chrome.findElement(new ByAll(By.id("email"), By.name("email"))).sendKeys("amine");
		chrome.findElement(new ByIdOrName("email")).sendKeys("amine");
		//chrome.findElement(new ByChained(By.id("email"),By.tagName(""))).sendKeys("amine");   la notion du paire et flis

	}

}
