import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_drop_down {

	public static void main(String[] args) {
		
		WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://codenboxautomationlab.com/practice/");
	     
	     
	     WebElement sta_drop_down = chrome.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	     Select sdd = new Select(sta_drop_down);
	     sdd.selectByIndex(1);
	     sdd.selectByValue("option2");
	     sdd.selectByVisibleText("API");


	}

}
