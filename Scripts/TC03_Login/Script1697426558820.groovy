import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jupiterprime-react-dev.s3-website.us-east-2.amazonaws.com/')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Login'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/div_Log InUsernamePasswordI agree to the terms of serviceCancelLog In'), 
    0)

WebUI.setText(findTestObject('Homepage/Page_JupiterPrime/input__username'), 'Test')

WebUI.setEncryptedText(findTestObject('Homepage/Page_JupiterPrime/input__password'), 'rFXAQJa7bf4=')

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/input__agree'))

WebUI.click(findTestObject('Homepage/Page_JupiterPrime/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Homepage/Page_JupiterPrime/span_Hi Test'), 0)

String expectedUsername = 'Hi Test'

String actualUsername = WebUI.getText(findTestObject('Homepage/Page_JupiterPrime/span_Hi Test'))

if (actualUsername == expectedUsername) {
    //  println('User is logged in as expected user: ' + actualUsername)
    KeywordUtil.logInfo('User is logged in as expected user: ' + actualUsername) //   println('User is not logged in as the expected user. Actual user: ' + actualUsername)
} else {
    KeywordUtil.logInfo('User is not logged in as expected user: ' + actualUsername)
}

WebUI.closeBrowser()

