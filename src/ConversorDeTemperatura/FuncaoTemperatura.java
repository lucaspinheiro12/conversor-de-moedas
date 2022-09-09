package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class FuncaoTemperatura {
	ConversorDeTemperatura temperatura = new ConversorDeTemperatura();

	public void converterTemperatura(double valor) {
		 String escolhaAOpcao = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{
	        "Graus Celsius a Fahrenheit", "Graus Celsius a Kelvin", "Graus Fahrenheit a Celsius","Kelvin a Graus Celsius","Kelvin a Graus Fahrenheit"}, "Escolha")).toString();
		 switch(escolhaAOpcao) {
	   	 	case "Graus Celsius a Fahrenheit":
	   	 		temperatura.converterCelsiusParaFahrenheit(valor);
	   	 		break;
	
	   		case "Graus Celsius a Kelvin":
	   			temperatura.converterCelsiusParaKelvin(valor);
	   			break;
	   			
	   		case "Graus Fahrenheit a Celsius":
	   			temperatura.converterFahrenheitParaCelsius(valor);
	   			break;
	   			
	   		case "Kelvin a Graus Celsius":
	   			temperatura.converterKelvinParaCelsius(valor);
	   			break;
	   			
	   		case "Kelvin a Graus Fahrenheit":
	   			temperatura.converterKelvinParaFahrenheit(valor);
	   			break; 
		 }		
	}
}
