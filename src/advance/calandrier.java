package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calandrier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.oncf.ma/fr/");
		
		WebElement date_dep = chrome.findElement(By.id("datetimepickerDep"));
		WebElement date_arr = chrome.findElement(By.id("datetimepickerArr"));
		
		JavascriptExecutor js = ((JavascriptExecutor) chrome);
    	js.executeScript("arguments[0].setAttribute('value','"+"26-08-2023"+"');", date_dep);
    	js.executeScript("arguments[0].setAttribute('value','"+"27-08-2023"+"');", date_arr);
		

	}

}
