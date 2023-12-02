package Test.Second;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTest {
@Test
public void test(){
	System.out.println("WelcomeTestNg");
}
@BeforeTest
public void test2(){
	System.out.println("BeforeTest");
}	
@AfterTest

public void test20(){
	System.out.println("AfterTest");
}	

@AfterMethod
public void test4(){
	System.out.println("AfterMethod");
}	
@BeforeMethod
public void test5(){
	System.out.println("BeforeMethod");
}	
@AfterClass
public void test6(){
	System.out.println("AfterClass");
}	
@BeforeClass
public void test7(){
	System.out.println("BeforeClass");
}	

@BeforeSuite
public void test8(){
	System.out.println("BeforeSuite");
}	

@AfterSuite
public void test9(){
	System.out.println("AfterSuite");
}	



}
