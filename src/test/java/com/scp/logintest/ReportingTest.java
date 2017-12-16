package com.scp.logintest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class ReportingTest {
  
	@AfterSuite
	public void m1(){
		
	}
 
	
	
 @Test(groups={"smoke","reporting"})
  public void reportingTest1() {
	  System.out.println("inside reporting test1");
  }
  
  @Test(groups={"reporting"})
  public void reportingTest2() {
	  System.out.println("inside reporting test2");
  }
  
  
  @Test(groups={"reporting","smoke"})
  public void reportingTest3() throws Exception {
	  System.out.println("inside reporting test3");
	  throw new Exception();
  }
  
  @Test(groups={"reporting"})
  public void reportingTest4() {
	  System.out.println("inside reporting test4");
  }
  
  @Test(groups={"reporting","smoke","sanity"})
  public void reportingTest5() {
	  System.out.println("inside reporting test5");
  }
}
