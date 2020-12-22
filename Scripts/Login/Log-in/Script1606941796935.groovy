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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.selectOptionByLabel(findTestObject('Login/Unidad'), GlobalVariable.unidad, false)

WebUI.click(findTestObject('Login/button_Iniciar Sesion'))

WebUI.click(findTestObject('Login/button_fms-domain'))

WebUI.setText(findTestObject('Login/input_email'), 'iperez@firstmajestic.com')

WebUI.click(findTestObject('Login/button_next_email'))

WebUI.setEncryptedText(findTestObject('Login/input_password'), 'ykGCkDCd7AS2UCfUpOmvYw==')

WebUI.click(findTestObject('Login/button_next_pass'))

WebUI.click(findTestObject('Login/button_staySigned_yes'))

WebUI.verifyElementText(findTestObject('Login/div_Bienvenido a Balance Metalrgico Irving'), 'Bienvenido a Balance Metalúrgico: Irving')

