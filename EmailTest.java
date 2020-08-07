package AutomationPractiseTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import AutomationPractice.Email;
import AutomationPractice.Registration;

import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class EmailTest {
	WebDriver driver;
	public static final String REG_URL ="https://outlook.live.com/owa/";
	
	
  @BeforeClass
  public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natasa\\Desktop\\Snimci kurs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}
  @Test(priority = 1)
	public void navigateToRegPage() {
		driver.get(REG_URL);
		Assert.assertEquals(driver.getCurrentUrl(), REG_URL);
	}
  @Test(priority = 2)
 	public void signIn() {
	  SoftAssert sa = new SoftAssert();
 		Email.clickSignIn1(driver);
 		Email.inputEmail(driver, "");
 		Email.inputPassword(driver, "");
 		Email.clickSignIn2(driver);
 		sa.assertTrue(Email.outlook(driver).getText().contains("Search"));
 	}
  @Test(priority = 3)
	public void sendMsg() {
		/*Email.clickNewMsg(driver);
		Email.inputMsgFieldTo(driver, "natasakoncarevic@outlook.com");
		Email.inputMsgFieldSubject(driver, ":*");
		Email.inputMsgFieldMsg(driver, "Zdravo Todore!");
		Email.clickSend(driver);*/
		Email.clickNK(driver);
		Email.clickSO(driver);
	    Email.clickSign(driver);
 		Email.inputEmail(driver, "");
 		Email.inputPassword(driver, "");
 		Email.clickSignIn2(driver);
 		Email.clickOutlook(driver);
 		Email.clickEmail(driver);
	}

  

}
