import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://www.google.com/");
	     
	     //avec la notation ==> //tag name[@attribute = 'value']
	     //chrome.findElement(By.xpath("//textarea[@name='q']")).sendKeys("test");
	     
	     //avec la notation ==> //*[@attribute = 'value']
	     //chrome.findElement(By.xpath("//*[@name='q']")).sendKeys("test");
	     
	     //avec la notation ==> //tagname[contains(@attribute , 'value')]
	     chrome.findElement(By.xpath("//textarea[contains(@name, 'q')]")).sendKeys("test");
	     
	     //si le l'attribut de xpath persiste sur plusieurs positions on peut spécifier 
	     //la position de l'attribut demander par [numéro de la position]
	     // chrome.findElement(By.xpath("(//textarea[@name='q'])[0]")).sendKeys("test");
	     
	     //***************IMPORTANT****************//
	     // pour executer xpathlocators dans le console :  $x("xpath_locators")
	  	     

	}

}
