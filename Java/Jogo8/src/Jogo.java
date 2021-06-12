import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Jogo {
	static Fila fila = new Fila();
	static Pilha pilha = new Pilha();
	static int pontuacao = 10;
	// ========== ATRIBUTOS ==========//

	private Jogador jogador;

	// ========== CONSTRUTOR - DEFAULT / ARGS ==========//

	public Jogo() {
		rodarJogo();
	}

	public Jogo(Jogador jogador) {
		super();
		this.jogador = jogador;
	}

	public Jogo(Jogo jogo) {
		this.fila = getFila();
		this.jogador = getJogador();
		this.pilha = getPilha();
	}
	
	// ========== ACESSORES - ACESSOS ==========//

	public Pilha getPilha() {
		return pilha;
	}

	public Fila getFila() {
		return fila;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	// ========== COMPORTAMENTOS ==========//

	public void rodarJogo() {
		
		String newLine = System.getProperty("line.separator");
		JOptionPane.showMessageDialog(null, "REGRAS:" + newLine
		+ newLine + "* O jogador começa com 10 movimentos, onde cada objeto " 
				+ "descartado, será descontado com -1 ponto. " + newLine 
				+ "* Caso o jogador consiga empilhar todos os objetos devidamente numa ordem "
				+ "correta, o jogo acaba." + newLine +
				newLine+ "* As ordens corretas de empilhamento são:"
				+ newLine + " - " + " 1." +" " + " O Prato pode ser empilhado em cima da Panela, Pires ou outro Prato."
				+ newLine + " - " + " 2." +" " + " A Panela pode ser empilhada em cima do Prato, Pires ou outro Panela."
				+ newLine + " - " + " 3." +" " + " O Copo pode ser empilhado em cima do Prato, Pires ou outro Copo."
				+ newLine + " - " + " 4." +" " + " O Pires pode ser empilhado em cima do Copo, Prato ou outro Pires."
				+ "" 
				);

		String nomeJogador = JOptionPane.showInputDialog("Nome do Jogador: ");
		adicionarFila();
		for (int i = 0; i < 10; i++) {
			fila.mostrarFila();
			if (escolha(nomeJogador) == true) {
				break;
			}
		} fimJogo(nomeJogador);
	}

	public static void adicionarFila() {

		for (int i = 0; i < 4; i++) {
			fila.adicionar();
		}
	}

	public static void adicionarPeca() {
		for (int i = 0; i < 1; i++) {
			fila.adicionar();
		}
	}

	public static boolean escolha(String nomeJogador) {
		
		int resposta = JOptionPane.YES_NO_OPTION;
		if (JOptionPane.showConfirmDialog(null, "Deseja colocar o Primeiro Objeto?", "Opções",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

			if (pilha.getPilha().size() > 0) {

				if (pilha.getPilha().peek() instanceof Panela) {
					if (fila.getPecas().element() instanceof Copo) {
						System.out.println("Perdeste! Mais sorte para a proxima.");
						System.out.println(nomeJogador + "," + " ainda tinhas " + pontuacao + " movimentos.");
						return true;
					} else if (fila.getPecas().element() instanceof Pires) {
						System.out.println("Perdeste! Mais sorte para a proxima.");
						System.out.println(nomeJogador + "," + " ainda tinhas " + pontuacao + " movimentos.");
						return true;
					}
				} else if (pilha.getPilha().peek() instanceof Copo) {
					if (fila.getPecas().element() instanceof Panela) {
						System.out.println("Perdeste! Mais sorte para a proxima.");
						System.out.println(nomeJogador + "," + " ainda tinhas " + pontuacao + " movimentos.");
						return true;
					} else if (fila.getPecas().element() instanceof Prato) {
						System.out.println("Perdeste! Mais sorte para a proxima.");
						System.out.println(nomeJogador + "," + " ainda tinhas " + pontuacao + " movimentos.");
						return true;
					}
				}
			}
			pilha.push(fila.getPecas());
			fila.remover();
			pilha.torre();
			fila.adicionar();
			return false;
		} else {
			fila.remover();
			fila.adicionar();
			pontuacao--;
			pilha.torre();
		}
		return false;
	}

	public void fimJogo(String nomeJogador) {
		System.out.println("Acabou " + nomeJogador +"!");
	}

	// ========== METODOS COMPLEMENTARES ==========//

	@Override
	public String toString() {
		return "Jogo [jogador=" + jogador + "]";
	}

	public Jogo clone() {
		return new Jogo(this);
	}
	
	public boolean equals(Jogo jogo) {
		if(jogo == null)
			return false;
		else if(jogo.equals(jogo.getClass()))
			return true;
		else
			return false;
	}
}
