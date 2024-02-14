package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLogin {
	
	public void getLogin(){
		
		// Open the browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
	// Pass the URL
		driver.navigate().to("https://automationexercise.com");
		
		// click on signIn/login button on the home page
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		// Enter email in the Email field
		//driver.findElement(By.xpath("//input[@name='email'])[1]")).sendKeys("mahmud110@gmail.com");
		driver.findElement(By.name("email")).sendKeys("mahmud110@gmail.com");
		  
		//Enter password in the Password field
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jamuna101");
		driver.findElement(By.name("password")).sendKeys("jamuna101");
		// Click login button in the login page
		//driver.findElement(By.xpath("(//button[@text()='login']")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		// click logout
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		// close
		driver.close();
	
		//driver.close();
		
		
		
	}
}
