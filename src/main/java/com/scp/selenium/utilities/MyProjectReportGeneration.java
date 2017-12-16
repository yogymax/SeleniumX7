package com.scp.selenium.utilities;

import java.io.IOException;

import org.jfree.ui.RefineryUtilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyProjectReportGeneration implements ITestListener{

	static int passCount=0;
	static int failCount=0;
	static int skipCount=0;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		passCount++;
		
	}

	public void onTestFailure(ITestResult result) {
		failCount++;
		
	}

	public void onTestSkipped(ITestResult result) {
		skipCount++;
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("No of pass test cases" +passCount);
		System.out.println("No of fail test cases" +failCount);
		System.out.println("No of skip test cases" +skipCount);
		

	     try {
			PieChart_AWT.createReport(passCount,failCount,skipCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}

}
