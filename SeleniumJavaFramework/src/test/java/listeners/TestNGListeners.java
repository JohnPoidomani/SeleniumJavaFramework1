package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {

	public void onFinish(ITestContext context) { // TODO Auto-generated method stub
		System.out.println("********* Tests completed : "+context.getName());
		
	}

	public void onStart(ITestContext context) { // TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) { // TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) { // TODO Auto-generated method stub
		System.out.println("********* Test Failed : "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) { // TODO Auto-generated method stub
		System.out.println("********* Test skipped : "+result.getName());
		
	}

	public void onTestStart(ITestResult result) { // TODO Auto-generated method stub
		System.out.println("********* Test Started : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) { // TODO Auto-generated method stub
		System.out.println("********* Test is successful :  "+result.getName());
		
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}
	

	
		

		
		
	
}

