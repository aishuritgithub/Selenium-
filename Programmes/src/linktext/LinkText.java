package linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.guru99.com/test/newtours/");
     driver.manage().window().maximize();
     
     WebElement Register = driver.findElement(By.linkText("REGISTER"));
     Register.click();
	}

}
