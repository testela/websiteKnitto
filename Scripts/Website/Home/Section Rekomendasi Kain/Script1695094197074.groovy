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

WebUI.scrollToElement(findTestObject('Home/Section Rekomendasi Kain/section_rekomendasi_kain'), 2)

WebUI.comment('Click Button Jenis Pakaian\'')

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/button_casual'))

WebUI.delay(2)

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/button_modest'))

WebUI.delay(2)

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/button_polo'))

WebUI.delay(2)

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/button_jacket'))

WebUI.delay(2)

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/button_casual'))

WebUI.comment('Click Link Jenis Kain')

WebUI.click(findTestObject('Home/Section Rekomendasi Kain/a_cotton_combed'))

WebUI.click(findTestObject('Navbar/menu_home'))

WebUI.scrollToElement(findTestObject('Home/Section Rekomendasi Kain/section_rekomendasi_kain'), 2)

WebUI.takeScreenshot('screenshoot/home/section_rekomendasi_kain.png')

WebUI.closeBrowser()

