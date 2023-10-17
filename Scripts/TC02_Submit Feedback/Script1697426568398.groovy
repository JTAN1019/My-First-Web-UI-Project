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

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/a_Contact'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/div_We welcome your feedback - tell it how it is'), 
    0)

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__forename'), 'T')

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input_Surname_surname'), 'J')

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__email'), 'jtan@planittesting.com')

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/textarea_Test'), 'Test')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Submit'))

WebUI.closeBrowser()

