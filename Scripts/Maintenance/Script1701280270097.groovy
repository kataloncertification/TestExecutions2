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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
WebUI.waitForPageLoad(100)
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_username'), 100)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_OrangeHRM/button_Login'), 50)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Maintenance'))
WebUI.waitForPageLoad(100)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Confirm'))
WebUI.waitForPageLoad(100)
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Maintenance/Page_OrangeHRM/input'), 'rrr')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/form_Past EmployeeInvalid  Required Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/span_Invalid'), 'Invalid')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/span_Invalid'), 0)
WebUI.closeBrowser()
