package aaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");

WebElement user = driver.findElement(By.id("user-name"));
user.sendKeys("standard_user");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("secret_sauce");
WebElement login = driver.findElement(By.id("login-button"));
login.click();
	

}
}