package rac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import jdk.nashorn.internal.parser.DateParser;
import br.gov.ipem.racdmlf.controller.AfericaoEquipamentoController;
import br.gov.ipem.racdmlf.model.AfericaoEquipamento;
import br.gov.ipem.racdmlf.model.Funcionario;

public class TesteJPA {

	public static void main(String[] args) {
		
		AfericaoEquipamento afe1 = new AfericaoEquipamento();
		
	
		
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
		//String minhaData = formatoData.format("29/10/2019");
		String minhaData = "25/10/2019";
		SimpleDateFormat sdfIn = new SimpleDateFormat("dd/MM/yyyy");
		String input = minhaData;
		  
	    SimpleDateFormat sdfOut = new SimpleDateFormat("yyyy-MM-dd");
	  
	    Date data = null;
		try {
			data = sdfIn.parse(input);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	    System.out.println(data);

	    afe1.setData(data);
	//	afe1.setFuncionario(new Funcionario(Integer.valueOf(9999), ("sandro souza")));
	    afe1.setDescricao(" teste dia 25/10/2019");
		afe1.setMunicipio("SAO JOAO DA BOA VISTA");
		
	//	System.out.println(afe1.getFuncionario().getNome());
		AfericaoEquipamentoController aec = new AfericaoEquipamentoController();
		
		System.out.println(afe1.getMunicipio());
		System.out.println(afe1.getData());
		System.out.println(afe1.getDescricao());
		System.out.println("---------------------------------------------------");
		aec.salvar(afe1);
		
		
	}

}
