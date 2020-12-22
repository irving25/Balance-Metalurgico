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

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/button_Captura'))

for (def i = 1; i <= findTestData('Data Files/Catalogos/Transportistas/Vehiculos').getRowNumbers(); i++) {
	
    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/select_Seleccionar TransportistaUshipAusenc_0612e0'), 	
        findTestData('Data Files/Catalogos/Transportistas/Vehiculos').getValue(1, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Nmero Unidad_unitNumber'), findTestData(
            'Data Files/Catalogos/Transportistas/Vehiculos').getValue(2, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Tipo_type'), findTestData('Data Files/Catalogos/Transportistas/Vehiculos').getValue(
            3, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Nmero Placas_platesNumber'), 
        findTestData('Data Files/Catalogos/Transportistas/Vehiculos').getValue(4, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Vigencia Placas_Fecha'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/div_2020'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/div_2025'))

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/span_octubre'))

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/div_diciembre'))

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/div_31'))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Aseguradora_insuranceCarrier'), 
        findTestData('Data Files/Catalogos/Transportistas/Vehiculos').getValue(5, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Poliza_policy'), findTestData(
            'Data Files/Catalogos/Transportistas/Vehiculos').getValue(6, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/input_Vigencia Poliza_Fecha'))

    WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Vehiculo/span_2020'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/div_2025Do'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/span_octubreDo'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/div_diciembreDo'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/div_31Do'))

    WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/btn_gurdar_vehi'))

    if (WebUI.verifyElementPresent(findTestObject('Catalogos/Transportistas/Vehiculo/MensajeError'), 1)) {
        WebUI.click(findTestObject('Catalogos/Transportistas/Vehiculo/CerrarError'))
    } else {
        WebUI.click(findTestObject('Catalogos/Transportistas/Operator/btn_acept'), FailureHandling.CONTINUE_ON_FAILURE)
    }
}

not_run: WebUI.closeBrowser()

