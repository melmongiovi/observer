package codigo_ruim;

import java.util.HashMap;


public class Apuracao {
	public static void main(String[] args) {
		
		Grafico grafico = new Grafico();
		Tabela tabela = new Tabela();
		
		ResultadoVotacao d = new ResultadoVotacao();
		d.setGrafico(grafico);
		d.setTabela(tabela);
		HashMap<String, Integer> votosApurados = new HashMap<String, Integer>();
		votosApurados.put("Candidato 1", 500);
		votosApurados.put("Candidato 2", 753);
		votosApurados.put("Candidato 3", 1020);
		votosApurados.put("Nulo", 40);
		votosApurados.put("Branco", 74);
        d.atualizarVotos(votosApurados);
        
        votosApurados = new HashMap<String, Integer>();
		votosApurados.put("Candidato 1", 1000);
		votosApurados.put("Candidato 2", 1854);
		votosApurados.put("Candidato 3", 4276);
		votosApurados.put("Nulo", 250);
		votosApurados.put("Branco", 630);
        d.atualizarVotos(votosApurados);
		
      
	}
}
