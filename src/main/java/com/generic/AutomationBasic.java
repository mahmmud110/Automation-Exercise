package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationBasic {

	public static void Clicklogin(){
		
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://automationexercise.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		  driver.findElement(By.name("email")).sendKeys("mahmud110@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("jamuna101");
		  driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		  driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		  driver.close();
	

	}

}
