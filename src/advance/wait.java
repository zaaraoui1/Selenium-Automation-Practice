package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * 1- thread sleep  : java (static) 
		 *    thread.sleep(ms);
		 * 
		 * 
		 * 2- implicit wait : selenium dynamic
		 *    driver.manager.timeouts().impliciteWait(seconds, TimeUnit.SECONDS)
		 * 
		 * 
		 * 3- explicite wait : selenium dynamic
		 *    webdriverwait wait = new webdriverwait(chrome, 20);
		 *    wait.until(expectedconditions.elementToBeClichable(driver.findelement(By.id(""))))
		 * 
		 */
		
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://library-app.firebaseapp.com/");
		
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.linkText("Libraries")).click();
		
		//Thread.sleep(9000);
		chrome.findElement(By.linkText("Abc")).click();

	}

}
