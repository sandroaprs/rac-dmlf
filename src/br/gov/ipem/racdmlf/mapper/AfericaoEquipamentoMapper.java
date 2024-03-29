package br.gov.ipem.racdmlf.mapper;


import org.w3c.dom.Element;

import br.gov.ipem.racdmlf.model.AfericaoEquipamento;
import br.gov.ipem.racdmlf.util.ConverterDataUtil;

public class AfericaoEquipamentoMapper {
	
	private AfericaoEquipamentoMapper(){
				
	}
	
	public static AfericaoEquipamento from(Element row){
		
		AfericaoEquipamento afericaoEquipamento = new AfericaoEquipamento();

		// ConverterDataUtil cd = new ConverterDataUtil();

		try {
		
			afericaoEquipamento.setData(ConverterDataUtil.parseData(row.getElementsByTagName("DATA").item(0).getTextContent()));

			afericaoEquipamento.setTipoServico(row.getElementsByTagName("TIPO_SERVICO").item(0).getTextContent());
			afericaoEquipamento.setMunicipio(row.getElementsByTagName("MUNICIPIO").item(0).getTextContent());
			afericaoEquipamento.setServico(Integer.valueOf(row.getElementsByTagName("SERVI�O").item(0).getTextContent().trim()));
			afericaoEquipamento.setDescricao(row.getElementsByTagName("DESCRICAO").item(0).getTextContent());	
			
			afericaoEquipamento.setCd_funcionario(Integer.valueOf(row.getElementsByTagName("CD_FUNCIONARIO").item(0).getTextContent()));
			afericaoEquipamento.setFuncionario(row.getElementsByTagName("FUNCIONARIO").item(0).getTextContent());	
			
			afericaoEquipamento.setCd_Funcionario_Aux(Integer.valueOf(row.getElementsByTagName("CD_FUNCIONARIO_AUX").item(0).getTextContent()));
			afericaoEquipamento.setFuncionario_Aux(row.getElementsByTagName("NO_FUNCIONARIO_AUX").item(0).getTextContent());	
			
			
			afericaoEquipamento.setRegional(row.getElementsByTagName("REGIONAL").item(0).getTextContent());
			afericaoEquipamento.setDivisao(row.getElementsByTagName("DIVISAO").item(0).getTextContent());
			afericaoEquipamento.setTipoBalanca(row.getElementsByTagName("TP_BALANCA").item(0).getTextContent());
			afericaoEquipamento.setDataRelatorioDiario(row.getElementsByTagName("DATA_REL_DIARIO").item(0).getTextContent());
			afericaoEquipamento.setQuantEfetiva(Integer.valueOf(row.getElementsByTagName("QTDE_EFETIVA").item(0).getTextContent().trim()));
			afericaoEquipamento.setValorEfetvo(Double.valueOf(row.getElementsByTagName("VALOR_EFETIVO").item(0).getTextContent().trim()));
			afericaoEquipamento.setQuantidadeAprovada(Integer.valueOf(row.getElementsByTagName("QTDE_APROVADA").item(0).getTextContent().trim()));
			afericaoEquipamento.setQuantidadeReprovada(Integer.valueOf(row.getElementsByTagName("QTDE_REPROVADA").item(0).getTextContent().trim()));
			afericaoEquipamento.setValorTotal(Double.valueOf(row.getElementsByTagName("VALOR_TOTAL").item(0).getTextContent().trim()));
			
						
		} catch (Exception e) {
			afericaoEquipamento.setDescricao("Erro" + e.getMessage());
		} 
		
		
		
		return afericaoEquipamento;
		
	}
	
	
	
}
