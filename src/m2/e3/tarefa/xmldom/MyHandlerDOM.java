package m2.e3.tarefa.xmldom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import m2.e3.tarefa.modelo.Deputado;
// import jdk.internal.org.xml.sax.SAXException;

public class MyHandlerDOM {

	public List<Deputado> fazerParsing(String pathArq) throws SAXException, IOException, ParserConfigurationException{
		 
		List<Deputado> deps = new ArrayList<Deputado>();
		
		File xmlFile = new File(pathArq);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = factory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		
		doc.getDocumentElement().normalize();
		
		// System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("deputado");
		
		System.out.printf("Quantidade de Deputados: %d\n", nList.getLength());
		
		for (int i = 0; i < nList.getLength(); i++) {
			
			Node nNode= nList.item(i);
			
			// System.out.println("\nElemento corrente: " + nNode.getNodeName());
			
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element elem = (Element) nNode;
				Deputado dep = new Deputado();

				Node node1 = elem.getElementsByTagName("uri").item(0);
				String uri = node1.getTextContent();
				
				Node node2 = elem.getElementsByTagName("nome").item(0);
				String nome = node2.getTextContent();
				
				Node node3 = elem.getElementsByTagName("idLegislaturaInicial").item(0);
				int idLegislaturaInicial = Integer.parseInt(node3.getTextContent());
				
				Node node4 = elem.getElementsByTagName("idLegislaturaFinal").item(0);
				int idLegislaturaFinal = Integer.parseInt(node4.getTextContent());
				
				Node node5 = elem.getElementsByTagName("nomeCivil").item(0);
				String nomeCivil = node5.getTextContent();
				
				Node node6 = elem.getElementsByTagName("cpf").item(0);
				String cpf = node6.getTextContent();
				
				Node node7 = elem.getElementsByTagName("siglaSexo").item(0);
				String siglaSexo = node7.getTextContent();
				
				
				List<Node> node8 = new ArrayList<Node>();
				node8.add(elem.getElementsByTagName("urlRedeSocial").item(0));
				for (int j = 0; j < node8.size(); j++) {
					String urlRedeSocial = node8.get(j).getTextContent();
					dep.addUrlRedeSocial(urlRedeSocial);
				}
				
				
				/*
				Node node8 = elem.getElementsByTagName("urlRedeSocial").item(0);
				String urlRedeSocial = node8.getTextContent();
				dep.addUrlRedeSocial(urlRedeSocial);
				*/
				
				Node node9 = elem.getElementsByTagName("urlWebsite").item(0);
				String urlWebsite = node9.getTextContent();
				
				Node node10 = elem.getElementsByTagName("dataNascimento").item(0);
				String dataNascimento = node10.getTextContent();
				
				Node node11 = elem.getElementsByTagName("dataFalecimento").item(0);
				String dataFalecimento = node11.getTextContent();
				
				Node node12 = elem.getElementsByTagName("ufNascimento").item(0);
				String ufNascimento = node12.getTextContent();
				
				Node node13 = elem.getElementsByTagName("municipioNascimento").item(0);
				String municipioNascimento = node13.getTextContent();
				
				dep.setUri(uri);
				dep.setNome(nome);
				dep.setIdLegislaturaInicial(idLegislaturaInicial);
				dep.setIdLegislaturaFinal(idLegislaturaFinal);
				dep.setNomeCivil(nomeCivil);
				dep.setCpf(cpf);
				dep.setSiglaSexo(siglaSexo);
				// dep.addUrlRedeSocial(urlRedeSocial);
				dep.setUrlWebsite(urlWebsite);
				dep.setDataNascimento(dataNascimento);
				dep.setDataFalecimento(dataFalecimento);
				dep.setUfNascimento(ufNascimento);
				dep.setMunicipioNascimento(municipioNascimento);
				
				deps.add(dep);
			}
		}
		
		return deps;
		
	}
		
}
