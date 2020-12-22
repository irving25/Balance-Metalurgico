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

WebUI.callTestCase(findTestCase('Login/Log-in'), [('unidad') : 'San Dimas'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Embarques'))

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Barras'))

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Produccin'))

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Embarque'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Embarques/Barras/Embarque/select_Seleccionar DestinoMet Mex Peoles Sa_1d48ae'), 
    'Met Mex Peñoles S.a. De C.v.', true)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/input_Fecha_Fecha'))

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/div_18'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Embarques/Barras/Embarque/select_Seleccionar TransportistaUshipAusenc_0612e0'), 
    'Ausenco', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Embarques/Barras/Embarque/select_Seleccionar VehculoCamion'), 
    'Camion', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Embarques/Barras/Embarque/select_Seleccionar Operador de TrailerIsaac_a6cf9c'), 
    'Isaac Abdiel Perez Gamiz', true)

WebUI.setText(findTestObject('Object Repository/Embarques/Barras/Embarque/input_No Guia 1_appearance-none block w-ful_002b2b'), 
    '564798465')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Embarques/Barras/Embarque/select_Seleccionar No de LoteLP-12MP  01-03_32d1a9'), 
    'LP-12-02', true)

WebUI.selectOptionByLabel(findTestObject('Embarques/Barras/Embarque/select_Seleccionar PartePrincipioTodo'), 'Todo', true)

WebUI.click(findTestObject('Embarques/Barras/Embarque/button_Seleccionar'))

WebUI.setText(findTestObject('Object Repository/Embarques/Barras/Embarque/input_Hora De Salida_time'), '1200PM')

WebUI.scrollToElement(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Generar Aviso'), 1)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Generar Aviso'))

WebUI.scrollToElement(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Descargar'), 1)

WebUI.click(findTestObject('Object Repository/Embarques/Barras/Embarque/button_Descargar'))

