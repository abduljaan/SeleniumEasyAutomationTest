package com.pftc.seleniumEasy.PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		prop = new Properties();

		try {
			FileInputStream file = new FileInputStream("config.properties");
			prop.load(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static WebDriver initializationBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome") || (browser.equalsIgnoreCase("ch"))) {
			System.setProperty("webdriver.driver.chrome", "src/test/resources/drivers/chromedriver1.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox") || (browser.equalsIgnoreCase("ff"))) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("InternetExplorer") || (browser.equalsIgnoreCase("IE"))) {
			System.setProperty("webdriver.InternetExplorer.driver", "src/test/resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			return driver;

		}

	}


