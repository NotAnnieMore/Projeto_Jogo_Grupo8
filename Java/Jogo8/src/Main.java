import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;
import javax.swing.*;
public class Main {
	
	static Jogo jogo = new Jogo();
	static Fila fila = new Fila();
	static Pilha pilha = new Pilha();
	static int pontuacao = 50;

	public static void main(String[] args) {

		
		
		String nomeJogador = JOptionPane.showInputDialog("Nome do Jogador: ");
		adicionarFila();
		for (int i = 0; i < 10; i++) {
			fila.mostrarFila();
			if (escolha() == true) {
				break;
			}
		}
		
//		System.out.println("Parabens " + nomeJogador + ", conseguiste!");
//		System.out.println(pontuacao + " de pontuação.");
		System.out.println(nomeJogador +"," + " ainda tinhas " + pontuacao + " movimentos.");
//		System.out.println(pontuacao + " de pontuação.");

	}

	// ========== METODOS ==========//
	
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

	public static boolean escolha() {
		//String resposta = JOptionPane.showInputDialog("Sim ou Não");
	
		int resposta = JOptionPane.YES_NO_OPTION;
		if (JOptionPane.showConfirmDialog(null, "Deseja colocar o Primeiro Objeto?", "Aviso", JOptionPane.YES_NO_OPTION)
				== JOptionPane.YES_OPTION) {
			
			if (pilha.getPilha().size() > 0) {

				if (pilha.getPilha().peek() instanceof Panela) {
					if (fila.getPecas().element() instanceof Copo) {
						System.out.println("Perdeste! Mais sorte para a proxima");
						return true;
					} else if (fila.getPecas().element() instanceof Pires) {
						System.out.println("Perdeste! Mais sorte para a proxima");
						return true;
					}
				} else if (pilha.getPilha().peek() instanceof Copo) {
					if (fila.getPecas().element() instanceof Panela) {
						System.out.println("Perdeste! Mais sorte para a proxima");
						return true;
					} else if (fila.getPecas().element() instanceof Prato) {
						System.out.println("Perdeste! Mais sorte para a proxima");
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
}
