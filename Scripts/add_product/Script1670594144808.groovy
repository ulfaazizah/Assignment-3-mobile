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

//Mobile.startApplication('D:\\Training Katalon\\Assignment2_ulfaazizah\\apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', true)
Mobile.tap(findTestObject('Object Repository/add_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 
    0)

Mobile.verifyElementExist(findTestObject('add_product/android.widget.TextView - 400 USD'), 0)

Mobile.verifyElementExist(findTestObject('add_product/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('add_product/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/add_product/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Object Repository/add_product/android.widget.Button - ADD'), 0)

Mobile.verifyElementExist(findTestObject('add_product/android.widget.TextView - Apple watch series 3 GPS 42mm Black (1)'), 
    0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

