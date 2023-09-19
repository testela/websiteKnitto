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

WebUI.callTestCase(findTestCase('Website/Handle Popup dengan Pindah Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Home/Section Warna Baru/h2_warna_baru'), 2)

WebUI.click(findTestObject('Home/Section Warna Baru/button_next'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_next'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_next'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_next'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_next'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_previous'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_previous'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_previous'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_previous'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_previous'))

WebUI.click(findTestObject('Home/Section Warna Baru/button_beli'))

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Warna Baru/section_warna_baru'), 2)

WebUI.click(findTestObject('Home/Section Warna Baru/button_sample_gratis'))

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Warna Baru/section_warna_baru'), 2)

WebUI.click(findTestObject('Home/Section Warna Baru/a_lihat_semua_koleksi'))

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Warna Baru/h2_warna_baru'), 2)

WebUI.takeScreenshot('screenshoot/home/section_warna_baru.png')

WebUI.delay(2)

WebUI.closeBrowser()

