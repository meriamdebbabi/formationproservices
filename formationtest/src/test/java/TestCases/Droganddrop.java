package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Droganddrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin ChromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//ouverture navigateur
		WebDriver driver = new ChromeDriver() ;
		
		//maximiz window 
		driver.manage().window().maximize();
		//delete all cookies 
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		//identification et declaration des variables 
		WebElement dragme ;
		WebElement drophere ;
		
		
		
		dragme = driver.findElement(By.id("draggable"));
		drophere = driver.findElement(By.id("droppable"));
		
		//Action
		
		Actions actions = new Actions (driver);
		actions.dragAndDrop(dragme, drophere).perform();
		
		//verification
		WebElement message ;
		String texte;
		texte= drophere.getText();
		Assert.assertEquals("Dropped!", texte);
		System.out.println("test ok");
		
		//fermeture 
				driver.close();
		

	}

}
