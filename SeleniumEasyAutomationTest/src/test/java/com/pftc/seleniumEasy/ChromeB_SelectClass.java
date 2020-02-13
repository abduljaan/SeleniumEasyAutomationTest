package com.pftc.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import gherkin.lexer.Id;

public class ChromeB_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
		driver.get("https://www.facebook.com");
		System.out.println("Currnet title of the page "+driver.getTitle());
		driver.findElement(By.id("u_0_f")).sendKeys("aj kam nhi ha");
		driver.findElement(By.id("u_0_h")).sendKeys("ghr ga yr");
		
		driver.findElement(By.name("birthday_month"));
		WebElement month =driver.findElement(By.name("birthday_month"));
		Select slect = new Select(month);
		//slect.selectByValue("Mar");
		Thread.sleep(3000);
		slect.selectByIndex(8);
		Thread.sleep(3000);
		slect.selectByVisibleText("Oct");
		driver.findElement(By.name("birthday_day"));
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select slect2 = new Select(day);
		slect2.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select slect21 = new Select(year);
		slect21.selectByIndex(10);
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
	
		
		//slect.selectByIndex(5);
		
		//driver.close();
		
		
		
	}

}
