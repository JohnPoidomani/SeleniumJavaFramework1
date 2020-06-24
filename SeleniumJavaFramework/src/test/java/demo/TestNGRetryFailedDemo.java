package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	
	@Test
	public void test1() { //function
		System.out.println(" I am inside Test1");
	}
	
	@Test
	public void test2() { //function
		System.out.println(" I am inside Test2");
		//int i=1/0; //Forcing a failure to prove it can be caught
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() { //function
		System.out.println(" I am inside Test3");
		Assert.assertTrue(0>1);  //Forcing a failure to prove it can be caught
	}
	
}
