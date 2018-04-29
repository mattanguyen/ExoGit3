package maven.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//driver.get("https://login.yahoo.com/manage_account?.src=ym&.intl=us&authMechanism=primary&done=https%3A%2F%2Fmail.yahoo.com%2F&eid=100");
    	driver.get("https://www.linkedin.com/");
    	Thread.sleep(5000);
    	//String user="lananh nguyen";
    	String email="mattanguyen27@yahoo.com";
    	String mdp="C@pGemini123!";
    	//driver.findElement(By.xpath("//*[@className='name']")).click();
    	driver.findElement(By.xpath("//*[@id='login-email']")).sendKeys(email);
    	driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys(mdp);
    	driver.findElement(By.xpath("//*[@id='login-submit']")).click();
    	String temp=driver.findElement(By.xpath("//*[@data-control-name='identity_welcome_message']")).getText();    	
    	driver.findElement(By.xpath("//*[@data-control-name='identity_welcome_message']")).click();  
    	if (temp.equalsIgnoreCase("Bonjour Lananh"));
    	{System.out.println("Login succèss");
    	//ngoac kep de co the display nhieu dong khac nhau
    	System.out.println("Voici le compte de Lan Anh");
    	}
    	Thread.sleep(5000);
    	//driver.findElement(By.xpath("//div[@class ='transition-buttons']//*[@class ='next button-tertiary-medium-muted']")).click();
    	String compa=driver.findElement(By.xpath("//*[@id='pds-ge-entry']/div/div/div[1]/button[2]")).getText();
    	driver.findElement(By.xpath("//*[@id='pds-ge-entry']/div/div/div[1]/button[2]")).click();
    	if (compa.equalsIgnoreCase("Suivant"));
    	System.out.println("La page suivante arrivée");	
	}
}
