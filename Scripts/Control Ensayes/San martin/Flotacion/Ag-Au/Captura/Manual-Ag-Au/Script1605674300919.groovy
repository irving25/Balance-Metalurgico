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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Control Ensayes'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Flotacin'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_AgAu'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Captura'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Fecha_Fecha'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Previous Month'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Ag-Au/Captura/div_2'))

for (def rowNum = 1; rowNum <= findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getRowNumbers(); rowNum++) {
    WebUI.selectOptionByLabel(findTestObject('Control Ensayes/Flotacion/Ag-Au/Captura/turno'), findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(
            1, rowNum), false)

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Hmedas_Wet'), findTestData(
            'Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(2, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Hmedad_humidity'), findTestData(
            'Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(3, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Ag (grston)_feedSilver'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(4, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Au (grston)_feedGold'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(5, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Ag (grston)_conSilver'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(6, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Au (grston)_conGold'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(7, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Ag (grston)_tailsSilver'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(8, rowNum))

    WebUI.setText(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/input_Au (grston)_tailsGold'), 
        findTestData('Data Files/Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(9, rowNum))
}

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/div_IncidenciasIncidenciaSeleccionar Tipo d_de7fed'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Captura/button_Guardar'))

WebUI.delay(5)

WebUI.closeBrowser()

