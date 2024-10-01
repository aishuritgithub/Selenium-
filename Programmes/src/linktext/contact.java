package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/");
driver.manage().window().maximize();

WebElement contact = driver.findElement(By.linkText("CONTACT"));
contact.click();
	}

}
