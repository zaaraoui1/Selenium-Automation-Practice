import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://echoecho.com/javascript4.htm");
	     chrome.findElement(By.xpath("//input[@value='alert box']")).click();
	     chrome.switchTo().alert().accept();

	}

}
