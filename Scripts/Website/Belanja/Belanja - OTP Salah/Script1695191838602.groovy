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

WebUI.click(findTestObject('Navbar/menu_belanja'))

WebUI.scrollToElement(findTestObject('Belanja/Shop/section_plain'), 2)

WebUI.mouseOver(findTestObject('Navbar/logo'))

WebUI.comment('Pilih Kategori Kain')

WebUI.click(findTestObject('Belanja/Shop/button_beli_cotton_combed'))

WebUI.comment('Pilih Sub Kategori Kain')

WebUI.click(findTestObject('Belanja/Cotton Combed/button_beli_20s'))

WebUI.comment('Pilih Warna')

WebUI.click(findTestObject('Belanja/Cotton Combed/20s/button_beli_20s_abu_tua'))

WebUI.comment('Cek Stok Kain')

WebUI.click(findTestObject('Belanja/Detail Kain/button_cek_stok'))

WebUI.comment('Mengisi Qty Body dan Rib')

WebUI.click(findTestObject('Belanja/Detail Kain/button_x_cekstok'))

WebUI.click(findTestObject('Belanja/Detail Kain/button_beli_kain'))

WebUI.click(findTestObject('Belanja/Detail Kain/option_roll'))

WebUI.click(findTestObject('Belanja/Detail Kain/option_kg'))

WebUI.setText(findTestObject('Belanja/Detail Kain/input_body'), '1')

WebUI.setText(findTestObject('Belanja/Detail Kain/input_rib'), '0.5')

WebUI.click(findTestObject('Belanja/Detail Kain/button_submit_beli'))

WebUI.comment('Tambah Katalog')

WebUI.click(findTestObject('Belanja/Keranjang/button_tambah_barang'))

WebUI.click(findTestObject('Belanja/Keranjang/tambah_katalog'))

WebUI.click(findTestObject('Katalog/button_beli_complete_catalog'))

WebUI.click(findTestObject('Katalog/button_beli_katalog'))

WebUI.click(findTestObject('Katalog/button_increment_katalog'))

WebUI.click(findTestObject('Katalog/button_beli_katalog_dipopup'))

WebUI.click(findTestObject('Belanja/Keranjang/button_pengiriman'))

WebUI.setText(findTestObject('Belanja/Keranjang/input_nomor_wa'), no_wa)

WebUI.click(findTestObject('Belanja/Keranjang/button_login'))

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_1'), '1')

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_2'), '2')

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_3'), '3')

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_4'), '4')

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_5'), '5')

WebUI.setText(findTestObject('Belanja/Keranjang/input_otp_6'), '6')

WebUI.click(findTestObject('Belanja/Keranjang/button_verifikasi'))

WebUI.verifyElementPresent(findTestObject('Belanja/Keranjang/p_pesan_kode_otp_salah'), 0)

WebUI.takeScreenshot('screenshoot/belanja/kode_otp_salah.png')

