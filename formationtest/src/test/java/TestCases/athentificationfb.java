package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class athentificationfb {

	public static void main(String[] args) throws InterruptedException {
	
			// identification (chemin) chromedriver
					System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
					// ouverture chrome
					WebDriver driver;
					driver = new ChromeDriver();
					//maximize window
					driver.manage().window().maximize();
					//delete all cookies
					driver.manage().deleteAllCookies();
					//ouvrir l'url
					driver.navigate().to("https://fr-fr.facebook.com/");
					Thread.sleep(5000);
					//declaration des variables et identification des elements 
					WebElement email;
					WebElement password;
					WebElement connexion ;
					email = driver.findElement(By.name("email"));
					password = driver.findElement(By.name("pass"));
					connexion = driver.findElement(By.name("login"));
					//action
					email.sendKeys("meriamdebbabi9@gmail.com");
					password.sendKeys("98312688A ");
					connexion.click();
					Thread.sleep(5000);
					
					//fermeture 
					driver.close();
					
	}

}
