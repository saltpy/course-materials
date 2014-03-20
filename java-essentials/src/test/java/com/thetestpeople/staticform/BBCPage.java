package com.thetestpeople.staticform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCPage {
	private final WebDriver webDriver;

	public BBCPage(WebDriver webDriver) {

		this.webDriver = webDriver;
	}

	public BBCPage() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:8080");
	}

	public void quit() {
		webDriver.quit();
	}

	public boolean checkUrl(String bbcUrl) {
		if (webDriver.getCurrentUrl() == bbcUrl)
			return true;
		return false;
	}

	
}
