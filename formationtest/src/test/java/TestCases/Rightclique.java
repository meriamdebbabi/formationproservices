package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;

import junit.framework.Assert;

public class Rightclique {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		//ouverture chrome
				WebDriver driver ;
				driver=new ChromeDriver(); 
				//maximize window
				driver.manage().window().maximize();
				
				//delete all cookies 
				driver.manage().deleteAllCookies();
				
				//ouverture URL
				driver.navigate().to("https://demoqa.com/buttons");
				Thread.sleep(5000);
				
				
				//declaration et identification
				
				WebElement RightclicBtn;
				RightclicBtn = driver.findElement(By.id("rightClickBtn"));
			
				//action
				Actions actions = new Actions(driver);
				actions.contextClick(RightclicBtn).perform();
				
				//verification
				WebElement message ;
				message= driver.findElement(By.id("rightClickMessage"));
				
				String texte;
				texte=message.getText();
				Assert.assertEquals(texte,"You have done a right click");
				
				System.out.println("Right clic done");
				
				//fermeture 
				driver.close();
				
		
		

	}

}
