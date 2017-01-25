package solucao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultadoVotacao {
	private List<RepresentacaoResultado> reps = new ArrayList<RepresentacaoResultado>();
	private HashMap<String,Integer> votosApurados = new HashMap<String,Integer>();
	
	public void addRepresentacaoResultado(RepresentacaoResultado r) {
		reps.add(r);
	}
	
	public void atualizarVotos(HashMap<String, Integer> votosApurados) {
		this.votosApurados = votosApurados;
		notificarAtualizacaoVotos();
	}
	
	private void notificarAtualizacaoVotos() {
		for (RepresentacaoResultado representacao : reps) {
			representacao.atualizar(votosApurados);
		}
	}
}
