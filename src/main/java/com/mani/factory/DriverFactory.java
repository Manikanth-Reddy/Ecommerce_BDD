package com.mani.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;

	// to support for parallel execution of the feature
	// files we are using threadLocal concept of java

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver int_driver(String browser) {

		System.out.println("The browser is " + browser);

		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Manikanth\\Downloads\\chromedriver-win64\\chromedriver.exe");

			tlDriver.set(new ChromeDriver());

		} else if (browser.equals("firefox")) {

			tlDriver.set(new FirefoxDriver());

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();

			tlDriver.set(new EdgeDriver());
		} else {

			System.out.println("Please eneter the correct browser value");
		}

		return getDriver();

	}

	public static synchronized WebDriver getDriver() {

		return tlDriver.get();

	}
}
