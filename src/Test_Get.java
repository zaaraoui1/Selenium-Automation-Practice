import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver chrome = new ChromeDriver();
       chrome.get("https://www.google.com/");
       //chrome.get("https://www.hespress.com/");
       String url = chrome.getCurrentUrl();
       String title = chrome.getTitle();
       System.out.println("URL: "+url+"\nTitre: "+title);
       if (url.contentEquals("https://www.google.com/"))
    	   System.out.println("passe");
       else 
    	   System.out.println("KO");
       
	}

}
