package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_element_by_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.bbc.com/");
		chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//chrome.findElement(By.xpath("//*[text()='News']")).click(); // cette methode ne fonctionne pas dans ce cas 
		// chrome.findElement(By.xpath("//*[contains(text(),'News')]")).click(); // cette methode ne fonctionne pas dans ce cas
		
		chrome.findElement(By.linkText("News")).click();
		
	}

}
