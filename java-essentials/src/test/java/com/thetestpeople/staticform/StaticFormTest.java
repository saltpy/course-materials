package com.thetestpeople.staticform;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StaticFormTest {
	private Homepage homepage;

	@BeforeClass
	public static void startServer() throws Exception {
		StaticFormServer.start();
	}

	@AfterClass
	public static void stopServer() throws Exception {
		StaticFormServer.stop();
	}

	@Before
	public void setup() {
		homepage = new Homepage();
	}

	@After
	public void teardownAfterClass() {
		homepage.quit();
	}

	/* Find the h1 text and verify it is 'Heading' */
	@Test
	public void testHeadingText() {
		
		boolean returned = homepage.checkElementText("Heading", homepage.getHeadingSelector());
		assertTrue(returned);
	}

	/* Find the para text and verify it is 'I am a paragraph' */
	@Test
	public void testParagraphText() {
		assertTrue(homepage.checkElementText("I am a paragraph",
				homepage.getParaParagraphSelector()));
	}

	/* Verify that the ttp-logo is displayed */
	@Test
	public void testTTPLogoIsDisplayed() {
		homepage.getImageWithSrc("http://thetestpeople.com/images/ttponwhitelarge.gif");
	}

	/* Find the italic text in the first paragraph and verify it is 'within' */
	@Test
	public void testItalicTextInFirstParagraphIsWithin() {
		assertTrue(homepage.checkElementText("within", homepage.getFirstItalicText()));
		
	}

	/*
	 * Find the first link in the page and verify it goes to
	 * 'http://www.bbc.co.uk/'
	 */
	@Test
	public void testLinkGoesToBBC() {
		homepage.getLinkWithHref("http://www.bbc.co.uk/");
	}

	/*
	 * Fill out the form with suitable test data and submit the form and verify
	 * a success was returned
	 */
	@Test
	public void testFormFillingAndSuccessfulSubmission() {
		homepage.fillAndSubmitForm("Tommy", "Tester", "Password1");
	}
	
	@Test
	public void testStrongTag() {
		assertTrue(homepage.checkElementText("emphasized", homepage.getStrongText()));
	}
	
	@Test
	public void testItalicText() {
		assertTrue(homepage.checkElementText("again", homepage.checkItalicText()));
		
	}
	
}
