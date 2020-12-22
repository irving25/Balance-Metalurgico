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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Ventas'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Barras'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Reporte de Barras'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/select_Seleccionar UnidadLa ParrillaLa Enca_c3bc0c'), 
    'La Parrilla', true)

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/input_De_Fecha'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/div_1'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Consultar'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/img_LP-26_object-contain flex justify-center'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Continuar'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/img_LP-26_object-contain flex justify-center'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Reporte de Barras/button_Continuar'))

WebUI.verifyTextPresent('Ha ocurrido un error de consulta.', false)

WebUI.closeBrowser()

