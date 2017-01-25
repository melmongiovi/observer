package codigo_ruim;
import java.util.HashMap;

public class ResultadoVotacao {
	
	private HashMap<String,Integer> votosApurados;
	private Grafico grafico;
	private Tabela tabela;
	
	public void atualizarVotos(HashMap<String, Integer> votosApurados) {
		this.votosApurados = votosApurados;
		grafico.atualizar(votosApurados);
		tabela.atualizar(votosApurados);
	}
	
	public Grafico getGrafico() {
		return grafico;
	}

	public void setGrafico(Grafico grafico) {
		this.grafico = grafico;
	}

	public Tabela getTabela() {
		return tabela;
	}

	public void setTabela(Tabela tabela) {
		this.tabela = tabela;
	}


}
