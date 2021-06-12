import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/**
 * A classe Pilha representa a cria��o e o desevolvimento de um stack para o funcionamento do jogo.
 *
 *  
 * Pretende-se construir um stack que ser� representado na main, 
 * na sequ�ncia da Resolu��o do projeto final de POO e ES.
 *    
 * @author IvoCamacho
 *
 */

public class Pilha {

	// ========== ATRIBUTOS ==========//

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
	
	public void torre() {
		ListIterator<Peca> listIterator = pilha.listIterator();
		System.out.print("Peças utilizadas: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " | ");  
        }
        System.out.println(" ");
        System.out.println(" ");
		System.out.println("Pilha:");
		System.out.println(" ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(" ");
	}
	
	public void push(Queue<Peca> pecas) {
		pilha.add(pecas.peek());
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
