package org.selenium_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.amazon.com/");
		
		String title = drive.getTitle();
		System.out.println(title);
	
		String currentUrl = drive.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		drive.manage().window().maximize();		
		
		Thread.sleep(1000);
		
		drive.navigate().to("https://www.flipkart.com/");
		drive.navigate().back();
		drive.close();
		
		WebDriver drive1 = new FirefoxDriver();
		
		drive1.get("https://www.naukri.com/");
		
		String title2 = drive1.getTitle();
		System.out.println("Title2: "+title2);
		
		Thread.sleep(1000);
		
		drive1.navigate().to("https://in.indeed.com/");
		drive1.navigate().forward();
		drive1.navigate().refresh();
		drive1.quit();
				
	}
		
	}


