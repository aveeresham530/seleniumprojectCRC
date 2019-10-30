package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Client {
	
	public static void main(String args[]) throws Exception {

	
/**	WebDriver  driver;
	//public static void main(String[] args) {
		@Test
	public void Login() { */
	WebDriver   driver = new FirefoxDriver();
			  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      // driver.manage().window().maximize();
		   
			driver.get("https://app.creditrepaircloud.com/");   
			driver.findElement(By.name("username")).sendKeys("debuglog@creditrepaircloud.com");
			driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.id("signin")).click();
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.linkText("My Clients")).click();
			driver.findElement(By.linkText("Add New Client")).click();
			driver.findElement(By.name("fname")).sendKeys("Test");
			driver.findElement(By.name("lname")).sendKeys("lead");
			driver.findElement(By.name("mname")).sendKeys("1");
	}
		
}
	
/*	//check box for select NoEmail
	@Test
	public void checkmail() {
			driver.findElement(By.name("chknoemail")).click();  
		  driver.findElement(By.id("ssnumber")).sendKeys("1255"); 
			driver.findElement(By.id("city")).sendKeys("juy"); 
			driver.findElement(By.id("pcode")).sendKeys("444444444"); 	

		   //Client assigned to check box list
			WebElement chk =driver.findElement(By.id("chk_1"));
	    	if(chk.isSelected())
			{
				System.out.println("check box is already selected");
			}
			else {
				chk.click();	
			}
			Select dropdown1 =new Select(driver.findElement(By.id("referred_by_dd")));
			dropdown1.selectByValue("5");
			Select dropdown =new Select(driver.findElement(By.name("status")));
			dropdown.selectByVisibleText("Lead");  
		   }
      }  */

