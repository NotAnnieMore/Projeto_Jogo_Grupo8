import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

/**
 * A classe Pilha representa a criação e o desevolvimento de um stack para o funcionamento do jogo.
 *
 *  
 * Pretende-se construir um stack que serÃ¡ representado na main, 
 * na sequêcia da <b>Resolução do projeto final de POO e ES.</b>
 * 
 * Foi implementada a <b>Boa Prática</b> de Verificar a Validade dos Parâmetros,
 * @see <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Item 49 Check Parameters for Validity</a>  
 * @see <a href="https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997" target="_blank">Effective Java</a>
 *    
 * @author IvoCamacho
 *
 */

public class Pilha {

	// ========== ATRIBUTOS ==========//
	
	/**
	 * 
	 * Criação de um novo stack chamado <b>Pilha</b>.
	 * 
	 */
    private Stack<Peca> pilha = new Stack<Peca>();

	// ========== CONSTRUTOR - DEFAULT / ARGS ==========//
    
    /**
     * 
     * Construtor da pilha, igualando a pilha às classes Stack do <b>tipo Peca</b>.
     * 
     */
	public Pilha() {
		pilha = new Stack<Peca>();

	}

	// ========== ACESSORES - ACESSOS ==========//

	 /**
     * 
     * Acessor para consultar a pilha.
     * @return a uma pilha.
     * 
     */
	public Stack<Peca> getPilha() {
		return pilha;
	}
	
	 /**
     * 
     * Acessor para definir a pilha, e indica que esta pilha vai se igualar a uma nova pilha.
     * 
     */
	public void setPilha(Stack<Peca> pilha) {
		this.pilha = pilha;
	}

	// ========== COMPORTAMENTOS ==========//
	
	 /**
     * 
     * Expõe e gera o output das decisões do jogador na consola em formato de torre / pilha.
     * O <b>listIterator.hasNext</b> é o responsável por mostrar na consola as peças que o jogador utilizou.
     * O <b>listIterator.hasPrevious</b> é o responsável por mostrar na consola as peças referidas pelo .hasNext.
     * 
     */
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
	
	 /**
     * 
     * Adiciona na <b>Pilha</b> o elemento que se encontra na posição 0 na fila, usando <b>pecas.peek()</b>
     * @param Queue<Peca> pecas , Objeto Peças que estão dentro da Fila.
     * 
     */
	public void push(Queue<Peca> pecas) {
		pilha.add(pecas.peek());
	}
	
	 /**
     * 
     * Retira na <b>Pilha</b> o elemento que se encontra na posição mais acima na pilha.
     * @param Queue<Peca> pecas , Objeto Peças que está dentro da Fila.
     * @return Indica se a pilha está vazia.
     * 
     */
	public void pop(Queue<Peca> pecas) {
		if (pilha.isEmpty())
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
