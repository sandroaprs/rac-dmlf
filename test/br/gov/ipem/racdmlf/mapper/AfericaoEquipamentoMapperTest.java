package br.gov.ipem.racdmlf.mapper;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import br.gov.ipem.racdmlf.model.AfericaoEquipamento;

public class AfericaoEquipamentoMapperTest {
	

	@Test
	public void testaTransformacaoElementParaAfericaoEquipamento() throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse("C:\\Temp\\ProdTest.xml");
		
		NodeList lista = doc.getElementsByTagName("G_CFI_CD_CLASSIF_ITEM");
		AfericaoEquipamento afericaoEquipamento = AfericaoEquipamentoMapper.from((Element) lista.item(0));
		
		assertEquals("ARAÇATUBA", afericaoEquipamento.getMunicipio());
		
	}
	
	private String mockXml() {
		return "<VR3691>\r\n" + 
				"  <LIST_G_CFI_CD_CLASSIF_ITEM>\r\n" + 
				"    <G_CFI_CD_CLASSIF_ITEM>\r\n" + 
				"      <DATA>02/01/2029</DATA>\r\n" + 
				"      <TIPO_SERVICO>Periódica</TIPO_SERVICO>\r\n" + 
				"      <MUNICIPIO>ARAÇATUBA</MUNICIPIO>\r\n" + 
				"      <SERVIÇO>122</SERVIÇO>\r\n" + 
				"      <DESCRICAO>IPNA-Class.III e IIII c/disp. &gt;5 kg até 50 kg</DESCRICAO>\r\n" + 
				"      <CD_FUNCIONARIO>2470</CD_FUNCIONARIO>\r\n" + 
				"      <FUNCIONARIO>ANDRE ALVES GOMES</FUNCIONARIO>\r\n" + 
				"      <CD_FUNCIONARIO_AUX>2446</CD_FUNCIONARIO_AUX>\r\n" + 
				"      <NO_FUNCIONARIO_AUX>SILVIA CRISTINA CUSTÓDIO DOS SANTOS</NO_FUNCIONARIO_AUX>\r\n" + 
				"      <REGIONAL>ARAÇATUBA</REGIONAL>\r\n" + 
				"      <DIVISAO>JD. PLANALTO</DIVISAO>\r\n" + 
				"      <TP_BALANCA>Comercial</TP_BALANCA>\r\n" + 
				"      <DATA_REL_DIARIO>02/01/2019</DATA_REL_DIARIO>\r\n" + 
				"      <QTDE_EFETIVA>         0</QTDE_EFETIVA>\r\n" + 
				"      <VALOR_EFETIVO>0.00</VALOR_EFETIVO>\r\n" + 
				"      <QTDE_APROVADA>         8</QTDE_APROVADA>\r\n" + 
				"      <QTDE_REPROVADA>         0</QTDE_REPROVADA>\r\n" + 
				"      <VALOR_TOTAL>968.48</VALOR_TOTAL>\r\n" + 
				"    </G_CFI_CD_CLASSIF_ITEM>" + 
				"  <LIST_G_CFI_CD_CLASSIF_ITEM>\r\n" + 
				"<VR3691>\r\n";
				
	}
	
}
