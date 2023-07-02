package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Doubleclique {

	public static void main(String[] args) throws InterruptedException {
		//chemin chromedrive
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		//ouverture chrome
		WebDriver driver ;
		driver=new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//declaration et identification des elements 
		WebElement Doublebtn;
		Doublebtn= driver.findElement(By.id("doubleClickBtn"));
		
		//Action double click
		
		Actions action = new Actions(driver);
		action.doubleClick(Doublebtn).perform();
		
		//verification
		WebElement message;
		message=driver.findElement(By.id("doubleClickMessage"));
		
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte, "You have done a double click");
		
		System.out.println("double click done");
		
	
		
		
	}

}
