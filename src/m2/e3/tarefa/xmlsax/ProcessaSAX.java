package m2.e3.tarefa.xmlsax;

import m2.e3.tarefa.modelo.Deputado;
import java.util.ArrayList;
import java.util.List;

public class ProcessaSAX {

	public static void main(String[] args) {
		
		MyHandlerSAX myHandler = new MyHandlerSAX();
		List<Deputado> lista = new ArrayList<Deputado>();
		
		myHandler.fazerParsing("src/m2/e3/tarefa/files/deputados.xml");	
		lista = myHandler.getDeps();
				
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i).toString() + "\n\n");
		}
		
		System.out.printf("\nExistem %d Deputados neste documento", myHandler.contadorDeputados);		
		
	}

}
