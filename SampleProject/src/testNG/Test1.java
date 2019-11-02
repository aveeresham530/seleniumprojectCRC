package testNG;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void add() {
		int a=10; 
		int b=20;
		int c=a+b;
	System.out.println("add"+c);
	}
	@Test
	public void sub() {
		int a=10; 
		int b=20;
		int c=a+b;
	System.out.println("sub"+c);
	}
	@Test
	public void mul() {
		int a=10; 
		int b=20;
		int c=a*b;
	System.out.println("sub"+c);
	}	
	
}
