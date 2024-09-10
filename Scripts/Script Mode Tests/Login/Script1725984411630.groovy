/**
 * Class Summary:
 * This script automates a sequence of actions on the CURA Healthcare Service application using Katalon Studio.
 * It is designed to verify the login and logout functionalities of the sample web application. The script performs
 * browser operations and interacts with web elements to ensure the login process works correctly and the user 
 * can successfully log out.
 *
 * Purpose:
 * - Initialize Browser: Opens and maximizes the browser window for interaction.
 * - Navigate to Application: Directs the browser to the CURA Healthcare Service demo site.
 * - Login Process: Clicks through the menu to access the login page, inputs user credentials, and submits 
 *   the login form.
 * - Logout Process: Clicks through the menu to access the logout option and then logs out.
 * - Cleanup: Closes the browser session to clean up after the test.
 */

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Opens a new browser window. The empty string implies that it will use the default browser or URL.
WebUI.openBrowser('')

// Maximizes the browser window to occupy the full screen.
WebUI.maximizeWindow()

// Navigates to the specified URL (CURA Healthcare demo site).
WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")

// Clicks on the menu icon (hamburger menu) on the CURA Healthcare Service page.
WebUI.click(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

// Clicks on the "Login" link to access the login page.
WebUI.click(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/a_Login'))

// Enters the username "John Doe" into the username field.
WebUI.setText(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/input_Username_username'), "John Doe")

// Enters the password "ThisIsNotAPassword" into the password field.
WebUI.setText(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/input_Password_password'), "ThisIsNotAPassword")

// Clicks the "Login" button to submit the login form.
WebUI.click(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/button_Login'))

// Clicks the menu icon again to access a logout link.
WebUI.click(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

// Pauses the script for 2 seconds to wait for any potential page updates or loading times.
WebUI.delay(2)

// Clicks the "Logout" link to log out of the application.
WebUI.click(findTestObject('Object Repository/Scriptless Mocked Objects/Login/Page_CURA Healthcare Service/a_Logout'))

// Closes the browser window and ends the session.
WebUI.closeBrowser()
