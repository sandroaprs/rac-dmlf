
package br.gov.ipem.racdmlf.controller;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.gov.ipem.racdmlf.dao.AfericaoEquipamentoDAO;
import br.gov.ipem.racdmlf.mapper.AfericaoEquipamentoMapper;
import br.gov.ipem.racdmlf.model.AfericaoEquipamento;
import br.gov.ipem.racdmlf.util.RacDmlXMLConttrollerErr;
import br.gov.ipem.racdmlf.util.RacDmlXMLConttrollerSuccess;


public class RacDmlfXMLController {
    

	public static void lerRegistrosXML(final String pathXml, RacDmlXMLConttrollerSuccess success, RacDmlXMLConttrollerErr err){

		
		try {
		
			AfericaoEquipamentoDAO afericaoEquipamentoDAO = new AfericaoEquipamentoDAO();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
		
			Document doc = builder.parse(pathXml);
			NodeList lista = doc.getElementsByTagName("G_CFI_CD_CLASSIF_ITEM");
			
			final int tamanhoLista = lista.getLength();
						
			List<AfericaoEquipamento> listaAfericaoEquipamento = new ArrayList<>();
			
			for (int i  = 0; i < tamanhoLista; i++){
				Element row = (Element) lista.item(i);
				
				AfericaoEquipamento afe = AfericaoEquipamentoMapper.from(row); 
				
				listaAfericaoEquipamento.add(afe);
				
			}
			
			afericaoEquipamentoDAO.salvar(listaAfericaoEquipamento);

			success.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			err.execute();
		}
	}
		
   
}

