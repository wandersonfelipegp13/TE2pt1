package m2.e3.tarefa.json;

import java.util.ArrayList;
import java.util.List;

import m2.e3.tarefa.modelo.Deputado;

public class Dados {
	
	public List<Deputado> dados;

	public String getDeputados() {
		return dados.toString();
	}

	public void addDeputados(Deputado deputados) {
		if(this.dados == null)
			this.dados = new ArrayList<Deputado>();
		this.dados.add(deputados);
	}
	

}
