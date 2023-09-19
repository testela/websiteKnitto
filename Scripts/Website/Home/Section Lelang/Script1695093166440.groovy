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

WebUI.callTestCase(findTestCase('Website/Handle Popup dengan Pindah Menu'), [('nama_kain') : 'COMBED 24S - BURGUNDY'], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Home/Section Lelang/section_lelang'), 2)

WebUI.click(findTestObject('Home/Section Lelang/button_cek_list_lelang'))

WebUI.click(findTestObject('Lelang/button_cari_lelang'))

WebUI.delay(3)

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Lelang/section_lelang'), 2)

WebUI.takeScreenshot('screenshoot/home/section_lelang.png')

