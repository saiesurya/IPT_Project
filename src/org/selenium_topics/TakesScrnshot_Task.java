package org.selenium_topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScrnshot_Task {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("Renu");
		WebElement Paswd = driver.findElement(By.xpath("//input[@name='password']"));
		Paswd.sendKeys("Ri230@#");
		WebElement ConfirmPswd = driver.findElement(By.xpath("//input[@name='re_password']"));
		ConfirmPswd.sendKeys("Ri230@#");
		WebElement FullName = driver.findElement(By.xpath("//input[contains(@id,'full')]"));
		FullName.sendKeys("Renuga");
		WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		Email.sendKeys("Rithu@yahoo.com");
		
//		--> TakesScreenshot
//		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		WebElement ParticularSnap = driver.findElement(By.xpath("//img[@class='logo']"));
		File source = ParticularSnap.getScreenshotAs(OutputType.FILE);
	    File Location = new File("C:\\Users\\saies\\eclipse-workspace\\Selenium_Concepts\\Images\\Testsnap.png");
	    FileHandler.copy(source, Location);
	    
	   
	}

}
