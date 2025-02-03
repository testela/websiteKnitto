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

WebUI.callTestCase(findTestCase('API/Get Link Untuk Login Portal'), [:], FailureHandling.STOP_ON_FAILURE)

link_belanja_portal = GlobalVariable.linkP

WebUI.openBrowser('')

WebUI.navigateToUrl(link_belanja_portal)

WebUI.click(findTestObject('Portal/Menu/menu_order_kain'))

WebUI.verifyElementPresent(findTestObject('Portal/Popup Panduan Belanja/popup_panduan_belanja'), 10)

if (false) {
    WebUI.refresh()
} else {
    WebUI.click(findTestObject('Portal/Popup Panduan Belanja/btn_lewati'))
}

WebUI.click(findTestObject('Portal/Kain/Kategori Kain/div_printing'))

WebUI.click(findTestObject('Portal/Kain/Sub Kategori/btn_animal_series'))

WebUI.click(findTestObject('Portal/Kain/Warna/btn_animalSeries_koala_winterBlue'))

WebUI.click(findTestObject('Portal/Page Detail Kain/option_roll'))

WebUI.setText(findTestObject('Portal/Page Detail Kain/input_roll'), '1')

WebUI.click(findTestObject('Portal/Page Detail Kain/btn_beli'))

WebUI.takeScreenshot('screenshoot/portal/data_order_dikirim_ekspedisi.png')

WebUI.click(findTestObject('Portal/Page Cart/btn_opsi_pengiriman'))

WebUI.click(findTestObject('Portal/Page Checkout/btn_pilih_ekspedisi'))

WebUI.click(findTestObject('Portal/Page Checkout/btn_bandung_express'))

WebUI.click(findTestObject('Portal/Page Checkout/btn_checkout'))

WebUI.verifyElementPresent(findTestObject('Portal/Page Checkout/h6_terimakasih'), 5)

WebUI.takeScreenshot('screenshoot/portal/portal_berhasil_checkout_dikirim_ekspedisi.png')

WebUI.takeScreenshotAsCheckpoint('Portal Berhasil Checkout - Dikirim Ekspedisi')

WebUI.closeBrowser()

