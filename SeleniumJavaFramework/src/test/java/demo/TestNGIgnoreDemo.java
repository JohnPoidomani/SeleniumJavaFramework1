package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
public class TestNGIgnoreDemo {
	
	@Test
	//@Ignore
	public void test1() { //function
		System.out.println(" I am inside Test 1");
	}
	
	@Test
	public void test2() { //function
		System.out.println(" I am inside Test 2");
	}
}
