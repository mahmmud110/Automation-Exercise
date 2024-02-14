package pack.highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBroder {
	
	public void getBorder() {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.automationexercise.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();


		WebElement email=driver.findElement(By.xpath("(//*[@name='email'])[1]"));
		email.sendKeys("mahmud110@gmail.com");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid yellow'", email);

		WebElement password = driver.findElement(By.xpath("(//*[@name='password'])"));
		password.sendKeys("jamuna101");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].style.border='3px solid pink'", password);

		WebElement login=driver.findElement(By.xpath("//*[@class='btn btn-default']"));
		login.click(); JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("arguments[0].style.border='4xp solid green'",login);

	}

}
