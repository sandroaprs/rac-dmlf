package br.gov.ipem.racdmlf.util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * Sandro Souza
 * 14/05/2018
 * Documentação utilizada na consulta:
 * https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
 * Quanto ao locale eu já havia visto em outros exemplos mas aprendi a usar melhor neste exercício.
 * Fonte: http://www.guj.com.br/t/mes-por-extenso/52360/3
 * 
 */

public class ConverterData {



		public static void main(String[] args) throws ParseException {

		String dataDigitada = JOptionPane.showInputDialog(null, "Informe uma data no formato DD/MM/AAAA:  \n");
		
		dataDigitada = dataDigitada.substring(3,5) + "/" + dataDigitada.substring(0,2) + "/" + dataDigitada.substring(6,10);
		DateFormat dateFormat = new SimpleDateFormat("EEEEE, d 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
		String dataInformada = dateFormat.format(new Date(dataDigitada)).toString();
		
		String[] dividirTexto = dataInformada.split("-");
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < dividirTexto.length; i++) {
	           String dataFormatada = dividirTexto[i];
	           dataFormatada = dataFormatada.substring(0, 1).toUpperCase() + dataFormatada.substring(1);
	           sb.append(" ").append(dataFormatada);
	       }
	       
	       
	    dataInformada = Character.toUpperCase(dataInformada.charAt(0)) + dataInformada.substring(1);
	    
		JOptionPane.showMessageDialog(null, "Você digitou a data:\n  " + dataInformada, null, JOptionPane.INFORMATION_MESSAGE);
	  
		}

	
	
	
}
