package PartialLinktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/");
driver.manage().window().maximize();

WebElement sign = driver.findElement(By.partialLinkText("SIGN"));
sign.click();

WebElement user = driver.findElement(By.name("userName"));
user.sendKeys("Anu");
WebElement pass = driver.findElement(By.name("password"));
pass.sendKeys("anu@123");
WebElement submit = driver.findElement(By.name("submit"));
submit.click();

	}

}