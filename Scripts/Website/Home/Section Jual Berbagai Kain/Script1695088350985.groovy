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

WebUI.callTestCase(findTestCase('Website/handle popup cookie berhasil'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Home/Section Jual Berbagai Kain/div_jual_berbagai_kain'), 5)

for (def index : (0..1)) {
    WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/button_next'))
}

for (def index : (0..1)) {
    WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/button_previous'))
}

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_premium'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_fancy'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_pique'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_terry'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_polyester'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_printing'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/tab_plain'))

WebUI.delay(1)

WebUI.click(findTestObject('Home/Section Jual Berbagai Kain/section_kain'))

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Jual Berbagai Kain/div_jual_berbagai_kain'), 5)

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Jual Berbagai Kain/div_jual_berbagai_kain'), 5)

WebUI.takeScreenshot('screenshoot/home/section_jual_berbagai_kain.png')

WebUI.closeBrowser()

