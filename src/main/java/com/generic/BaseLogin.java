package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public void getLogin() {
		
		// Open the Browser
		WebDriver driver = new ChromeDriver();
		
		// Pass the URL	
		driver.navigate().to("https://automationexercise.com/"); 
		driver.manage().window().maximize();		
		
		//click on sign up /Login button on the home page
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		
		//Enter email in the email field
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("mahmud110@gmail.com");
		// Enter password in the password field		
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("jamuna101");
		
		//Click on Login button in the login page
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		
		// print in the console whether the login is successful or not
		if(driver.findElement(By.xpath("//i[@class='fa fa-lock']")).isDisplayed()) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}
		//Close the browser
		driver.close();




	}
}
