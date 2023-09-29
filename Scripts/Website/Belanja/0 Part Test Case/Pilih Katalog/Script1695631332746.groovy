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

WebUI.comment('Tambah Katalog')

WebUI.click(findTestObject('Belanja/Keranjang/button_tambah_barang'))

WebUI.click(findTestObject('Belanja/Keranjang/tambah_katalog'))

WebUI.click(findTestObject('Katalog/button_beli_complete_catalog'))

WebUI.click(findTestObject('Katalog/button_beli_katalog'))

WebUI.click(findTestObject('Katalog/button_increment_katalog'))

WebUI.click(findTestObject('Katalog/button_beli_katalog_dipopup'))

WebUI.click(findTestObject('Belanja/Keranjang/button_edit_combed_20s_abutua'))

WebUI.setText(findTestObject('Belanja/Detail Kain/input_body'), '1.5')

WebUI.setText(findTestObject('Belanja/Detail Kain/input_rib'), '0.7')

WebUI.click(findTestObject('Belanja/Detail Kain/button_submit_beli'))

