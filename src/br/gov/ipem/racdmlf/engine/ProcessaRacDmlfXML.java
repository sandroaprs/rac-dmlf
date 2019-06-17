
package br.gov.ipem.racdmlf.engine;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.gson.Gson;

import br.gov.ipem.racdmlf.mapper.AfericaoEquipamentoMapper;
import br.gov.ipem.racdmlf.model.AfericaoEquipamento;


public class ProcessaRacDmlfXML {
    
	

	public static void lerRegistrosXML(final String pathXml){

		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			
			Document doc = builder.parse(pathXml);
			NodeList lista = doc.getElementsByTagName("G_CFI_CD_CLASSIF_ITEM");
			
			int tamanhoLista = lista.getLength();
			
			System.out.println("-------------------------------");
			System.out.println("Total de Registros:  " + tamanhoLista);
			System.out.println("-------------------------------");
			
			List<AfericaoEquipamento> listaAfericaoEquipamento = new ArrayList<>();
			
			for (int i  = 0; i < 100; i++){
				Element row = (Element) lista.item(i);
				listaAfericaoEquipamento.add(AfericaoEquipamentoMapper.from(row));				
			}
			
			//listaAfericaoEquipamento.get(0).getFuncionario().getNome()
			//listaAfericaoEquipamento.get(0).getFuncionarioAux().getNome()
			
			System.out.println(new Gson().toJson(listaAfericaoEquipamento));
			
			System.out.println("-------------------------------");
			System.out.println(tamanhoLista);
			System.out.println("-------------------------------");
				
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void periodoDeData(){
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

				
			try {
				org.w3c.dom.Document doc = builder.parse("c:\\Temp\\Producao.xml");
				NodeList lista = doc.getElementsByTagName("G_CFI_CD_CLASSIF_ITEM");
				
				int tamanhoLista = lista.getLength();
				
				System.out.println("-------------------------------");
				System.out.println("Total de Registros:  " + tamanhoLista);
				System.out.println("-------------------------------");
				//for (int i  = 0; i < tamanhoLista; i++){
				
				int a = 1;
				int b = 5;
				
				
				for (int i  = 0; i < a; i++){
					Node noLIST_G_CFI_CD_CLASSIF_ITEM = lista.item(i);
					
					if(noLIST_G_CFI_CD_CLASSIF_ITEM.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE){
						Element elentoG_CFI_CLASSIF = (Element) noLIST_G_CFI_CD_CLASSIF_ITEM;
					
						
						NodeList listaFilhos = noLIST_G_CFI_CD_CLASSIF_ITEM.getChildNodes();
						int tamanhoFilhos = listaFilhos.getLength();
						for (int j = 0; j < tamanhoFilhos; j++){
							org.w3c.dom.Node noFilho = listaFilhos.item(j);
							
							if(noFilho.getNodeType() == Node.ELEMENT_NODE){
								Element elementoFilho = (Element) noFilho;
								
								switch (elementoFilho.getTagName()){
								
								case "DATA":
									System.out.println("Data inicial: " + elementoFilho.getTextContent());
								break;
								

								default:
									break;
								}
								
							}
							
						}
						
						System.out.println("-----------------------------------------------------------------");
						System.out.println("Data inicial");
					}
				
				}



				
			} catch (Exception e) {
				e.printStackTrace();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    	
	public static void conectarBD (String cn) {
		
		
	}
    
    
	public static void exportar (String strXml) {
		
		
	}
    
    
}

