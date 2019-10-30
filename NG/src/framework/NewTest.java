package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver d;
		
	@BeforeMethod 
	public void SetUp()	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\krishna\\Desktop\\Driver's\\chromedriver.exe");
	 d=new ChromeDriver();
	}
	
	
	@Test 
	public void Login() throws Exception {
		d.get("https://demo.cyclos.org/#home");
		Thread.sleep(10000);
	}
		// Verify page title
		//assertTrue(d.getTitle().contains("Cyclos4 Communities"));
		// Click on Sign in
		@Test
	    public void Username()  {
		d.findElement(By.linkText("Sign in")).click();
		d.findElement(By.name("principal")).sendKeys("demo");
		d.findElement(By.name("password")).sendKeys("1234");
		d.findElement(By.className("actionButton")).click();
		d.close();
		
	  }
	}
		
		//@AfterMethod
	// Launch browser
		//System.setProperty("webdriver.gecko.driver", "E:\\Driver Executables\\geckodriver.exe");
		//d=new FirefoxDriver();
		
		//d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//d.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
 

