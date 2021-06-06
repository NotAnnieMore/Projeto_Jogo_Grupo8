import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Fila{

	
	//========== ATRIBUTOS ==========// 

    private  Queue<Peca> pecas = new LinkedList<>();  

    //========== CONSTRUTOR - DEFAULT / ARGS ==========// 

    public Fila() {
    	
    }
    
	public Fila(Queue<Peca> pecas) {
		super();
		this.pecas = pecas;
	}
	//========== ACESSORES - ACESSOS ==========// 
	
    public Queue<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(Queue<Peca> pecas) {
		this.pecas = pecas;
	}
    
	//========== COMPORTAMENTOS ==========// 

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

	public void adicionarPeca() {
		
	}
	
	public void remover() {
		pecas.remove(pecas.peek());
    	//pecas.remove();
    }
	
    public void primeiroElemento() {
    	pecas.peek();
    }
    
    public void mostrarFila() {
    	System.out.println(pecas);
    }
    
    
    
    
    public void baralhar() {
    	Collections.shuffle((List<?>) pecas);
    }
	//========== METODOS COMPLEMENTARES ==========//

	@Override
	public String toString() {
		return "Fila [pecas=" + pecas + "]";
	}


 
    
    

}
