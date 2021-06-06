package m2.e3.tarefa;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
// import jdk.internal.org.xml.sax.SAXException;

public class TesteDOM {

	public static void main(String[] args) {
		
		try {
			MyHandlerDOM myExempleDOM = new MyHandlerDOM();
			
			myExempleDOM.fazerParsing("src/m2/e3/tarefa/files/teste.xml");
		} catch (ParserConfigurationException | SAXException | IOException e) {
			StringBuilder msg = new StringBuilder();
			msg.append("Erro:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}

	}

}
