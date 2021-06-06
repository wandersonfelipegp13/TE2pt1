package m2.e3.tarefa;

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
// import jdk.internal.org.xml.sax.SAXException;

public class MyHandlerDOM {

	public void fazerParsing(String pathArq) throws SAXException, IOException, ParserConfigurationException{
		
		File xmlFile = new File(pathArq);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = factory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);
		
		doc.getDocumentElement().normalize();
		
		// System.out.println("Elemento raiz: " + doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("despesa");
		
		System.out.printf("Quantidade de Deputados: %d\n", nList.getLength());
		
		
		for (int i = 0; i < nList.getLength(); i++) {
			
			Node nNode= nList.item(i);
			
			// System.out.println("\nElemento corrente: " + nNode.getNodeName());
			
			if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element elem = (Element) nNode;

				Node node1 = elem.getElementsByTagName("nomeParlamentar").item(0);
				String nome = node1.getTextContent();
				
				System.out.print("\n" + nome);
				
				Deputado dep = new Deputado();

			}
		}
		
	}
		
}
