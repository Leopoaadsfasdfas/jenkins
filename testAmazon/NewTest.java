package testAmazon;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }
  System.setProperty("webdriver.chrome.driver","./src/test/java/chromedriver/chromedriver90.exe");
  WebDriver driver=new ChromeDriver();
  System.out.println("Hi, welcome to edureka's Youtube live session on selenium webdriver");
  driver.navigate().to("https:/www.amazon.in");
  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  
  driver.findElement(By.id("twotabsearchtextbox")).sendkeys("nike shoues");
  
}
