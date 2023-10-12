package advance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demo.guru99.com/popup.php");
		chrome.findElement(By.linkText("Click Here")).click();
		System.out.println(chrome.getCurrentUrl());
		
		
		Set <String> ids = chrome.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parent_id = it.next();
		String child_id = it.next();
		
		chrome.switchTo().window(child_id);
		System.out.println(chrome.getCurrentUrl());

	}

}
