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
Mobile.tap(findTestObject('Object Repository/category_product/android.widget.TextView - Category'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/category_product/android.widget.TextView - Category (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Category (1)'), 0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.TextView - Electronics  Gadgets'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/category_product/android.widget.TextView - Electronics  Gadgets (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Electronics  Gadgets (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Samsung Galaxy S10 - Black'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red'), 
    0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.TextView - Fashions'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/category_product/android.widget.TextView - Fashions (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Fashions (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Dolce and Gabbana Heels'), 
    0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.TextView - Baby Gear'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/category_product/android.widget.TextView - Baby Gear (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Baby Gear (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Hybrid Stroller Cabi Sport Rosse Gold'), 
    0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.TextView - Home  Furniture'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/category_product/android.widget.TextView - Home  Furniture (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/category_product/android.widget.TextView - Home  Furniture (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Bathroom Toilet Wall Shelves A289'), 
    0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('category_product/android.widget.TextView - Health  Sports'), 0)

Mobile.waitForElementPresent(findTestObject('category_product/android.widget.TextView - Health  Sports (1)'), 0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Health  Sports (1)'), 0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Electric Treadmill TL 650'), 0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('category_product/android.widget.TextView - Office  Industry'), 0)

Mobile.waitForElementPresent(findTestObject('category_product/android.widget.TextView - Office  Industry (1)'), 0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Office  Industry (1)'), 0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Winsor  Newton Designers Gouache - Introductory Set'), 
    0)

Mobile.tap(findTestObject('Object Repository/category_product/android.widget.ImageButton'), 0)

Mobile.waitForElementPresent(findTestObject('category_product/android.widget.TextView - Category (1)'), 0)

Mobile.verifyElementExist(findTestObject('category_product/android.widget.TextView - Category (1)'), 0)

Mobile.tap(findTestObject('category_product/android.widget.TextView - Recent'), 0)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

