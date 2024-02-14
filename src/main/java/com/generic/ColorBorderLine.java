package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorBorderLine {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();

		WebElement email =driver.findElement(By.xpath("(//*[@name='email'])[1]"));
		email.sendKeys("mahmud110@gmail.com");

		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", email);


		WebElement password =driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("jamuna101");
		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		js1.executeScript("arguments[0].style.border='3px solid blue'", password);

		WebElement login = driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]"));
		login.click();
		JavascriptExecutor js2 =(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].style.border='3px solid black'", login);
		driver.quit();


	}

}
