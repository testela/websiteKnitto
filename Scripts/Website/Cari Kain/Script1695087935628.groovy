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

WebUI.navigateToUrl(GlobalVariable.BASE_URL)

WebUI.callTestCase(findTestCase('Website/Handle Popup with local storage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navbar/button_pencarian'))

WebUI.setText(findTestObject('ModalPencarianKain/input_cari_kain'), 'cvc')

WebUI.delay(4)

WebUI.sendKeys(findTestObject('body'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('body'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('body'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.takeScreenshot('screenshoot/Cari-Kain.png')

WebUI.closeBrowser()

