package solucao;
import java.util.HashMap;
import java.util.Set;

public class Grafico implements RepresentacaoResultado{

	@Override
	public void atualizar(HashMap<String,Integer> votosApurados) {
		System.out.println("atualizando grafico...");
		System.out.println(votosApurados.toString());
	}

}
