import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Fila{

	
	//========== ATRIBUTOS ==========// 

    private  Queue<Peca> pecas;      

    //========== CONSTRUTOR - DEFAULT / ARGS ==========// 

    public Fila() {
    	
    }
    
	public Fila(Queue<Peca> pecas) {
		super();
		this.pecas = pecas;
	}
	//========== ACESSORES - ACESSOS ==========// 
	
  
    
	//========== COMPORTAMENTOS ==========// 

	public void adicionar() {
    	pecas.add(null);
    }
    
    public void remover() {
    	pecas.remove();
    }
	
    public void primeiroElemento() {
    	pecas.peek();
    }
    
    public void baralhar() {
    	Collections.shuffle((List<?>) pecas);
    }
	//========== METODOS COMPLEMENTARES ==========//
}
