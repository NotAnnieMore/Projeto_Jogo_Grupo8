import java.util.Queue;
import java.util.Stack;

public class Jogo {

	//========== ATRIBUTOS ==========// 
	
	private Pilha pilha;
	private Fila fila;
	private Jogador jogador;

	
	//========== CONSTRUTOR - DEFAULT / ARGS ==========// 
	
	public Jogo() {
		
	}
	
	public Jogo(Pilha pilha, Fila fila, Jogador jogador) {
		super();
		this.pilha = pilha;
		this.fila = fila;
		this.jogador = jogador;
	}


	
	//========== ACESSORES - ACESSOS ==========// 
	
	public Pilha getPilha() {
		return pilha;
	}

//	public void setPilha(Pilha pilha) {
//		this.pilha = pilha;
//	}

	public Fila getFila() {
		return fila;
	}

//	public void setFila(Fila fila) {
//		this.fila = fila;
//	}

	public Jogador getJogador() {
		return jogador;
	}

//	public void setJogador(Jogador jogador) {
//		this.jogador = jogador;
//	}
	
	//========== COMPORTAMENTOS ==========// 
	
	public void adicionar() {
		getFila().getPecas().peek();
		getPilha().adicionar(fila.getPecas());
	}
	
	//========== METODOS COMPLEMENTARES ==========//
	
	
	
}
