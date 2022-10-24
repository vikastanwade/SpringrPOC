package TestTask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://meralda.scalenext.io/user/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		FirstName.sendKeys("Vikas");
		WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		LastName.sendKeys("Tanwade");
		WebElement Email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		Email.sendKeys("vikastanwade07@.com");
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='mobile']"));
		Mobile.sendKeys("9403137473");

		driver.findElement(By.xpath("//i[@class='mx-icon-calendar']")).click();
		List<WebElement> DateList = driver.findElements(By.xpath("//td[@class='cell']"));
		for (int i = 0; i < DateList.size(); i++) {

			if (DateList.get(i).getText().equals("26")) {
				DateList.get(i).click();
				break;
			} else {
				System.out.println("26/05/1997");
			}
		}

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Vikas@2022");

		WebElement confPassword = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
		confPassword.sendKeys("Vikas@2022");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}

}
