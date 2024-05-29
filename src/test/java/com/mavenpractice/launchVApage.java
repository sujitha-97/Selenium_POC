package com.mavenpractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class launchVApage  {
	
	WebDriver driver = new ChromeDriver();
	@Parameters("url")
	@Test
	public void Vapage(String url) throws Exception
	{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
	}
	
	@Parameters("intent")
	@Test
	public void Textarea(String intent) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Type your question here.']")).sendKeys(intent);
		driver.findElement(By.xpath("//button[@id='send-button']")).click();

	}
}
