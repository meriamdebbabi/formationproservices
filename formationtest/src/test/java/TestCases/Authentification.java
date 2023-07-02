package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Authentification {

	@SuppressWarnings("deprecation")
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
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(5000);
				//declaration des variables et identification des elements 
				WebElement username;
				WebElement password;
				WebElement login ;
				username = driver.findElement(By.name("username"));
				password = driver.findElement(By.name("password"));
				login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				//action
				username.sendKeys("Admin");
				password.sendKeys("admin123");
				login.click();
				Thread.sleep(5000);
				WebElement profil;
				profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
				String texte ;
				texte = profil.getText();
				Assert.assertEquals(texte,"MagdalenaUsha MontanaD");
				System.out.println("test ok");
				//fermeture 
				driver.close();
				
				
				
				
				

	}

}
