package Principal;

import javax.swing.JOptionPane;

import ConversorDeMoedas.*;

import ConversorDeTemperatura.*;


public class ConversorPrincipal {
	public static void main(String[] args) {
		
		FuncaoConversorDeMoeda converte = new FuncaoConversorDeMoeda();
		FuncaoTemperatura converterTemperatura = new FuncaoTemperatura();
		
		while(true) {
			String  opcaoEscolheOConversor = JOptionPane.showInputDialog(null,  "escolha uma opção" , "Menu", JOptionPane.PLAIN_MESSAGE, null,  new Object[] {"conversor de Moeda", 
				"Conversor de Temperatura"}, "escolha").toString(); 
		
			switch(opcaoEscolheOConversor) {
				case "conversor de Moeda":	
					String perguntaOValor = JOptionPane.showInputDialog("Insira o valor:");
					
					if(testar(perguntaOValor)) {
						double recebeOValor = Double.parseDouble(perguntaOValor);
						converte.converter(recebeOValor);
						int resposta =JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						if(JOptionPane.OK_OPTION == resposta) {
							//ele vai fazer outra converçao
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							return;
						}
					}
					break;
				case"Conversor de Temperatura":
					String perguntaOValorDaTemperatura = JOptionPane.showInputDialog("Insira o valor:");
					
					if(testar(perguntaOValorDaTemperatura)) {
						double recebeOValorDaTemperatura = Double.parseDouble(perguntaOValorDaTemperatura);
						converterTemperatura.converterTemperatura(recebeOValorDaTemperatura);
						int resposta =JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						if(JOptionPane.OK_OPTION == resposta) {
							//ele vai fazer outra converçao1
						}else {
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							return;
						}
					}
				break;	
			}
			
		}
	}
	
	public static boolean testar(String input) {
		try {
			double recebeOValoDoInput = Double.parseDouble(input);
			if(recebeOValoDoInput >= 0 || recebeOValoDoInput < 0) {
				return true;
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Digite apenas numeros");
			return false;
		}
		return false;
	}
}