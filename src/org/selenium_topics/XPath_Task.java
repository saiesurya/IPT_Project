package org.selenium_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		--> Using Basic Xpath
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		Name.sendKeys("Sharmila");
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder=\"Enter EMail\"]"));
		Email.sendKeys("sharmi@gmail.com");
		WebElement Phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
		Phone.sendKeys("8600234156");
//		--> Using Xpath Contains
		WebElement Address = driver.findElement(By.xpath("//textarea[contains(@id,'area')]"));
		Address.sendKeys("60, 2nd Street, Saidapet-600300");
		Thread.sleep(2000);
//		--> Using Xpath text & Contains
		WebElement Gender = driver.findElement(By.xpath("//label[contains(text(),'Fem')]"));
		Gender.click();		
		
	}

}
