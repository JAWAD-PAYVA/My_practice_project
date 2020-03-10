package Mevan_Frame.Academy;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Resurces.base_Class;

import org.testng.ITestContext;

import java.io.IOException;

import org.testng.ISuiteResult;

public class Listeners implements ITestListener {

	base_Class Screen = new base_Class();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	/*public void onTestFailure(ITestResult arg0) {
		
		
		try {
			Screen.getScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
	
	
}
