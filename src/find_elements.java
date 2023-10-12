import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_elements {

	public static void main(String[] args) {
		
		WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://echoecho.com/htmlforms09.htm");
	     
	     // ==> on met les éléments trouvés dans une liste
	     //List<WebElement> elements = chrome.findElements(By.xpath("//input[@type='checkbox']"));
	     //elements.get(0).click();
	     
	     // ==> sans utilisation de la liste
	     chrome.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
	     

	}

}
