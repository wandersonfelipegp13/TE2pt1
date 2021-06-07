package m2.e3.tarefa.xmlsax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import m2.e3.tarefa.modelo.Deputado;
import java.util.ArrayList;
import java.util.List;

public class MyHandlerSAX extends DefaultHandler {

	private String tagAtual; // guarda a tag atual do doc xml
	public int contadorDeputados = 0; // conta quantas tags de deputados tem o doc
	private List<Deputado> deps;
	private Deputado dep;
	
	/**
	 * Metodo que executa o parsing: laço automático que varre o documento de início
	 * ao fim, disparando eventos relevantes
	 * 
	 * @param pathArq
	 */
	public void fazerParsing(String pathArq) {
		// Passo 1: Cria instância da classe SAXParser, atraves
		// da factory SAXParserFactory (padrão de projeto)
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser;

		try {
			saxParser = factory.newSAXParser();

			saxParser.parse(new File(pathArq), this);

		} catch (ParserConfigurationException | SAXException | IOException e) {
			StringBuffer msg = new StringBuffer();
			msg.append("Erro:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}

	}

	public void startDocument() {
		System.out.print("\nIniciando o Parsing...\n");
		deps = new ArrayList<Deputado>();
	}

	public void endDocument() {
		System.out.print("\nFim do Parsing...");
	}

	public void startElement(String uri, String localName, String qName, Attributes atts) {

		tagAtual = qName;
		
		if(qName.compareTo("deputado") == 0) {
			dep = new Deputado();
			contadorDeputados++;
		}
			
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		if(qName.equalsIgnoreCase("deputado"))
			deps.add(dep);
		
		tagAtual = "";
	}

	public void characters(char[] ch, int start, int length) throws SAXException {

		String texto = new String(ch, start, length);
		
		if (tagAtual.compareTo("uri") == 0) {
			// System.out.println("uri: " + texto);
			dep.setUri(texto);
		}

		if (tagAtual.compareTo("nome") == 0) {
			// System.out.println("Nome: " + texto);
			dep.setNome(texto);
		}

		if (tagAtual.compareTo("idLegislaturaInicial") == 0) {
			// System.out.println("ID Legislatura Inicial: " + texto);
			dep.setIdLegislaturaInicial(Integer.parseInt(texto));
		}

		if (tagAtual.compareTo("idLegislaturaFinal") == 0) {
			// System.out.println("idLegislaturaFinal: " + texto);
			dep.setIdLegislaturaFinal(Integer.parseInt(texto));
		}

		if (tagAtual.compareTo("nomeCivil") == 0) {
			// System.out.println("nomeCivil: " + texto);
			dep.setNomeCivil(texto);
		}

		if (tagAtual.compareTo("cpf") == 0) {
			// System.out.println("cpf: " + texto);
			dep.setCpf(texto);
		}

		if (tagAtual.compareTo("siglaSexo") == 0) {
			// System.out.println("siglaSexo: " + texto);
			dep.setSiglaSexo(texto);
		}

		if (tagAtual.compareTo("urlRedeSocial") == 0) {
			// System.out.println("urlRedeSocial: " + texto);
			dep.addUrlRedeSocial(texto);
		}

		if (tagAtual.compareTo("urlWebsite") == 0) {
			// System.out.println("urlWebsite: " + texto);
			dep.setUrlWebsite(texto);
		}

		if (tagAtual.compareTo("dataNascimento") == 0) {
			// System.out.println("dataNascimento: " + texto);
			dep.setDataNascimento(texto);
		}

		if (tagAtual.compareTo("dataFalecimento") == 0) {
			// System.out.println("dataFalecimento: " + texto);
			dep.setDataFalecimento(texto);
		}

		if (tagAtual.compareTo("ufNascimento") == 0) {
			// System.out.println("ufNascimento: " + texto);
			dep.setUfNascimento(texto);
		}

		if (tagAtual.compareTo("municipioNascimento") == 0) {
			// System.out.println("municipioNascimento: " + texto + "\n");
			dep.setMunicipioNascimento(texto);
		}
		
	}
	
	public List<Deputado> getDeps() {
		return deps;
	}

}
