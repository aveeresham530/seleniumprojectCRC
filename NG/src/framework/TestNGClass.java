package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	
	WebDriver driver = new FirefoxDriver();
	   
	   @BeforeTest
	   public void launchapp() {
	      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch website
	      driver.navigate().to("http://www.calculator.net");
	      driver.manage().window().maximize();
	   }
	   
	   @Test
	   public void calculatepercent() {
	      // Click on Math Calculators
	      driver.findElement(By.linkText("Math Calculators")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.linkText("Percent Calculators")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	   }
	   
	   @AfterTest
	   public void terminatetest() {
	      driver.close();
	   }
	}