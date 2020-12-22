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

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/button_Transportistas'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/button_Gndolas'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/button_Captura'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/select_Seleccionar TransportistaUshipAusenc_0612e0'), 
    transportador, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/select_Seleccionar VehculoCamion'), 
    vehiculo, false)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Nmero Unidad_unitNumber'), unidad)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Tipo Gndola_type'), tipo)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Placas_plates'), placas)

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Vigencia Placas_Fecha'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/span_2020'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/div_2025'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/span_octubre'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/div_diciembre'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/div_31'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Color Lona_color'), color)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Condicin Lona_condition'), condicion)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Condicin Cable Acero_steelwire'), 
    cable)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/input_Nmero de Argollas_numberRings'), 
    argollas)

WebUI.closeBrowser()

