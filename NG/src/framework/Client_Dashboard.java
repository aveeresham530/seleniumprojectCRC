package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client_Dashboard {
	public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna\\Desktop\\Driver's\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//*********Edit Client profile***********************//
	driver.get("https://app.creditrepaircloud.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("debuglog@creditrepaircloud.com");
	driver.findElement(By.name("password")).sendKeys("123456");
	driver.findElement(By.id("signin")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("My Clients")).click();
	Thread.sleep(4000);  
	//Selected Client for Editing
	driver.findElement(By.id("cli_2331")).click(); 
	driver.findElement(By.linkText("View/Edit Profile")).click();
	
	
	//Select Client_Status=new Select(driver.findElement(By.id("clientstatus_35")));
	//Client_Status.selectByValue("104");
	//Clicks on selected client 
	
	
	driver.findElement(By.name("fname")).clear();
	driver.findElement(By.name("fname")).sendKeys("Retestt");
	
	//****Assigned member is trying to cancelling
	//WebElement Assigned_Member = driver.findElement(By.xpath("//img[@src='https://app.creditrepaircloud.com/application/images/cross.png']"));
	//Assigned_Member.click();
	driver.findElement(By.className("btn-default")).click();
	
	WebElement on_button=driver.findElement(By.id("on"));
	if(on_button.isSelected())
	{
		System.out.println("Already Assigned a member to Client");
	}
	else 
	{
		on_button.click();	
	}
	//help_for_login_passowrd_issue_popup
	driver.findElement(By.name("help_for_login_passowrd_issue_popup")).click();
	driver.findElement(By.className("ui-icon ui-icon-closethick")).click();
	Thread.sleep(2000);
	//View Agreement
	driver.findElement(By.linkText("View Agreement")).click();
	driver.findElement(By.className("ui-icon ui-icon-closethick")).click();
	Thread.sleep(2000);
	//reset_agreement
	driver.findElement(By.id("reset_agreement")).click();
	driver.findElement(By.className("ui-icon ui-icon-closethick")).click();
	Thread.sleep(2000);
	//*********Import Audit Report from My_Client Dashboard page	
	driver.findElement(By.linkText("Pull reports & create auditt")).click();
	driver.findElement(By.linkText("Edit Credentials")).click();
	//Select Provider dropdown from the Provider drop down list
/*	Select Provider=new Select(driver.findElement(By.id("auto_selprovider")));
	Provider.selectByVisibleText("Choose Supported Provider");
	//Entered provder name 
	driver.findElement(By.id("auto_vcr_username")).sendKeys("TestLead");
	driver.findElement(By.id("auto_vcr_password")).sendKeys("123456");
	driver.findElement(By.id("auto_vcr_phonenumber")).sendKeys("1234564521");
	driver.findElement(By.id("auto_securityword_label")).sendKeys("124578jh");
	driver.findElement(By.id("auto_vcr_securityword")).sendKeys("124578jh");
	driver.findElement(By.id("auto_vcr_note")).sendKeys("Test");
	//****Auto Report Submit button should not submit
	
	//driver.findElement(By.id("auto1_btnsubmit_without_pending")).click();
	driver.findElement(By.className("ui-icon ui-icon-closethick")).click();
	
	//***********Run Dispute Wizard Create letters and correct errors
	driver.findElement(By.linkText("Run Dispute Wizard")).click();
	driver.findElement(By.linkText("ORDER CREDIT HISTORY REPORTS")).click();
	driver.findElement(By.id("btnclose")).click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.findElement(By.id("btnclose")).click();
	
	//ORDER FREE ANNUAL REPORTS BY MAIL
	driver.findElement(By.linkText("ORDER FREE ANNUAL REPORTS BY MAIL")).click();
	driver.findElement(By.id("equifax_1")).click();
	driver.findElement(By.linkText("Next")).click();
	driver.findElement(By.linkText("EXPORT AS PDF")).click();
	driver.findElement(By.id("back")).click();
	//*** If possible we can write alert message type here
	driver.findElement(By.linkText("Leave Page")).click();
	driver.findElement(By.id("back")).click();
	
	//ORDER FREE ANNUAL REPORTS ONLINE
	driver.findElement(By.linkText("ORDER FREE ANNUAL REPORTS ONLINE")).click();
	
	//REQUEST CREDIT REPORTS BY MAIL
	
	driver.findElement(By.linkText("REQUEST CREDIT REPORTS BY MAIL")).click();
	driver.findElement(By.id("equifax_1")).click();
	driver.findElement(By.id("opt3")).click();
	
	//ORDER REPORT FROM MY FAVORITE PROVIDER
	driver.findElement(By.linkText("ORDER REPORT FROM MY FAVORITE PROVIDER")).click();
	
	
	
	////******************Dispute Items
	driver.findElement(By.linkText("Dispute Items")).click();
	driver.findElement(By.id("add_new_dispute_item")).click();   */
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
              
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	//driver.findElement(By.name("fname")).sendKeys("Retest");
	
	}
	
}
