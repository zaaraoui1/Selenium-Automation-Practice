package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement submit = chrome.findElement(By.xpath("//button[@id='philadelphia-field-submit']"));
		JavascriptExecutor js = ((JavascriptExecutor) chrome);
    	js.executeScript("arguments[0].scrollIntoView(true);", submit);
    	js.executeScript("arguments[0].click();", submit);

	}

}
