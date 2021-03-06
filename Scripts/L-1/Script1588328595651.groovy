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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Sprawdzam, czy po wejściu na stronę główną aplikacji wyświetla się formularz do logowania

WebUI.openBrowser('')

WebUI.navigateToUrl('http://kmg.hcm.pl/testowanie/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Nazwa użytkownika'), 'Iza')

WebUI.sendKeys(findTestObject('Hasło'), 'ilabunko')

WebUI.click(findTestObject('Button Login'))

//Weryfikuję czy zalogowany użytkownik po wylogowaniu otrzymuje widok formularza logowania. Poprawne logowanie jest zweryfikowane widokiem Historii rozmów, zdefiniowanym przez element na stronie

WebUI.verifyElementVisible(findTestObject('Historia rozmów'))

WebUI.click(findTestObject('Wyloguj'))

WebUI.verifyElementVisible(findTestObject('Button Login'))

WebUI.closeBrowser()

