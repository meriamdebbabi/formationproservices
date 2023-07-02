package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class passagesouris {

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
		
		//ouverture de l'url
		driver.navigate().to("https://demoqa.com/menu");
		Thread.sleep(5000);
		
		//declaration et identification des variables
		WebElement MainItem2 ;
		WebElement Sublist;
		MainItem2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		Sublist = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		
	     //Action
		Actions action = new Actions(driver);
		action.moveToElement(MainItem2).perform();
		action.moveToElement(Sublist).perform();
		
		
		
		//fermeture chrome
		driver.close();

	}

}
