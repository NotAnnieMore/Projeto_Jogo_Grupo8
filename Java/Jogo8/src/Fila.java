import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Fila{
	/**
	 * A classe Fila representa a criação e o desevolvimento de um Queue para o funcionamento do jogo.
	 *
	 *  
	 * Pretende-se construir um queue que serÃ¡ representado na main, 
	 * na sequência da <b>Resoluçãoo do projeto final de POO e ES.</b>
	 * 
	 * Foi implementada a <b>Boa Prática</b> de Verificar a Validade dos Parámetros,
	 * @see <a href="https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf" target="_blank">Item 49 Check Parameters for Validity</a>  
	 * @see <a href="https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997" target="_blank">Effective Java</a>
	 *    
	 * @author GuilhermeNunes
	 *
	 */
	
	//========== ATRIBUTOS ==========// 
	
	/**
	 * 
	 * Criação de um novo queue chamado <b>pecas</b>.
	 * 
	 */
    private  Queue<Peca> pecas = new LinkedList<>();  

    //========== CONSTRUTOR - DEFAULT / ARGS ==========// 
    
    /**
     * 
     * Construtor da fila.
     * 
     */
    public Fila() {
    	
    }
    /**
     * 
     * Construtor da fila, tendo em conta o uso do super(), para chamar o construtor da classe mãe.
     * @param Queue<Peca> pecas , Objeto Peças que está dentro da Fila.
     * 
     */
	public Fila(Queue<Peca> pecas) {
		super();
		this.pecas = pecas;
	}
	//========== ACESSORES - ACESSOS ==========// 
	
	 /**
     * 
     * Acessor para consultar a fila.
     * @return a uma fila.
     * 
     */
    public Queue<Peca> getPecas() {
		return pecas;
	}
	 /**
     * 
     * Acessor para definir a fila, e indica que esta fila vai se igualar a uma nova fila.
     * 
     */
	public void setPecas(Queue<Peca> pecas) {
		this.pecas = pecas;
	}
    
	//========== COMPORTAMENTOS ==========// 
	
	 /**
     * 
     * Criaçãoo das peças por <b>herança</b>.
     * <b>Gerador e atribuidor</b> das respestivas peças para um determinado número, para que se possa chamar as peças criadas na nossa fila.
     * 
     */
	public void adicionar() {
		Peca peca1 = new Prato();
		Peca peca2 = new Pires();
		Peca peca3 = new Panela();
		Peca peca4 = new Copo();
		
		int x = (int) (1 + Math.random() * 4);

		switch (x) {
		case 1: 
			pecas.add(peca1);
			   break;
		case 2: 
			pecas.add(peca2);
			   break;
		case 3: 
			pecas.add(peca3);
			   break;
		case 4: 
			pecas.add(peca4);
			   break;
		default:
			break;
		}	
    }
	
	 /**
     * 
     * Remove a peça da posição 0, usando <b>'pecas.peek'</b> para verificar a peça em questão.
     * @throws NullPointerException caso a nossa fila esteja vazia.
     * 
     */
	public void remover() {
		pecas.remove(pecas.peek());
    }
	
	 /**
     * 
     * Verifica a peçaa na fila da posição 0, usando <b>'pecas.peek'</b>.
     * 
     */
    public void primeiroElemento() {
    	pecas.peek();
    }
    
    /**
     * 
     * Output que mostra fila ja gerada na nossa consola.
     * @throws NullPointerException caso a nossa fila esteja vazia.
     * 
     */
    public void mostrarFila() {
    	System.out.println("================================");
    	System.out.println(pecas);
    	System.out.println("================================");
    }
    
	//========== METODOS COMPLEMENTARES ==========//

	@Override
	public String toString() {
		return "Fila [pecas=" + pecas + "]";
	}
}
