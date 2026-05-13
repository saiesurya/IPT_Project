package org.selenium_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.myntra.com/");
		drive.manage().window().maximize();
		
	}

}
