package TestCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyOrderCreation {

	
@Test
public void test()
{
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.pippintitle.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id='Email_Address']")).sendKeys("pippintitle_demotest@mailinator.com");
	driver.findElement(By.xpath("//*[@id='User_Password']")).sendKeys("DemoTest#567#");
	
	driver.findElement(By.xpath("//*[@id='loginBtnLogin']")).click();
	
	driver.findElement(By.xpath("//*[contains(text(),'Place Order')]")).click();
	
	driver.findElement(By.xpath("//*[contains(text(),'Full Search')]")).click();
	
	driver.findElement(By.xpath("//*[@placeholder='Owner/Seller']")).sendKeys("Ravi");
	
	driver.findElement(By.xpath("//*[@id='search-box']")).sendKeys("3485 Wineville");
	driver.findElement(By.xpath("//*[@id='Property_Order_Number']")).sendKeys("RavikumarSD 14/07/1976");
	
	driver.findElement(By.xpath("//*[@id='search-box']")).sendKeys(Keys.SHIFT);
	driver.findElement(By.xpath("//*[@id='search-box']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//*[@id='search-box']")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//*[@id='search-box']")).sendKeys(Keys.ENTER);	
	
	

	driver.findElement(By.xpath("//*[contains(text(),'Upload Documents')]")).click();
	Robot robot;
	try {
		robot = new Robot();
	
	
		 StringSelection file1 = new StringSelection("C:\\Users\\User\\Selenium - 1.pptx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);

	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    // Robot robot = new Robot();
	     robot.delay(5000);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     robot.delay(10000);
	     robot.keyPress(KeyEvent.VK_TAB);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_TAB);
	
	driver.findElement(By.xpath("//*[contains(text(),'Upload Documents')]")).click();

	
		 StringSelection file2 = new StringSelection("C:\\Users\\User\\Selenium - 2.pptx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file2, null);

	     
	     robot.delay(10000);

	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);

	     robot.delay(8000);
	
	     robot.keyPress(KeyEvent.VK_TAB);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_TAB);
	     robot.delay(8000);
	driver.findElement(By.xpath("//*[contains(text(),'Upload Documents')]")).click();

	
	
	
		 StringSelection file3 = new StringSelection("C:\\Users\\User\\Selenium - 3.pptx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file3, null);

	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     
	     robot.delay(5000);

	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);

	     robot.delay(10000);
	     robot.keyPress(KeyEvent.VK_TAB);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_TAB);
	     robot.delay(8000);
		     
	} catch (AWTException e) {

		e.printStackTrace();
	}
	driver.findElement(By.xpath("(//i[contains(text(),'delete')])[1]")).click();
//	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id='conOk']")).click();
	
	driver.findElement(By.xpath("(//i[contains(text(),'delete')])[2]")).click();
//	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id='conOk']")).click();
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)");
    js.executeScript("window.scrollBy(0,1000)");
    js.executeScript("window.scrollBy(0,1000)");
	
    driver.findElement(By.xpath("//*[contains(text(),'Total')]")).click();

  //  driver.findElement(By.xpath("//*[contains(text(),'Total')]")).sendKeys(Keys.TAB);
    
	driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();

	
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	
	String OrderNum = driver.findElement(By.xpath("//*[@id='Order_ID']")).getAttribute("ng-reflect-value");
			
	System.out.println(OrderNum);
	driver.findElement(By.xpath("//*[@id='ordDetBtnSendMsg']")).click();
	
	driver.findElement(By.xpath("//*[@id='msg-area']")).sendKeys("Ravi"+OrderNum);
	
	driver.findElement(By.xpath("//*[@id='msgSend']")).click();
	
	driver.findElement(By.xpath("//*[@icon='arrow_drop_down']")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
	
	
}
}
