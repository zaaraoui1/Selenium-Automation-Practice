package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies_pageloade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://google.com");
		
		chrome.manage().deleteAllCookies();
		chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// retourne KO si la page dépasse 10 secondes pour se charger

	}

}
