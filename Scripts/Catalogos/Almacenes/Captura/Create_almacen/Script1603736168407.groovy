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

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Almacenes/button_Catlogos'))

WebUI.click(findTestObject('Object Repository/Catalogos/Almacenes/button_Almacenes'))

WebUI.click(findTestObject('Object Repository/Catalogos/Almacenes/button_Captura'))

WebUI.setText(findTestObject('Object Repository/Catalogos/Almacenes/input_Razn Social_Bussiness Name'), razons)

WebUI.setText(findTestObject('Object Repository/Catalogos/Almacenes/input_Domicilio_Address'), domicilio)

WebUI.setText(findTestObject('Object Repository/Catalogos/Almacenes/input_Cdigo Postal_Zip Code'), cp)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Almacenes/select_Seleccionar PasAfghanistanAlbaniaAlg_68d26a'), 
    pais, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Almacenes/select_Seleccionar EstadoMayottePamanzi'), 
    estado, false)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Catalogos/Almacenes/select_Seleccionar MunicipioDzaoudziPamanzi'), 
    municipio, false)

WebUI.setText(findTestObject('Object Repository/Catalogos/Almacenes/input_Ciudad (Opcional)_locality'), ciudad)

WebUI.setText(findTestObject('Object Repository/Catalogos/Almacenes/input_Telfono_Phone'), telefono)

WebUI.closeBrowser()

