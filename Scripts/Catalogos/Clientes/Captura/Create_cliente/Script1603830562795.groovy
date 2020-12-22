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

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Clientes'))

WebUI.click(findTestObject('Object Repository/Catalogos/Clientes/button_Captura'))

for (def i = 4; i <= findTestData('Data Files/Catalogos/Clientes').getRowNumbers(); i++) {
    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Razn Social_businessName'), findTestData('Data Files/Catalogos/Clientes').getValue(
            1, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Nombre Corto_Short Name'), findTestData('Data Files/Catalogos/Clientes').getValue(
            2, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Cuenta SAP_SAP Account'), findTestData('Data Files/Catalogos/Clientes').getValue(
            3, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Impuesto_Tax'), findTestData('Data Files/Catalogos/Clientes').getValue(
            4, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Contacto Nombre_firstName'), findTestData('Data Files/Catalogos/Clientes').getValue(
            5, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Contacto Apellido_lastName'), findTestData(
            'Data Files/Catalogos/Clientes').getValue(6, i))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar PasAfghanistanAlbaniaAlg_68d26a'), 
        findTestData('Data Files/Catalogos/Clientes').getValue(7, i), false)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar EstadoFort-de-franceLa T_df5a38'), 
        findTestData('Data Files/Catalogos/Clientes').getValue(8, i), false)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar MunicipioFort-de-franceL_032379'), 
        findTestData('Data Files/Catalogos/Clientes').getValue(9, i), false)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Ciudad (Opcional)_locality'), findTestData(
            'Data Files/Catalogos/Clientes').getValue(10, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Direccin_Address'), findTestData('Data Files/Catalogos/Clientes').getValue(
            11, i))

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Cdigo Postal_Zip Code'), findTestData('Data Files/Catalogos/Clientes').getValue(
            12, i))

    WebUI.setText(findTestObject('Catalogos/Clientes/Correo1'), findTestData('Data Files/Catalogos/Clientes').getValue(13, 
            i))

    WebUI.setText(findTestObject('Catalogos/Clientes/Correo2'), findTestData('Data Files/Catalogos/Clientes').getValue(14, 
            i))

    WebUI.setText(findTestObject('Catalogos/Clientes/Correo3'), findTestData('Data Files/Catalogos/Clientes').getValue(15, 
            i))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Catalogos/Clientes/select_Seleccionar TipoTipo 1Tipo 2Sandstorm'), 
        findTestData('Data Files/Catalogos/Clientes').getValue(16, i), false)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Clientes/input_Instrucciones_Instructions'), findTestData(
            'Data Files/Catalogos/Clientes').getValue(17, i))

    WebUI.click(findTestObject('Catalogos/Clientes/Btn_guardar'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Catalogos/Clientes/Continuar'))
}

WebUI.closeBrowser()

