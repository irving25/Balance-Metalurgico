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

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Control Ensayes'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Flotacin'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_AgAu'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Consulta'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/input_De_Fecha'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Previous Month'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Ag-Au/Consulta/div_2'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/input_A_Fecha'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Previous Month'))

WebUI.click(findTestObject('Control Ensayes/Flotacion/Ag-Au/Consulta/div_2Do'))

WebUI.click(findTestObject('Object Repository/Control Ensayes/Flotacion/Ag-Au/Consulta/button_Consultar'))

WebUI.delay(5)

for (def ensaye = 1; ensaye <= findTestData('Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getRowNumbers(); ensaye++){
	
	String aux = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + (barras * 3)) + ']/div/input'
	
			String aux1 = ('/html/body/div[1]/div/main/div/div/div/div[2]/div[5]/div[' + ((barras * 3) + 1)) + ']/div/input'
	
			serial = new TestObject('customObject')
	
			serial.addProperty('xpath', ConditionType.EQUALS, aux)
	
			peso = new TestObject('customObject')
	
			peso.addProperty('xpath', ConditionType.EQUALS, aux1)
	
			WebUI.setText(serial, findTestData('Data Files/Embarques/Barras1').getValue(1, barras))
	
			WebUI.setText(peso, findTestData('Data Files/Embarques/Barras1').getValue(2, barras))
	
String aux = 'Control Ensayes/Flotacion/Ag-Au/Consulta/td_1200'
humedas = new TestObject('customObject')
humedas.addProperty('xpath', ConditionType.EQUALS, aux)
WebUI.setText(humedas, findTestData('Data Files/Embarques/Barras1').getValue(1, barras))



//WebUI.verifyElementText(findTestObject('Control Ensayes/Flotacion/Ag-Au/Consulta/td_12300'), findTestData('Control de ensayes/La parrilla/Flotacion/Ag-Au/AgAu').getValue(3, ensaye))

System.out.println("-----------------------------------------------------------" + humedas);
System.out.println("-----------------------------------------------------------" + humedad);

//float result = (humedas * (1 - (humedad / 100)));

}


WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

