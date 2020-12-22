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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Unidades/button_Unidades Mineras'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Unidades/button_Unidad Minera'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Unidades/button_Agregar'), FailureHandling.CONTINUE_ON_FAILURE)

for (def rowNum=1; rowNum <= findTestData('Data Files/Catalogos/Unidades/Unidades mineras').getRowNumbers(); rowNum++) {
	
    //WebUI.setText(findTestObject('Catalogos/Unidades/input_Razn Social_businessName'), razonS, FailureHandling.CONTINUE_ON_FAILURE)
    WebUI.setText(findTestObject('Catalogos/Unidades/input_Razn Social_businessName'), findTestData("Data Files/Catalogos/Unidades/Unidades mineras").getValue(
            1, rowNum))

    WebUI.setText(findTestObject('Catalogos/Unidades/input_Nombre de la Unidad_unitName'), findTestData("Data Files/Catalogos/Unidades/Unidades mineras").getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Catalogos/Unidades/input_Nombre Corto_shortName'), findTestData("Data Files/Catalogos/Unidades/Unidades mineras").getValue(
            3, rowNum))

    WebUI.setText(findTestObject('Catalogos/Unidades/input_Cuenta de SAP_sapAccount'), findTestData("Data Files/Catalogos/Unidades/Unidades mineras").getValue(
            4, rowNum))
}

not_run: WebUI.click(findTestObject('Catalogos/Unidades/button_Aadir'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

