package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyHomePageDisplayed {

	// using title of the page
	@Test
	public void expectedTitleResult() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kmani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manish@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("maniish123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(2000);
		String expectedTitle = "instagram";
		String actualTitle = driver.getTitle();
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}

	}

// using Current URL of the page
	@Test
	public void verifyhomepageUsingCurrentUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kmani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String expectedUrl = "https://www.instagram.com/";
		String actualcurrentUrl = driver.getCurrentUrl();
		System.out.println("the URL of the page is :" + actualcurrentUrl);
		Thread.sleep(3000);

		if (actualcurrentUrl.contains(expectedUrl)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}

	}

	//using any unique element on the page
	@Test
	public void verifyhomepageUsingUniqueElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kmani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manish@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("maniish123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		if (login.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}
	}

}