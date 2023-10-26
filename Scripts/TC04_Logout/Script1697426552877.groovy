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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jupiterprime-react-dev.s3-website.us-east-2.amazonaws.com/')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Login'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/div_Log InUsernamePasswordI agree to the terms of serviceCancelLog In'), 
    0)

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__username'), 'Test')

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__password'), 'letmein')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/span_I agree to the terms of service'))

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/span_Hi Test'), 0)

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Log Out'))

WebUI.takeScreenshotAsCheckpoint('Logout dialog box')

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/div_Are you sure that you want to logoutCancelYes'), 
    0)

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Yes'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/button_Login'), 0)

WebUI.takeScreenshotAsCheckpoint('After logout')

WebUI.closeBrowser()

