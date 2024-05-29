package com.mavenpractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class windowsHandles extends launchVApage {
	
	@Test
	public void privacylinkStatement() throws Exception {
		
		Thread.sleep(4000);
		String VAprivacylink = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy Statement")).click();;
		for(String redirectedprivacypage :driver.getWindowHandles()) {
		driver.switchTo().window(redirectedprivacypage);
		}
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(VAprivacylink);
		System.out.println("title: " +driver.getTitle());
	}

}
