package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Qthout1 {
	

	WebDriver d;
	@Test
	public void Login() throws Exception {
	d.get("https://app.creditrepaircloud.com/");
	Thread.sleep(4000);
	d.findElement(By.name("username")).sendKeys("debuglog@creditrepaircloud.com");
	d.findElement(By.name("password")).sendKeys("123456");
	d.findElement(By.id("signin")).click();
	Thread.sleep(5000);
	d.findElement(By.linkText("My Clients")).click();
	Thread.sleep(4000); 
	
	
	//**for Adding new client we should use csv file for exporting data 

	d.findElement(By.linkText("Add New Client")).click();
	d.findElement(By.name("fname")).sendKeys("Test");
	d.findElement(By.name("lname")).sendKeys("lead");
	d.findElement(By.name("mname")).sendKeys("1");
	}
	//check box for select NoEmail
	/*	@Test
	public void CheckNoEmail() throws Exception {
	driver.findElement(By.name("chknoemail")).click();  
	Thread.sleep(5000);
	}
	@Test
	public void Address() {
	driver.findElement(By.id("ssnumber")).sendKeys("1255"); 
	driver.findElement(By.id("city")).sendKeys("juy"); 
	driver.findElement(By.id("pcode")).sendKeys("444444444"); 
	}
	//Client assigned to check box list
	@Test
	public void assigned() throws Exception {
	WebElement chk =driver.findElement(By.id("chk_1"));
	Thread.sleep(5000);
	if(chk.isSelected())
	{
		System.out.println("check box is already selected");
	}
	else {
		chk.click();	
	}
	//driver.findElement(By.id("chk_13")).click();
	
	//referred_by_dd
	Thread.sleep(3000);
	Select dropdown1 =new Select(driver.findElement(By.id("referred_by_dd")));
	dropdown1.selectByValue("5");
	
	//drop down box testing
	Select dropdown =new Select(driver.findElement(By.name("status")));
	dropdown.selectByVisibleText("Lead");  
     }  */
	
	@BeforeMethod
	public void setUp() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna\\Desktop\\Driver's\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	 d = new FirefoxDriver();
	
	
	}

}

