import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jupiterprime-react-dev.s3-website.us-east-2.amazonaws.com/')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Login'))

WebUI.takeScreenshotAsCheckpoint('Login dialog box')

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/div_Log InUsernamePasswordI agree to the terms of serviceCancelLog In'), 
    0)

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__username'), 'Test')

WebUI.setEncryptedText(findTestObject('Homepage/Page_JupiterPrime/input__password'), 'rFXAQJa7bf4=')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/input__agree'))

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Log In'))

WebUI.takeScreenshotAsCheckpoint('User login')

WebUI.waitForElementPresent(findTestObject('Homepage/Page_JupiterPrime/span_Hi Test'), 0)

String expectedUsername = 'Hi Test'

String actualUsername = WebUI.getText(findTestObject('Homepage/Page_JupiterPrime/span_Hi Test'))

if (actualUsername == expectedUsername) {
    //  println('User is logged in as expected user: ' + actualUsername)
    KeywordUtil.logInfo('User is logged in as expected user: ' + actualUsername //   println('User is not logged in as the expected user. Actual user: ' + actualUsername)
        )
} else {
    KeywordUtil.logInfo('User is not logged in as expected user: ' + actualUsername)
}

WebUI.closeBrowser()

