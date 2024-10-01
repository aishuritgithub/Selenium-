package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
   driver.manage().window().maximize();
    
   WebElement name = driver.findElement(By.cssSelector("input[name^= 'name']"));
   name.sendKeys("Aiswarya");
   WebElement mail = driver.findElement(By.cssSelector("input[name^= 'login']"));
   mail.sendKeys("ais.2024");
   WebElement check = driver.findElement(By.cssSelector("input[ value ='Check availability']"));
   check.click();
   WebElement pass = driver.findElement(By.cssSelector("input[name^='passwd']"));
   pass.sendKeys("aish@121");
   WebElement copass = driver.findElement(By.cssSelector("input[name^='confirm_passwd']"));
   copass.sendKeys("aish@121");
   WebElement amail = driver.findElement(By.cssSelector("input[name^='altemail']"));
   amail.sendKeys("ais.2024");
   WebElement mobile = driver.findElement(By.cssSelector("input[name^='mobno']"));
   mobile.sendKeys("9087654321");
   WebElement dropdownd = driver.findElement(By.cssSelector("select[name^='DOB_Day']"));
   Select day = new Select(dropdownd);
   day.selectByVisibleText("1");
   WebElement dropdownm = driver.findElement(By.cssSelector("select[name^='DOB_Month']"));
   Select mon = new Select(dropdownm);
   mon.selectByVisibleText("October");
   WebElement dropdowny = driver.findElement(By.cssSelector("select[name^='DOB_Year']"));
   Select year = new Select(dropdowny);
   year.selectByVisibleText("2024");
   WebElement gender = driver.findElement(By.cssSelector("input[name^='gendereb']"));
   gender.click();
   
   
   
   
   
   
	}

}
