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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('Login/Log-in'), [('unidad') : 'San Dimas'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/button_Embarques'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/button_Barras'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/button_Produccin'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/button_Captura Volumen'), FailureHandling.CONTINUE_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('Data Files/Embarques/Embarque1').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/input_Cantidad de Barras_appearance-none bl_0c2793'), 
        findTestData('Data Files/Embarques/Embarque1').getValue(1, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/BarraIni'), findTestData('Data Files/Embarques/Embarque1').getValue(
            2, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/button_Aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/input_Lote_Bacth'), findTestData('Data Files/Embarques/Embarque1').getValue(
            3, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Ag'), findTestData('Data Files/Embarques/Embarque1').getValue(
            4, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Au'), findTestData('Data Files/Embarques/Embarque1').getValue(
            5, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Pb'), findTestData('Data Files/Embarques/Embarque1').getValue(
            6, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Zn'), findTestData('Data Files/Embarques/Embarque1').getValue(
            7, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Cu'), findTestData('Data Files/Embarques/Embarque1').getValue(
            8, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Fe'), findTestData('Data Files/Embarques/Embarque1').getValue(
            9, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Ni'), findTestData('Data Files/Embarques/Embarque1').getValue(
            10, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Cd'), findTestData('Data Files/Embarques/Embarque1').getValue(
            11, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Bi'), findTestData('Data Files/Embarques/Embarque1').getValue(
            12, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Mn'), findTestData('Data Files/Embarques/Embarque1').getValue(
            13, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.setText(findTestObject('Embarques/Barras/Produccion/Prod/Sb'), findTestData('Data Files/Embarques/Embarque1').getValue(
            14, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

    for (def barras = 1; barras <= findTestData('Data Files/Embarques/Barras1').getRowNumbers(); barras++) {
        String aux = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + (barras * 3)) + ']/div/input'
        String aux1 = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + ((barras * 3) + 1)) + ']/div/input'

        serial = new TestObject('customObject')
        serial.addProperty('xpath', ConditionType.EQUALS, aux)
		
        peso = new TestObject('customObject')
        peso.addProperty('xpath', ConditionType.EQUALS, aux1)

        WebUI.setText(serial, findTestData('Data Files/Embarques/Barras1').getValue(1, barras), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.setText(peso, findTestData('Data Files/Embarques/Barras1').getValue(2, barras), FailureHandling.CONTINUE_ON_FAILURE)
    }
}

WebUI.scrollToElement(findTestObject('Embarques/Barras/Produccion/Prod/Btn_aceptar'), 1)

WebUI.click(findTestObject('Embarques/Barras/Produccion/Prod/Btn_aceptar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8)

WebUI.closeBrowser()

