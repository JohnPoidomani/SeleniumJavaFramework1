package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestNGGroupsDemo {
	
	@Test(groups= {"sanity"}) //method for test1
	public void test1() {
		System.out.println(" This is Test 1 ");
	}
	
	//@Test(groups= {"sanity","smoke"})
	@Test(groups= {"windows.regression"}) //method for test2
	public void test2() {
		System.out.println(" This is Test 2 ");
	}
	
	//@Test(groups= {"sanity","regression"})
	@Test(groups= {"linux.regression"}) //method for test3
	public void test3() {
		System.out.println(" This is Test 3 ");
	}
	
	@Test //method for test4
	public void test4() {
		System.out.println(" This is Test 4 ");
	}
	
}
