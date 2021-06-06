import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Main {
	
	static Jogo jogo = new Jogo();
	static Fila fila = new Fila();
	static Pilha pilha = new Pilha();
	
	public static void main(String[] args) {

		inicioVariavel();
		adicionarFila();
		
//		for (int i = 0; i < 50; i++) {
//			fila.mostrarFila();
//			escolha();
//			fila.mostrarFila();
//			escolha();
//			fila.mostrarFila();
//			escolha();
//			fila.mostrarFila();
//			escolha();
//			fila.mostrarFila();
//		}
		
		fila.mostrarFila();
		escolha();
		fila.mostrarFila();
		escolha();
		fila.mostrarFila();
		escolha();
		fila.mostrarFila();
		escolha();
		fila.mostrarFila();
		
		
		
	}

	// ========== METODOS ==========//
	
	public static void inicioVariavel() {
		Score score = new Score();
		
        Peca peca1 = new Copo();
        Peca peca2 = new Panela();
        Peca peca3 = new Prato();
        Peca peca4 = new Pires();
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
	
	public static void escolha() {
		//String resposta = JOptionPane.showInputDialog("Sim ou Não");
		
		int resposta = JOptionPane.YES_NO_OPTION;
		if (JOptionPane.showConfirmDialog(null, "Deseja colocar o Primeiro Objeto?", "Aviso", JOptionPane.YES_NO_OPTION)
				== JOptionPane.YES_OPTION) {
			pilha.push(fila.getPecas());
			fila.remover();
			pilha.torre(); 
			fila.adicionar();
			
		} else {
			//System.out.println("Objeto Retirado");
			pilha.torre(); 
		}
		
		
//		switch (resposta) {
//		case "Sim":
//		case "sim":
//			pilha.adicionar(fila.primeiroElemento());
//			
//			break;
//
//		case "Não":
//		case "não":
//		case "nao":
//			
//			break;
//		}
		
	}
	
	
	
	
	
	
}
