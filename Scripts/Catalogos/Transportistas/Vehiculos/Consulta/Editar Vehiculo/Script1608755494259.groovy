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

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/button_Vehiculos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Consulta/button_Consulta'))

WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/img_editar'))

WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/input_Combo_Vehiculo_Transportista'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Nmero Unidad_unitNumber'), 
    test_unit_number)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Tipo_type'), 
    test_type)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Nmero Placas_platesNumber'), 
    test_license_plate_number)

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Vigencia Placas_Fecha'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Aseguradora_insuranceCarrier'), 
    test_insurance)

WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Poliza_policy'), 
    test_policy)

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/input_Vigencia Poliza_Fecha'))

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/button_Guardar'))

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/Page_First Majestic Silver Corp - Applicati_5b1452/button_Continuar'))

WebUI.closeBrowser()

