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

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/button_Start Shopping'))

WebUI.takeScreenshotAsCheckpoint('Shop Page')

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/img_add_PiggyBank'))

WebUI.setText(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/input_Contact_search-bar'), 'bath toys')

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/img_searchButton'))

WebUI.takeScreenshotAsCheckpoint('Search item ')

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/img_add_BathToys'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_JupiterPrime/a_My Cart'))

WebUI.takeScreenshotAsCheckpoint('My Cart')

WebUI.verifyElementPresent(findTestObject('Add to Cart/Page_JupiterPrime/div_Piggybank'), 0)

WebUI.verifyElementPresent(findTestObject('Add to Cart/Page_JupiterPrime/div_Bath Toys'), 0)

WebUI.closeBrowser()

