package com.mavenpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplegooglepageload {
	
	
	public static void pageload() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://virtualagent.hpcloud.hp.com/");
		Thread.sleep(3000);
		driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		pageload();
	}

}
