package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysevent {

	public static void main(String[] args) {
		
		// identification (chemin ) (Chromedriver)
				System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
				// ouverture chrome
				WebDriver driver;
				driver = new ChromeDriver();

				// maximize window
				driver.manage().window().maximize();

				// delete cookies
				driver.manage().deleteAllCookies();
				
				// implicty wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				// ouverture URL
				driver.navigate().to("https://demoqa.com/text-box");
				

				//declaration et identification des elements 
				WebElement currentadress;
				WebElement permanentadress;
				
				
				currentadress = driver.findElement(By.id("currentAddress"));
				permanentadress = driver.findElement(By.id("permanentAddress"));
				

				 //Action
				Actions action = new Actions (driver);
				
				
				currentadress.sendKeys("200 avenue de la liberté tunis");
				action.keyDown(currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(permanentadress, Keys.CONTROL).perform();
				action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				
				
			
				

	}

}
