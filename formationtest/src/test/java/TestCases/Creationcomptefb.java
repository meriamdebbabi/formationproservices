package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Creationcomptefb {

	public static void main(String[] args) {
		// identification (chemin) chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		// ouverture chrome
		WebDriver driver;
		driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
	
		//ouvrir l'url
		driver.navigate().to("https://fr-fr.facebook.com/");
		// implicty wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//declaration des variables et identification des elements 
		
		WebElement creercomptefacebook ;
		WebElement prenom;
		WebElement nomdefamille;
		WebElement Adressemail;
		WebElement ConfirmAdressmail;
		WebElement motdepasse;
		WebElement jours;
		WebElement mois;
		WebElement Année;
		WebElement Genre;
		WebElement Bouton;
		
		
		
		
		
		

		creercomptefacebook =driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		
		Actions action = new Actions (driver);
		creercomptefacebook.click();
		
		prenom=driver.findElement(By.name("firstname"));
		nomdefamille=driver.findElement(By.name("lastname"));
		Adressemail=driver.findElement(By.name("reg_email__"));
		ConfirmAdressmail=driver.findElement(By.name("reg_email_confirmation__"));
		motdepasse=driver.findElement(By.name("reg_passwd__"));
		jours=driver.findElement(By.name("birthday_day"));
		mois=driver.findElement(By.name("birthday_month"));
		Année=driver.findElement(By.name("birthday_year"));
		Genre=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		Bouton=driver.findElement(By.name("websubmit"));
		
		//Action
		
		prenom.sendKeys("meriam");
		nomdefamille.sendKeys("debabi");
		Adressemail.sendKeys("meriamdebbabi@gmail.com");
		action.keyDown(Adressemail, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(ConfirmAdressmail, Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		motdepasse.sendKeys("9831388A3");
		Select select = new Select(jours);
		select.selectByValue("4");
		Select select2 = new Select(mois);
		select2.selectByValue("3");
		Select select3 = new Select(Année);
		select3.selectByValue("1993");
		
		Genre.click();
		Bouton.click();
		
		
		
		
		
		
		
		
		
		
	}

}
