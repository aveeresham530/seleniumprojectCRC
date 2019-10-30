package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	
	public static void main(String args[]) {
		
		WebDriver  driver= new FirefoxDriver();
		 
		  driver.get("https://accounts.google.com/");
		//Enter username
		  driver.findElement(By.id("identifierId")).sendKeys("aveeresham530");
		  //Click Next button
		  driver.findElement(By.id("next")).click();
		  //Enter password
		  driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("veeresham@123");
		  //Click SignIN
		  driver.findElement(By.className("CwaK9")).click();
		  driver.quit();
		
	}
}
