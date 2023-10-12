import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver chrome = new ChromeDriver();
	     chrome.get("https://www.google.com/");
	     chrome.navigate().to("https://www.hespress.com/");
	     chrome.navigate().back();
	     chrome.navigate().refresh();
	     chrome.navigate().forward();
	}

}
