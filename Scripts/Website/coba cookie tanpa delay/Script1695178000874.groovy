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

WebUI.executeJavaScript('return window.localStorage.setItem("AlreadyVisited","1")', null)

WebUI.executeJavaScript('return window.localStorage.setItem("CookieConsent","1")', null)

WebUI.refresh()

WebUI.mouseOver(findTestObject('Navbar/menu_home'))

WebUI.verifyElementPresent(findTestObject('ModalDownloadE-Catalog/test_modal_ecatalog'), 5)

if (false) {
    WebUI.refresh()
} else if (true) {
    WebUI.click(findTestObject('ModalDownloadE-Catalog/test_button_x'))
}

WebUI.verifyElementPresent(findTestObject('ModalCookies/test_modal_cookies'), 5)

if (false) {
} else if (true) {
    WebUI.click(findTestObject('ModalCookies/test_button-cookie_x'))
}

