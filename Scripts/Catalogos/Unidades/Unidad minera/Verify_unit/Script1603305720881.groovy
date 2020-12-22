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


WebUI.callTestCase(findTestCase('Login/Log-in'), [('unidad') : 'San Dimas'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Catalogos/button_Catlogos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Unidades/button_Unidades Mineras'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Catalogos/Unidades/button_Unidad Minera'), FailureHandling.CONTINUE_ON_FAILURE)

for (def i = 1; i <= findTestData('Data Files/Catalogos/Unidades/Unidades mineras').getRowNumbers(); i++) {
    TI = i.toString()
    for (def j = 1; j <= findTestData('Data Files/Catalogos/Unidades/Unidades mineras').getColumnNumbers(); j++) {
        TJ = j.toString()
        String aux = ((('/html/body/div[1]/div/main/div/div/div/div[2]/div[3]/table/tbody/tr[' + TI) + ']/td[') + TJ) + ']'	
        System.out.println(aux)

        serial = new TestObject('customObject')
        serial.addProperty('xpath', ConditionType.EQUALS, aux)
		
		System.out.println(serial)
        String test = WebUI.getText(serial)
        System.out.println(test)

        WebUI.verifyMatch(test, findTestData('Catalogos/Unidades/Unidades mineras').getValue(j, i), false)
    }
}

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

