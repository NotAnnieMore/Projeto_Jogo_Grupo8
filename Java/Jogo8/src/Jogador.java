
public class Jogador {

	//========== ATRIBUTOS ==========// 
	
	private Score pontuacao;
	private String jogadorNome;
	
	//========== CONSTRUTOR - DEFAULT / ARGS ==========// 
	
	public Jogador() {
		
	}
	
	public Jogador(Score pontuacao, String jogadorNome) {
		super();
		this.pontuacao = pontuacao;
		this.jogadorNome = jogadorNome;
	}

	//========== ACESSORES - ACESSOS ==========// 
	
	public Score getPontuacao() {
		return pontuacao;
	}

	public String getJogadorNome() {
		return jogadorNome;
	}

	public void setJogadorNome(String jogadorNome) {
		this.jogadorNome = jogadorNome;
	}


	
	//========== COMPORTAMENTOS ==========// 
	
	
	
	//========== METODOS COMPLEMENTARES ==========//
	
	@Override
	public String toString() {
		return "Jogador [pontuacao=" + pontuacao + ", jogadorNome=" + jogadorNome + "]";
	}
	
	
	
	
	
	
}
