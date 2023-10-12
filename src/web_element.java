import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://www.facebook.com/");
	     
	     WebElement face_email = chrome.findElement(By.cssSelector("#email"));
	     face_email.sendKeys("zaaraoui");

	}

}
