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

WebUI.callTestCase(findTestCase('Login/Log-in'), [('unidad') : unidad], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/Consulta de Embarque/button_Embarques'))

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Produccion/Consulta de Embarque/button_Barras'))

WebUI.click(findTestObject('Embarques/Barras/Packing List/button_PackingList'))

WebUI.click(findTestObject('Embarques/Barras/Packing List/input_De_Fecha'))

WebUI.doubleClick(findTestObject('Embarques/Barras/Packing List/button_previusMonth'))

WebUI.click(findTestObject('Embarques/Barras/Packing List/div_1'))

WebUI.click(findTestObject('Embarques/Barras/Packing List/button_Consultar'))

WebUI.waitForElementPresent(findTestObject('Error'), 2)

WebUI.closeBrowser()

