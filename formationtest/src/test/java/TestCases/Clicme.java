package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Clicme {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//delete all cookies 
		driver.manage().deleteAllCookies();
		//ouverture URL
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//declatation et identification
		
		WebElement clickme;
		clickme= driver.findElement(By.cssSelector("//button[normalize-space()='Click Me']"));
		
		//verification
		WebElement message ;
		message= driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte,"You have done a dynamic click");
		
		System.out.println("dynamic click");
		
		//fermeture 
		driver.close();
		
		
		
		
		
		

	}

}
