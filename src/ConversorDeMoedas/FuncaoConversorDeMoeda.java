package ConversorDeMoedas;
import javax.swing.JOptionPane;

import ConversorDeMoedas.FuncaoConverter;

public class FuncaoConversorDeMoeda {
	
	FuncaoConverter moedas = new FuncaoConverter();
	
	public void converter (double valor) {
		String opcaoEscolheAMoedaASerConvertida = JOptionPane.showInputDialog(null,  "escolha uma opção" , "Moedas", JOptionPane.PLAIN_MESSAGE, null,  new Object[] {"conversor de reais para Dollar", 
				"Conversor de Dollar para reais","conversor de Reais para Euro","Conversor de Euro para reais","conversor de Reais para Libras Esterlinas","Conversor de Libras Esterlinas para reais",
				"conversor de Reais para peso Argentino","Conversor de peso Argentino para reais","conversor de Reais para peso Chileno","Conversor de peso Chileno para reais"}, "escolha").toString(); 
			switch(opcaoEscolheAMoedaASerConvertida) {
						
							//dolla ||real
				case "conversor de reais para Dollar":
					moedas.ConverterReaisParaDollar(valor);
					break;
							
				case "Conversor de Dollar para reais":
					moedas.ConverterDollarParaReais(valor);
					break;
						
								//Euro || real
				case "conversor de Reais para Euro":
					moedas.ConverterReaisParaEuro(valor);
					break;
						
				case "Conversor de Euro para reais":
					moedas.ConverterEuroParaReais(valor);
					break;
						
						 		//Libras  || real
				case "conversor de Reais para Libras Esterlinas":
					moedas.ConverterReaisParaLibrasEsterlinas(valor);
					break;
					
				case "Conversor de Libras Esterlinas para reais":
					moedas.ConverterLibrasEsterlinasParaReais(valor);
					break;
						
								//	Peso Argentino || real
				case "conversor de Reais para peso Argentino":
					moedas.ConverterReaisParaPesoArgentino(valor);
					break;
				
				case "Conversor de peso Argentino para reais":
					moedas.ConverterPesoArgentinoParaReais(valor);	
					break;
						
						//	Peso Chileno  || real
				case "conversor de Reais para peso Chileno":
					moedas.ConverterReaisParaPesoChileno(valor);
					break;
						
				case "Conversor de peso Chileno para reais":
					moedas.ConverterPesoChilenoParaReais(valor);	
					break;	
				}
	}
	
	

}
