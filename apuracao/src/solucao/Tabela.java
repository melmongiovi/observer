package solucao;
import java.util.HashMap;
import java.util.Set;

public class Tabela implements RepresentacaoResultado {

	@Override
	public void atualizar(HashMap<String,Integer> votosApurados) {
		System.out.println("atualizando tabela...");
		System.out.println(votosApurados.toString());
	}




}
