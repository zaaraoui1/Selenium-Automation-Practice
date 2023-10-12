import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class full_screen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://www.google.com/");
	    // chrome.manage().window().maximize();
	}

}
