import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaTest {

	@Test
	public void testIsEmptyTrue() {
		Queue<Peca> fila1 = new LinkedList<>();
		System.out.println("Está vazio");
		assertTrue(fila1.isEmpty(), "A fila está vazia");
	}

	@Test
	public void testIsEmptyFalse() {
		Queue<Peca> fila6 = new LinkedList<>();
		System.out.println("Está vazio");
		fila6.add(null);
		assertFalse(fila6.isEmpty(), "A fila não está vazia");
	}

	@Test
	public void testRemover() {
		Queue<Peca> fila2 = new LinkedList<>();
		System.out.println("Remover");
		int antesSize = fila2.size();
		fila2.remove(null);
		assertEquals(antesSize, fila2.size(), "Foi removido uma peça da fila");

//	        assertThrows(IllegalArgumentException.class,() ->{
//	        	Queue<Peca> fila3 = new LinkedList<>(); 
//	            int antesSize2 = fila3.size();
//	            fila3.add(null);
//	            fila3.size();
//	        },"Não pode haver depósitos de quantias negativas ou igual a 0");
	}

	@Test
	public void testprimeiroElemento() {
		Queue<Peca> fila4 = new LinkedList<>();
		System.out.println("Primeiro Elemento");
		Peca antesPeek = fila4.peek();
		fila4.add(null);
		assertEquals(antesPeek, fila4.peek());
	}

	@Test
	public void testAdicionar() {
		Stack<Peca> pilha1 = new Stack<Peca>();
		Queue<Peca> fila5 = new LinkedList<>();
		System.out.println("Adicionar");
		int antesAdd = fila5.size();
		pilha1.add(null);
		assertEquals(antesAdd, fila5.size());
	}
}
