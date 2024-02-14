package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGCount {

	WebDriver driver;

	@Test (invocationCount=2)
	public void newTestcount() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.name("email")).sendKeys("mahmud110@gmail.com");
		driver.findElement(By.name("password")).sendKeys("jamuna101");
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='fa fa-list'])[1]")).click();
		driver.close();

	}

	@Test
	public void myLogin() {

	
	}



}
