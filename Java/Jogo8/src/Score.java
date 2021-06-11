
public class Score {

	//========== ATRIBUTOS ==========// 
	
	private int pontuacao = 50;
	
	//========== CONSTRUTOR - DEFAULT / ARGS ==========// 
	
	
	
	//========== ACESSORES - ACESSOS ==========// 
	
	
	
	//========== COMPORTAMENTOS ==========// 
	
	public void contador() {
		for (int i = 50; i < 0; i--) {
			pontuacao = pontuacao - 1;
		}
	}

	//========== METODOS COMPLEMENTARES ==========//
	
		@Override
	public String toString() {
		return "[Pontuação = " + pontuacao + " ]";
	}
	
}
