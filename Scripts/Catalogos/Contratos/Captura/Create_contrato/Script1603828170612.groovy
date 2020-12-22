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

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Contratos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Captura'), FailureHandling.CONTINUE_ON_FAILURE)

for (def i = 4; i <= findTestData('Data Files/Catalogos/Contratos').getRowNumbers(); i++) {
    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Nm Contrato_numContract'), findTestData('Data Files/Catalogos/Contratos').getValue(
            1, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar Tipo de ContratoBarrasCo_55f85c'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(2, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar RefineraMet Mex Peoles S_14df66'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(3, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar UnidadLa ParrillaLa Enca_c3bc0c'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(4, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/input_Fecha Inicial_Fecha'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_enero'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_1'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/input_Vigencia_Date'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre_react-datepicker__year-read-vi_094b71'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_2025'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/span_octubre 2025_react-datepicker__month-r_2a1220'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_diciembre'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/div_31'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Grs Pagable Plata_agPayableGrams'), findTestData(
            'Data Files/Catalogos/Contratos').getValue(5, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Pagable Plata_agPayablePercentage'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(6, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Porcentaje_ant_pla'), findTestData('Data Files/Catalogos/Contratos').getValue(
            7, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Grs Pagables Oro_auPayableGrams'), findTestData(
            'Data Files/Catalogos/Contratos').getValue(8, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Pagable Oro_auPayablePercentage'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(9, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Porcentaje Anticipo Oro_auAdvPayableP_441ce7'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(10, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/input_Cargo por Refinacin Onzas de Plata_pa_4a3ab3'), findTestData(
            'Data Files/Catalogos/Contratos').getValue(11, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar TipoDore WeightDore OzDo_e78bf3'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(12, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Cargo por Refinacin Onzas de Oro_paya_8d40cb'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(13, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Mnimo Asignable Plata_minAgAssignableAmount'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(14, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Mnimo Asignable Oro_minAuAssignableAmount'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(15, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/Catalogos/Contratos/input_Dias de Cierre_closingDays'), findTestData(
            'Data Files/Catalogos/Contratos').getValue(16, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Correo1'), findTestData('Data Files/Catalogos/Contratos').getValue(
            17, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Correo2'), findTestData('Data Files/Catalogos/Contratos').getValue(
            18, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Correo3'), findTestData('Data Files/Catalogos/Contratos').getValue(
            19, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar OnzaDore OzsDore Ag OzsD_090c4f'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(20, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Porncentaje_ajuste_ag'), findTestData('Data Files/Catalogos/Contratos').getValue(
            21, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Catalogos/Contratos/Porncentaje_ajuste_au'), findTestData('Data Files/Catalogos/Contratos').getValue(
            22, i), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Contratos/select_Seleccionar ClienteRepublic Metals C_939819'), 
        findTestData('Data Files/Catalogos/Contratos').getValue(23, i), false, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Object Repository/Catalogos/Contratos/button_Guardar'), 0)

    WebUI.click(findTestObject('Object Repository/Catalogos/Contratos/button_Guardar'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Catalogos/Contratos/Continue'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.closeBrowser()

