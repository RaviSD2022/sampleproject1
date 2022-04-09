package TestCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	     
	     robot.delay(8000);
	
	
	driver.findElement(By.xpath("//*[contains(text(),'Upload Documents')]")).click();

	
		 StringSelection file2 = new StringSelection("C:\\Users\\User\\Selenium - 2.pptx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file2, null);

	     
	     robot.delay(5000);

	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);

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
	
	driver.findElement(By.xpath("//*[@id='mat-checkbox-1-input']")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	
	String OrderNum = driver.findElement(By.xpath("//*[@id='Order_ID]")).getText();
	
	driver.findElement(By.xpath("//*[@id='ordDetBtnSendMsg']")).click();
	
	driver.findElement(By.xpath("//*[@id='msg-area']")).sendKeys("Ravi"+OrderNum);
	
	driver.findElement(By.xpath("//*[@id='msgSend')]")).click();
	
	driver.findElement(By.xpath("//*[@icon='arrow_drop_down']")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
	
	
	

	
	
	
	
	
	
	
	
	
}



	
	
	

}
