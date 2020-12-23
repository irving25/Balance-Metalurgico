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

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/button_Transportistas'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/button_Gndolas'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Consulta/button_Consulta'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/img_Avin_block object-contain float-left'))

WebUI.click(findTestObject('Catalogos/Transportistas/Gondolas/combobox_Gondola_Transportista'))

WebUI.click(findTestObject('Catalogos/Transportistas/Gondolas/combobox_Gondola_Vehiculo'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Nmero Unidad_unitNumber'), 
    num_Unidad)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Tipo Gndola_type'), 
    tipo_Gondola)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Placas_plates'), 
    placas)

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Vigencia Placas_Fecha'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Color Lona_color'), 
    color_Lona)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Condicin Lona_condition'), 
    condicion_Lona)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Condicin Cable Acero_steelwire'), 
    condicion_cable)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/input_Nmero de Argollas_numberRings'), 
    num_Argollas)

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/button_Guardar'))

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Gondolas/Page_First Majestic Silver Corp - Applicati_5b1452/button_Continuar'))

WebUI.closeBrowser()

