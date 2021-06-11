import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Jogo {
	static Fila fila = new Fila();
	static Pilha pilha = new Pilha();
	//========== ATRIBUTOS ==========// 
	

	private Jogador jogador;
	private Score pontuacao;

	
	//========== CONSTRUTOR - DEFAULT / ARGS ==========// 
	
	public Jogo() {
		
	}
	
	public Jogo(Pilha pilha, Fila fila, Jogador jogador, Score pontuacao) {
		super();
		this.pilha = pilha;
		this.fila = fila;
		this.jogador = jogador;
		this.pontuacao = pontuacao;
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

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
		public Score getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Score pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	//========== COMPORTAMENTOS ==========// 
	
//	public static void adicionarFila() {
//		
//		for (int i = 0; i < 4; i++) {
//			fila.adicionar();
//		}
//	}
//	
//	public static void adicionarPeca() {
//		for (int i = 0; i < 1; i++) {
//			fila.adicionar();
//		}
//	}

	public void adicionar() {
		getFila().getPecas().peek();
		getPilha().adicionar(fila.getPecas());
	}
	
	//========== METODOS COMPLEMENTARES ==========//
	
	
	
}
