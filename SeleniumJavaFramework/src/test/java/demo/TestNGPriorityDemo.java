package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	@Test//(priority = 1)
	public void one() {	//method
		System.out.println("I am inside Test 1");		
	}	
	
	@Test(priority = 1)
	public void two() { //method
		System.out.println("I am inside Test 2");		
	}

	@Test(priority = 1)
	public void three() {  //method
		System.out.println("I am inside Test 3");
	}

}