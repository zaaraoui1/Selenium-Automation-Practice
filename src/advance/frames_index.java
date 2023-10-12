package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_index {

	public static void main(String[] args) {
		

		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demo.guru99.com/test/guru99home/");
		
		int nb_frame = chrome.findElements(By.tagName("iframe")).size();
		System.out.println(nb_frame);
		
		for (int i =0; i<nb_frame; i++) {
			chrome.switchTo().frame(i);
			if (chrome.findElements(By.xpath("//img[@src = 'Jmeter720.png']")).size() == 1)
			{
				chrome.findElement(By.xpath("//img[@src = 'Jmeter720.png']")).click();
			}
			chrome.switchTo().defaultContent();
		}
		
		chrome.quit();
		
	}

}
