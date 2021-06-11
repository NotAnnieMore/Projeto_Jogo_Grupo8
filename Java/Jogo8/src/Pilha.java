import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/**
 * A classe Pilha representa a criação e o desevolvimento de um stack para o funcionamento do jogo.
 *
 *  
 * Pretende-se construir um stack que será representado na main, 
 * na sequência da Resolução do projeto final de POO e ES.
 *    
 * @author IvoCamacho
 *
 */

public class Pilha {

	// ========== ATRIBUTOS ==========//

	//private Stack<Peca> pecas ;
    private Stack<Peca> pilha = new Stack<Peca>();

	// ========== CONSTRUTOR - DEFAULT / ARGS ==========//

	public Pilha() {
		pilha = new Stack<Peca>();

	}

	// ========== ACESSORES - ACESSOS ==========//

	public Stack<Peca> getPilha() {
		return pilha;
	}

	public void setPilha(Stack<Peca> pilha) {
		this.pilha = pilha;
	}

	// ========== COMPORTAMENTOS ==========//

	public void adicionar(Queue<Peca> pecas) {
		
		pilha.add(null);
	}

	
	public void torre() {
		Iterator torre = pilha.iterator();
//		System.out.println("Pilha:");
//		while (torre.hasNext()) {
//			System.out.println(torre.next());
//		}
		
		ListIterator<Peca> listIterator = pilha.listIterator();
		System.out.print("Peças utilizadas: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " | ");  
        }
        System.out.println(" ");
        System.out.println(" ");
		System.out.println("Pilha:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(" ");
	}

	public void fimTorre(Queue<Peca> pecas) {
		
		int tamanho = pilha.size();
		
	}
	
	public void push(Queue<Peca> pecas) {
		//pilha.push(pecas.peek());
		pilha.add(pecas.peek());
		
		
		
//	    while (!pecas.isEmpty()) {
//	    	pilha.add(pecas.peek());
//	    	pecas.remove();
//        }
	}

	public void pop(Queue<Peca> pecas) {
		if (pecas.isEmpty())
			return;
		pecas.remove();
			pilha.pop();
	}



	// ========== METODOS COMPLEMENTARES ==========//

	@Override
	public String toString() {
		return "Pilha [pilha=" + pilha + "]";
	}
	
}
