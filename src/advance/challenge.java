package advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://google.com");
		
		chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chrome.findElement(By.id("APjFqb")).sendKeys("irbid");
		System.out.println(chrome.findElement(By.xpath("//div[@id='ERWdKc']")).getAttribute("aria-label"));
		System.out.println(chrome.findElement(By.xpath("//div[@id='c7mM1c']")).getAttribute("aria-label"));
		System.out.println(chrome.findElement(By.xpath("//div[@id='Zrbbw']")).getAttribute("aria-label"));
		System.out.println(chrome.findElement(By.xpath("//div[@id='sBQTL']")).getAttribute("aria-label"));
		
		// une autre méthode
		
		WebElement listbox = chrome.findElement(By.xpath("//ul[@role='listbox']"));
		List <WebElement> li = listbox.findElements(By.tagName("span"));
		System.out.println(li.size());
		System.out.println(li.get(0).getText());
		System.out.println(li.get(1).getText());

	}

}
