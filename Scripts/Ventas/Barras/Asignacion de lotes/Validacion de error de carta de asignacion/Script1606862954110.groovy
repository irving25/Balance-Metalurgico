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

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Ventas'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Barras'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Asignacin de Lotes'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Carta Asignacin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/select_Seleccionar UnidadLa ParrillaLa Enca_c3bc0c'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/input_De_Fecha'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/div_4'))

WebUI.click(findTestObject('Object Repository/Ventas/Barras/Asignacion de lotes/Carta asignacion/button_Consultar'))

WebUI.waitForElementPresent(findTestObject('Error'), 2)

WebUI.closeBrowser()

