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

WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/button_Administracin'))

WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/button_Puestos Packing List'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Catalogos/Administracion/select_Seleccionar UnidadLa ParrillaLa Enca_c3bc0c'), 
    '1', false)

WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/input_Gerente de Unidad_manager'))

WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/div_Balance MetalrgicoInicioControl Ensayes_be85ca'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Administracion/input_Gerente de Unidad_manager'), 'Test')

WebUI.setText(findTestObject('Object Repository/Catalogos/Administracion/input_Jefe de Laboratorio de Ensayes_laboratory'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Catalogos/Administracion/input_Superintendente de Planta_plant'), 'Test')

not_run: WebUI.click(findTestObject('Object Repository/Catalogos/Administracion/button_Guardar'))

