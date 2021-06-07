package m2.e3.tarefa.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import m2.e3.tarefa.modelo.Deputado;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class ProcessaJSON {
	
	public static void main(String[] args) {
		
		Dados arq;
		
		/*
		String aux = "[{'uri':'https://dadosabertos.camara.leg.br/api/v2/deputados/2','nome':'LOPES GAMA','idLegislaturaInicial': 1,'idLegislaturaFinal':2,'nomeCivil':'Caetano Maria Lopes Gama','siglaSexo':'M','urlRedeSocial':[],'urlWebsite':'','dataNascimento':'1795-08-05','dataFalecimento':'1864-06-21','ufNascimento': 'PE','municipioNascimento': 'Recife'}, { 'uri': 'https://dadosabertos.camara.leg.br/api/v2/deputados/7', 'nome': 'CARNEIRO', 'idLegislaturaInicial': 1, 'idLegislaturaFinal': 1, 'nomeCivil': 'Francisco Carneiro de Campos', 'siglaSexo': 'M', 'urlRedeSocial': [], 'urlWebsite': '', 'dataNascimento': '1776-01-01', 'dataFalecimento': '1842-12-08', 'ufNascimento': 'BA', 'municipioNascimento': 'Salvador'}]";
		
		Gson gson = new Gson(); 

		Deputado d[] = gson.fromJson(aux, Deputado[].class);

		System.out.print(d[0].toString() + "\n\n" + d[1].toString());
		*/
		
		// List<Deputado> deps = new ArrayList<Deputado>();
		
		Gson gson = new Gson();

		try {
						
			Deputado dep;
			// dep = new Deputado();
			
			// BufferedReader br = new BufferedReader(new FileReader("src/m2/e3/tarefa/files/deputados.json"));
			BufferedReader br = new BufferedReader(new FileReader("src/m2/e3/tarefa/files/teste.json"));
			
			arq = gson.fromJson(br, Dados.class);
			 
			System.out.print(arq.dados.get(0));
			
		} catch (IOException e) {
			StringBuilder msg = new StringBuilder();
			msg.append("Erro:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}
	
	}
	
}
