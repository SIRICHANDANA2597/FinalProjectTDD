package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	 WebDriver driver;
	    String title;
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[ @name='title'] ")).sendKeys("blogging");
      
     
      title = driver.getTitle();
     
      System.out.println("Title = "+title);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
      driver= new FirefoxDriver();
      driver.get("http://18.136.172.133:8090/BloggingApplication-0.0.1-SNAPSHOT/");
  }

  @AfterTest
  public void afterTest() {
  }

}
