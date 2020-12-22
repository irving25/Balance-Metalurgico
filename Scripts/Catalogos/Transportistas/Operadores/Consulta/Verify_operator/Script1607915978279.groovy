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

WebUI.click(findTestObject('Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Transportistas/Transpor'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Operador'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/Transportistas/Operator/Btn_consulta'), FailureHandling.CONTINUE_ON_FAILURE)

for (def i = 1; i <= findTestData('Data Files/Catalogos/Transportistas/Operador_verify').getRowNumbers(); i++) {
    TI = i.toString()
    for (def j = 1; j <= findTestData('Data Files/Catalogos/Transportistas/Operador_verify').getColumnNumbers(); j++) {
        TJ = j.toString()
        String aux = ((('/html/body/div[1]/div/main/div/div/div/div[2]/div[4]/table/tbody/tr[' + TI) + ']/td[') + TJ) + 
        ']'
		System.out.println(aux);

        serial = new TestObject('customObject')

        serial.addProperty('xpath', ConditionType.EQUALS, aux)

        String test = WebUI.getText(serial)

        WebUI.scrollToElement(findTestObject('Catalogos/Transportistas/Operator/btn_next'), 0)
        WebUI.verifyMatch(test, findTestData('Catalogos/Transportistas/Operador_verify').getValue(j, i), false)
    }
    	if ((i % 10) == 0) {
			WebUI.click(findTestObject('Catalogos/Transportistas/Operator/btn_next'), FailureHandling.CONTINUE_ON_FAILURE)
			i = 0;
			j = 0;
		}
}

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

