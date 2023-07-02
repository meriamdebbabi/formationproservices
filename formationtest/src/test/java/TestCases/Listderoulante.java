package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listderoulante {

	public static void main(String[] args) throws InterruptedException {

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
		driver.navigate().to("https://demoqa.com/select-menu");
		

		//declaration et identification des elements 
		WebElement couleur;
		couleur = driver.findElement(By.id("oldSelectMenu"));
		
		Select select = new Select(couleur);
		select.selectByValue("5");
		
		driver.close();
		
	}
}