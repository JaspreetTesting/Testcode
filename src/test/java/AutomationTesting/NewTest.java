package AutomationTesting;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void Test_1() 
  {
	  System.out.println("Hey Jaspreet");  }
  @Test(priority=2)
  public void Test_2() {
	  System.out.println("Hey Shubham");
	 
  }
  @Test(priority=3)
  public void Test_3()
  {
	  System.out.println("Hey Sameer");
	  
  }
  @Test(priority=4)
  public void Test_4()
  {
	  System.out.println("Hey Kriti");
	 
  }
}
