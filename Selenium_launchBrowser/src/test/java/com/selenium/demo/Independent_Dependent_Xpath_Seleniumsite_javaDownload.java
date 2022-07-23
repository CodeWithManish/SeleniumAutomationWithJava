package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload {
	
	@Test
	public void independentDependentXpathSeleniumsite_javaDownload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kmani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='Java']/..//a[='Download']")).click();
		
	}

}
