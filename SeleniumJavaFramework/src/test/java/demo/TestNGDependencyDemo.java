package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	//@Test(dependsOnMethods= {"test2"})
	//@Test(dependsOnGroups= {"sanity1"})
	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() { //function
		System.out.println("I am inside Test 1");		
	}
	
	@Test(groups= {"sanity1"})
	public void test2() { //function
		System.out.println("I am inside Test 2");		
	}

	@Test(groups= {"sanity2"})
	public void test3() { //function
		System.out.println("I am inside Test 3");		
	}	
}
