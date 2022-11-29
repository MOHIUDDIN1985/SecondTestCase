package com.SecondTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//This test to automate demoqa site
//Change for mamun
public class LogInTest {
	WebDriver driver;
	@BeforeClass
	public void Initiation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	}
	
	@Test
	public void Login() throws InterruptedException{ {
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("text")).click();
		Thread.sleep(3000);
	}
	}
	@AfterClass
	public void Close() {	
		driver.quit();		
	}
}
