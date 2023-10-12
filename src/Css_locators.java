import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver chrome = new ChromeDriver();
		 chrome.manage().window().maximize();
	     chrome.get("https://www.facebook.com/");
	     
	     //==> tagname[attribute="value"]
	     //chrome.findElement(By.cssSelector("input[name='email']")).sendKeys("zaaraoui");
	     
	     //==> tagname#ID  après le # on met la valeur du ID
	     //chrome.findElement(By.cssSelector("input#email")).sendKeys("zaaraoui");
	     
	     //==> #ID  on peut utiliser le # et la valeur du ID sans tagname
	     //chrome.findElement(By.cssSelector("#email")).sendKeys("zaaraoui");
	     
	     //==> tagname.classname  
	     //chrome.findElement(By.cssSelector("input.inputtext")).sendKeys("zaaraoui");
	     
	     //.classname
	     chrome.findElement(By.cssSelector(".inputtext")).sendKeys("zaaraoui");
	     
	     
	     //***************IMPORTANT****************//
	     // pour executer csslocators dans le console :  $$("css_locators")
	     
	}

}
