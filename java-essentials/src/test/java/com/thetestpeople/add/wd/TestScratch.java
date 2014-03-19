package com.thetestpeople.add.wd;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScratch {
	@Test
	public void test() throws InterruptedException {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("http://www.google.com/");
		webDriver.wait(500);
	}
}
