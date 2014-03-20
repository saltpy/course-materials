package com.thetestpeople.staticform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	private final WebDriver webDriver;

	private final By firstNameSelector = By.cssSelector("input[name=fname]");
	private final By lastNameSelector = By.cssSelector("input[name=lname]");
	private final By passwordSelector = By.cssSelector("input[name=password]");
	private final By submitFormSelector = By.cssSelector("input[type=submit]");

	private final By headingSelector = By.cssSelector("h1");
	private final By paraParagraphSelector = By.cssSelector("#para");
	private final By firstItalicText = By.cssSelector("p > span > em");
	private final By firstStrongText = By.cssSelector("strong.emphasize");
	private final By italicText = By.cssSelector("body > div > span > em");

	public Homepage(WebDriver webDriver) {
		if (!"Title!".equals(webDriver.getTitle())) {
			throw new IllegalStateException("Driver on incorrect page");
		}
		this.webDriver = webDriver;
	}

	public Homepage() {
		webDriver = new ChromeDriver();
		webDriver.get("http://localhost:8080");
	}

	public void quit() {
		webDriver.quit();
	}

	public Homepage enterFirstName(CharSequence firstName) {
		webDriver.findElement(firstNameSelector).sendKeys(firstName);
		return this;
	}

	public Homepage enterLastName(CharSequence lastName) {
		webDriver.findElement(lastNameSelector).sendKeys(lastName);
		return this;
	}

	public Homepage enterPassword(CharSequence password) {
		webDriver.findElement(passwordSelector).sendKeys(password);
		return this;
	}

	public Homepage submitForm() {
		webDriver.findElement(submitFormSelector).submit();
		return this;
	}

	public Homepage fillAndSubmitForm(CharSequence firstName,
			CharSequence lastName, CharSequence password) {
		return enterFirstName(firstName).enterLastName(lastName)
				.enterPassword(password).submitForm();
	}

	public void getLinkWithHref(String href) {
		webDriver.findElement(By.linkText("A link")).click();

	}

	public Homepage getImageWithSrc(String src) {
		for (WebElement el : webDriver.findElements(By.cssSelector("img"))) {
			if (el.getAttribute("src").equals(src)) {
				return this;
			}
		}
		throw new AssertionError("No image found with src " + src);
	}

	public boolean checkElementText(String expectedText, By selector) {
		String actualText = webDriver.findElement(selector).getText();
		if (expectedText.equals(actualText)) {
			return true;
		}
		return false;
	}

	public By getFirstNameSelector() {
		return firstNameSelector;
	}

	public By getLastNameSelector() {
		return lastNameSelector;
	}

	public By getPasswordSelector() {
		return passwordSelector;
	}

	public By getSubmitFormSelector() {
		return submitFormSelector;
	}

	public By getHeadingSelector() {
		return headingSelector;
	}

	public By getParaParagraphSelector() {
		return paraParagraphSelector;
	}

	public By getFirstItalicText() {
		return firstItalicText;
	}

	public By getStrongText() {
		return firstStrongText;
	}

	public By checkItalicText() {
		return italicText;
	}

}
