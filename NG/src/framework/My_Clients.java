package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_Clients {
	   //public static void main(String args[]) throws Exception {
	   WebDriver driver;
	   @BeforeTest
	   public void Launchapp() {
	      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		   driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	   }
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna\\Desktop\\Driver's\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://app.creditrepaircloud.com/");
	   @Test
	   public void Login() {
		driver.get("https://app.creditrepaircloud.com/");   
		driver.findElement(By.name("username")).sendKeys("debuglog@creditrepaircloud.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("signin")).click();

		driver.findElement(By.linkText("My Clients")).click();
		  
	   }
		//**for Adding new client we should use csv file for exporting data 
	   @Test
	   public void AddNewClient() {
		driver.findElement(By.linkText("Add New Client")).click();
		driver.findElement(By.name("fname")).sendKeys("Test");
		driver.findElement(By.name("lname")).sendKeys("lead");
		driver.findElement(By.name("mname")).sendKeys("1");
		//check box for select NoEmail
		driver.findElement(By.name("chknoemail")).click();  
	   }
	   @Test
	   public void ClientName() {
		driver.findElement(By.id("ssnumber")).sendKeys("1255"); 
		driver.findElement(By.id("city")).sendKeys("juy"); 
		driver.findElement(By.id("pcode")).sendKeys("444444444"); 	
	   }
	   @Test
	   public void Email() {
	   //Client assigned to check box list
		WebElement chk =driver.findElement(By.id("chk_1"));
		
		if(chk.isSelected())
		{
			System.out.println("check box is already selected");
		}
		else {
			chk.click();	
		}
	   }
		
	   @Test
	   public void dropdown() {
		Select dropdown1 =new Select(driver.findElement(By.id("referred_by_dd")));
		dropdown1.selectByValue("5");
		Select dropdown =new Select(driver.findElement(By.name("status")));
		dropdown.selectByVisibleText("Lead");  
		}
}
