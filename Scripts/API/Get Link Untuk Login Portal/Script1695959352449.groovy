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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject

//Scope To Project
WebUI.callTestCase(findTestCase('API/Get Key untuk Authorization'), [:], FailureHandling.STOP_ON_FAILURE)

TestObject generateKey = findTestObject('Object Repository/API Object/POSTLog')
TestObject getLinkPortal = findTestObject('Object Repository/API Object/GetLinkPortal')

ResponseObject requestKey = WS.sendRequest(generateKey)
ResponseObject requestLink = WS.sendRequest(getLinkPortal)

String resBody = requestLink.getResponseBodyContent()
def jsonRes = new groovy.json.JsonSlurper().parseText(resBody)
def link = jsonRes.values
String linkPortal = link

GlobalVariable.linkP = linkPortal



// Access the global variable and use its value
String link_portal = GlobalVariable.linkP

println("Key to Extract: ${link_portal}")
