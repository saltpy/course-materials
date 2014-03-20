package com.thetestpeople.add.wd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thetestpeople.staticform.StaticFormServer;

public class TestScratch {
	private static WebDriver webDriver;
	
	@BeforeClass
	public static void setUpFixture() throws Exception {
		StaticFormServer.start();
	}
	
	@AfterClass
	public static void tearDownFixture() throws Exception {
		StaticFormServer.stop();
	}
	
	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	@Test
	public void testCanGetHomepage() {
		webDriver.get("http://localhost:8080");
	}
	
}
