package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
	
	public void converterCelsiusParaFahrenheit(double valorRecebido) {
        double celsiusParaFahrenheit = (valorRecebido * 9/5) + 32;
        celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são equivalentes a: " + celsiusParaFahrenheit + " Graus Fahrenheit ");
    }

    public void converterCelsiusParaKelvin(double valorRecebido) {
        double celsiusParaKelvin = valorRecebido + 273.15;
        celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + "Graus Celsius são equivalentes a: " + celsiusParaKelvin + " Kelvin");
    }

    public void converterFahrenheitParaCelsius(double valorRecebido) {
        double fahrenheitParaCelsius = (valorRecebido - 32) * 5/9;
        fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Fahrenheit são equivalentes a:  " + fahrenheitParaCelsius + " Celsius");
    }

    public void converterKelvinParaCelsius(double valorRecebido) {
        double kelvinParaCelcius = valorRecebido - 273.15;
        kelvinParaCelcius = (double) Math.round(kelvinParaCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são equivalentes a:  " + kelvinParaCelcius + " Celsius");
    }

    public void converterKelvinParaFahrenheit(double valorRecebido) {
        double kelvinParaFahrenheit = (valorRecebido - 273.15) * 9/5 + 32;
        kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são equivalentes a:  " + kelvinParaFahrenheit + " Fahrenheit");
    }
	
}
