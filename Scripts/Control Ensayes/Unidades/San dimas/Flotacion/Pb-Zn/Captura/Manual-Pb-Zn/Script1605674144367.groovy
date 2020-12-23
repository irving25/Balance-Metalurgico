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

WebUI.callTestCase(findTestCase('Login/Log-in'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Control Ensayes'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Flotacin'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Pb-Zn/pbZn'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Pb-Zn/Cap'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Fecha_Fecha'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Previous Month'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Ag-Au/Captura/div_2'))

for (def rowNum = 1; rowNum <= findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getRowNumbers(); rowNum++) {
    WebUI.selectOptionByLabel(findTestObject('Control Ensayes/Flotacion/Ag-Au/Captura/turno'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            1, rowNum), false)

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/Humedad'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/Humedas'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            3, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/al-ag'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            4, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/al-pb'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            5, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/al-zn'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            6, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/con-ag'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            7, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/con-pb'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            8, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/con-zn'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            9, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/conz-ag'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            10, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/conz-pb'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            11, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/conz-zn'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            12, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/col-ag'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            13, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/col-pb'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            14, rowNum))

    WebUI.setText(findTestObject('Control Ensayes/Flotacion/Pb-Zn/col-zn'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            15, rowNum))
}

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/div_IncidenciasIncidenciaSeleccionar Tipo d_de7fed'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Pb-Zn/btn-save'))

WebUI.delay(5)

WebUI.closeBrowser()

