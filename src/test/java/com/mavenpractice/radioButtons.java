package com.mavenpractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class radioButtons extends launchVApage{
	
	@Test
	public void feedbackhighrating() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("botaction_feedback")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='csat' and @value='5']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='ces' and @value='4']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
		
	}

	@Test
	public void feedbacklowrating() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.id("botaction_feedback")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='csat' and @value='3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='ces' and @value='2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
	}
}
