package org.selenium_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Task {
	
	void chromeBrowser() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Baby Toys");
		WebElement SearchBtn = driver.findElement(By.id("nav-search-submit-button"));
		SearchBtn.click();		
	}
	
	void firefoxBrowser() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("saiesurya23@gmail.com");
		WebElement Pswd = driver.findElement(By.name("pass"));
		Pswd.sendKeys("123456");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators_Task lt=new Locators_Task();
		lt.chromeBrowser();
		

	}

}
