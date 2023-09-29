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
import com.kms.katalon.core.testobject.ResponseObject


TestObject generateKey = findTestObject('Object Repository/API Object/POSTLog')

// Send the Web Service request and capture the response
ResponseObject response = WS.sendRequest(generateKey)

// Store the entire response body into a variable
String responseBody = response.getResponseBodyContent()

// Parse the JSON response (adjust this based on your response format)
def jsonResponse = new groovy.json.JsonSlurper().parseText(responseBody)

// Extract the object (replace 'objectToExtract' with the name of the object you want)
def values = jsonResponse.values

// Extract the specific key from the object (replace 'keyToExtract' with the key you want)
String keyS = values.secretkey
// Print or log the extracted key for verification

// Store the extracted key as a global variable
GlobalVariable.keyS = keyS

// Access the global variable and use its value
String keySecret = GlobalVariable.keyS

println("Key to Extract: ${keySecret}")
