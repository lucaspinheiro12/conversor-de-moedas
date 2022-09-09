package ConversorDeMoedas;

import javax.swing.JOptionPane;

public class FuncaoConverter  {
	///String msg = "você deve digitar apenas numeros";
	
	public void ConverterReaisParaDollar(double valorRecebido){
		double cotacaoDollar = 5.25;
		double resultado = valorRecebido / cotacaoDollar;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para dollar o valor de:$"  + resultado  );
	}
	
	public void ConverterDollarParaReais(double valorRecevido)  {
		double cotacaoDollar = 5.25;
		double resultado = valorRecevido * cotacaoDollar;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	
	
	public void ConverterEuroParaReais(double valorRecevido)  {
		double cotacaoEuro = 5.24;
		double resultado = valorRecevido * cotacaoEuro;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	
	public void ConverterReaisParaEuro(double valorRecevido)  {
		double cotacaoEuro = 5.24;
		double resultado = valorRecevido / cotacaoEuro;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	
	
	public void ConverterReaisParaLibrasEsterlinas(double valorRecebido){
		double cotacaoLibra = 6.04;
		double resultado = valorRecebido / cotacaoLibra;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para dollar o valor de:$"  + resultado  );
	}
	
	public void ConverterLibrasEsterlinasParaReais(double valorRecevido)  {
		double cotacaoLibra = 6.04;
		double resultado = valorRecevido * cotacaoLibra;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	
	
	public void ConverterReaisParaPesoArgentino(double valorRecebido){
		double cotacaoPeso = 26.82;
		double resultado = valorRecebido * cotacaoPeso;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para dollar o valor de:$"  + resultado  );
	}
	
	public void ConverterPesoArgentinoParaReais(double valorRecevido)  {
		double cotacaoPeso = 0.037;
		double resultado = valorRecevido * cotacaoPeso;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	
	
	public void ConverterReaisParaPesoChileno(double valorRecebido){
		double cotacaoPeso = 168.44;
		double resultado = valorRecebido * cotacaoPeso;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para dollar o valor de:$"  + resultado  );
	}
	
	public void ConverterPesoChilenoParaReais(double valorRecevido)  {
		double cotacaoPeso = 0.0059;
		double resultado = valorRecevido * cotacaoPeso;
		resultado = (double) Math.round(resultado *100d)/100;
		JOptionPane.showMessageDialog(null,"voce converteu para reais o valor de:R$"  + resultado  );
		
	}
	

}
