package testNG2;

import org.testng.annotations.Test;

public class TestOne {
	
	
	@Test(priority=1)
	public void One() {
		System.out.println("First Test");
	}
	@Test(priority=2)
	public void Two() {
		System.out.println("second Test");
	}
	@Test(priority=3)
	public void Third() {
		System.out.println("third Test");
	}

}
