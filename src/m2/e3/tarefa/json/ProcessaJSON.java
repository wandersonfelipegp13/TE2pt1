package m2.e3.tarefa.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class ProcessaJSON {

	public static void main(String[] args) {

		Dados arq;

		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(new FileReader("src/m2/e3/tarefa/files/deputados.json"));

			arq = gson.fromJson(br, Dados.class);

			for (int i = 0; i < arq.dados.size(); i++) {
				System.out.print(arq.dados.get(i).toString() + "\n\n");
			}

		} catch (IOException e) {
			StringBuilder msg = new StringBuilder();
			msg.append("Erro:\n");
			msg.append(e.getMessage() + "\n");
			msg.append(e.toString());
			System.out.println(msg);
		}

	}

}
