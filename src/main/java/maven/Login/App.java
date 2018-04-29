package maven.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://mail.yahoo.com");
    	Thread.sleep(5000);
    	String user="mianguyenngoc@gmail.com";
    	String email="mattanguyen27@yahoo.com";
    	String mdp="C@pGemini123";
    	String suj="Hi there!";
    	String msg="Hello tout le monde!";
    	driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys(email);
    	driver.findElement(By.xpath("//*[@id='login-signin']")).click();    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys(mdp);    	
    	driver.findElement(By.xpath("//*[@id='login-signin']")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/nav/div/div[1]/a")).click();
    	driver.findElement(By.xpath("//*[@id='message-to-field']")).sendKeys(user);
    	driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[1]/div[3]/div/div/input")).sendKeys(suj);
    	driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[1]/div[3]/div/div/input")).sendKeys(Keys.TAB);   	  	
    	driver.findElement(By.xpath("//*[@id='editor-container']/div[1]")).sendKeys(msg);    	
    	driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[2]/div[2]/div/button")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/nav/div/div[3]/div[1]/ul/li[4]/div/a/span[1]/span/span/span")).click();    	
    	driver.findElement(By.xpath(".//*[@id='mail-app-component']/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/ul[1]/li[3]/a/div[1]/div[1]/button/span")).click();
    	driver.findElement(By.xpath(".//*[@id='mail-app-component']/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/ul[1]/li[5]/a/div[1]/div[1]/button/span")).click();
    	driver.findElement(By.xpath(".//*[@id='mail-app-component']/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/ul[1]/li[3]/a/div[1]/div[1]/button/span")).click();
    	driver.findElement(By.xpath("//*[@id='mail-app-component']/div[1]/div/div[1]/div/div[2]/ul/li[3]/div/button/span/span/span")).click();
    	driver.findElement(By.xpath("//*[@id='modal-outer']/div/div/div[4]/button[1]")).click();
    	driver.findElement(By.xpath("//*[@id='ybar']/div[3]/div[1]/label/span")).click();
    	driver.findElement(By.xpath("//*[@id='ybarAccountMenuBody']/a[3]/span")).click();
    	driver.navigate().back();
    	driver.navigate().to("http://www.gooogle.com");
    	driver.navigate().back();
    	driver.navigate().forward();
    	driver.navigate().refresh();
    	driver.navigate().to("https://ngoisao.net");
    	driver.close();
    	driver.quit();
    }
}
