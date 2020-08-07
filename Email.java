package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Email {
	public static final String SIGN_IN_EMAIL = "//input[@id='i0116']";
	public static final String SIGN_IN_PASS = "/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]";
	public static final String SIGN_IN1 = "/html[1]/body[1]/header[1]/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]";
	public static final String NEXT="//input[@id='idSIButton9']";
	public static final String SIGN_IN2="/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]";
	public static final String NEW_MSG="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/span[1]/span[1]";
	public static final String TO_BUTTON="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
	public static final String SUBJECT_BUTTON="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]";
	public static final String MSG_BUTTON="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]";
	public static final String SEND_BUTTON="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/button[1]/span[1]/span[1]/span[1]";
	public static final String OUTLOOK_TEXT="//input[@placeholder='Search']";
	public static final String NK="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]";
	public static final String SO="//a[@id='meControlSignoutLink']";
	public static final String SIGN_IN_AGAIN="//span[@class='mectrlname mectrlsignin']";
	public static final String OUTLOOK="//h3[contains(text(),'Outlook.com')]";
	public static final String LISTA="/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]";
	
	public static void clickEmail(WebDriver driver) {
	List<WebElement> a = driver.findElements(By.xpath("//div[@class='_2CTEj85tM6HtPskWwBc8l2']//div[@class='laGnUXZu6QC88ONZDEBcE']//div[@class='laGnUXZu6QC88ONZDEBcE']"));
	            for(int i=0;i<a.size();i++){
	                System.out.println(a.get(i).getText());
	                if(a.get(i).getText().equals("Natasa Koncarevic"))
	                    a.get(i).click();
	                break;
	                }
	            }
	
	
	public static void inputEmail(WebDriver driver, String data) {
	driver.findElement(By.xpath(SIGN_IN_EMAIL)).sendKeys(data);
	}

	public static void inputPassword(WebDriver driver, String data) {
		driver.findElement(By.xpath(NEXT)).click();
		driver.findElement(By.xpath(SIGN_IN_PASS)).sendKeys(data);
	}

	public static void clickSignIn1(WebDriver driver) {
		driver.findElement(By.xpath(SIGN_IN1)).click();

	}
	public static void clickSignIn2(WebDriver driver) {
		driver.findElement(By.xpath(SIGN_IN2)).click();

	}
	public static void clickNewMsg(WebDriver driver) {
		driver.findElement(By.id("id__3")).click();

}
	public static void inputMsgFieldTo(WebDriver driver, String data) {
		driver.findElement(By.xpath(TO_BUTTON)).sendKeys(data);
	}
	public static void inputMsgFieldSubject(WebDriver driver, String data) {
		driver.findElement(By.xpath(SUBJECT_BUTTON)).sendKeys(data);
	}
	public static void inputMsgFieldMsg(WebDriver driver, String data) {
		driver.findElement(By.xpath(MSG_BUTTON)).sendKeys(data);
	}
	public static void clickSend(WebDriver driver) {
		driver.findElement(By.xpath(SEND_BUTTON)).click();
	}
	public static WebElement outlook(WebDriver driver) {
			return driver.findElement(By.xpath(OUTLOOK_TEXT));
	}
	public static void clickNK(WebDriver driver) {
		driver.findElement(By.xpath(NK)).click();
}
	public static void clickSO(WebDriver driver) {
		driver.findElement(By.xpath(SO)).click();
	}
		
			public static void clickSign(WebDriver driver) {
				driver.findElement(By.xpath(SIGN_IN_AGAIN)).click();
}
public static void clickOutlook(WebDriver driver){
	driver.findElement(By.xpath(OUTLOOK)).click();
}	
public static WebElement listaEmailova(WebDriver driver) {
	return driver.findElement(By.xpath(LISTA));
}				
			}
