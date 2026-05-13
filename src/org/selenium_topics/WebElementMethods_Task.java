package org.selenium_topics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods_Task {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		
		WebElement SearchBar = driver.findElement(By.id("search_box"));
		boolean displayed = SearchBar.isDisplayed();
		
		if(displayed) {
			SearchBar.sendKeys("Baby gown");
		}
		else {
		    System.out.println("Searchbar is not displayed");
		}
		Thread.sleep(2000);
		SearchBar.clear();
		
		SearchBar.sendKeys("Kids toys");
		WebElement SchBtn = driver.findElement(By.xpath("//span[@class='search-button']"));
		boolean selected = SchBtn.isSelected();
		System.out.println("Searchbtn is selected: "+selected);
		
		boolean enabled = SchBtn.isEnabled();
		if(enabled) {
			SchBtn.click();
		}
		else {
			throw new Exception("Button is not enabled");
		}
		WebElement GetAttri = driver.findElement(By.xpath("//div[@class='se-re']"));
		@Nullable
		String attribute = GetAttri.getAttribute("class");
		System.out.println("Attribute name is: "+attribute);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
