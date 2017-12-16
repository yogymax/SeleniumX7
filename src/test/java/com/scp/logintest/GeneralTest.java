package com.scp.logintest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneralTest {
 
  @Test(groups={"smoke","general"})
  public void generalTest1() {
	  System.out.println("inside general test1");
  }
  
  @Test(groups={"general"})
  public void generalTest2() {
	  System.out.println("inside general test2");
	  Assert.fail("this test case is failed");
  }
  

  @Test(groups={"smoke","general"},dependsOnMethods="generalTest2")
  public void generalTest3() {
	  System.out.println("inside general test1");
  }
  
  @Test(groups={"smoke","general"})
  public void generalTest4() {
	  System.out.println("inside general test1");
  }
  
  @Test(groups={"smoke","general"})
  public void generalTest5() {
	  System.out.println("inside general test1");
  }
  
  
}


