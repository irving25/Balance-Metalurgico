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

WebUI.click(findTestObject('Object Repository/Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Transportistas/Transpor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Operator/Operator/Operador'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Transportistas/Operator/Operator/Btn_consulta'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Edicion/img_Ausenco_block object-contain float-left'))

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Edicion/combobox_Operador_Transportista'))

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Edicion/input_Nombre Completo_name'), nombre)

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Edicion/input_Numero de Licencia_license'), license)

not_run: WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Edicion/input_Vigencia Licencia_Fecha'))

WebUI.setText(findTestObject('Catalogos/Transportistas/Operator/Edicion/input_Numero IMSS_Address'), imss)

not_run: WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Edicion/button_Guardar'))

not_run: WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Edicion/button_Continuar'))

WebUI.closeBrowser()

