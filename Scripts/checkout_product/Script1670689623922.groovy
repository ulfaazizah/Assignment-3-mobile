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

//Mobile.startApplication('D:\\Training Katalon\\Assignment 3 - Mobile\\apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', true)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 
    0)

Mobile.waitForElementPresent(findTestObject('Object Repository/checkout_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - 400 USD'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.TextView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/checkout_product/android.widget.TextView - Shopping Cart'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Shopping Cart'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black (2)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Total  440 USD'), 
    0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/checkout_product/android.widget.TextView - Checkout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText - Your Name'), 'ulfa azizah', 
    0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText - your.emailgmail.com'), 'ulfa@mailsac.com', 
    0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText - 628123456789'), '089366483655', 
    0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText - Your Address'), 'tebet', 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.CheckedTextView - COD (Cash On Delivery)'), 
    0)

Mobile.setText(findTestObject('Object Repository/checkout_product/android.widget.EditText - Comment (1)'), 'good product', 
    0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/checkout_product/android.widget.TextView - Process Checkout'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - Process Checkout'), 
    0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - YES'), 0)

Mobile.waitForElementPresent(findTestObject('checkout_product/android.widget.TextView - Congratulation'), 0)

Mobile.verifyElementExist(findTestObject('checkout_product/android.widget.TextView - Congratulation'), 0)

Mobile.tap(findTestObject('Object Repository/checkout_product/android.widget.Button - OK'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/checkout_product/android.widget.TextView - E-Commerce Android App'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/checkout_product/android.widget.TextView - E-Commerce Android App'), 
    0)

Mobile.closeApplication()

