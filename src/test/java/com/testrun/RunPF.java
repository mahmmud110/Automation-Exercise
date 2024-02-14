package com.testrun;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pagefactory.MasterPageFactory;
import com.utility.ConfigProperties;

public  class RunPF {
		
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		RunPF obj= new RunPF();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);

		driver.get(ConfigProperties.getValue("URL"));
		driver.manage().window().maximize();

		mpf.getSignin().click();
		mpf.getEmail().sendKeys(ConfigProperties.getValue("Email"));
		mpf.getPassword().sendKeys(ConfigProperties.getValue("Password"));
		mpf.getLogin().click();
		
	}

	}

