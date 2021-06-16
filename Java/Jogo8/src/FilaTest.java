import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;
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
//	        	fila3.isEmpty();
//	        	fila2.remove();
//	            int antesSize2 = fila3.size();
//	            fila3.add(null);
//	            fila3.size();
//	        },"Não pode remover peças, quando a fila está vazia");
	}

	@Test
	public void testprimeiroElemento() {
		Queue<Peca> fila4 = new LinkedList<>();
		System.out.println("Primeiro Elemento");
		Peca antesPeek = fila4.peek();
		fila4.add(null);
		assertEquals(antesPeek, fila4.peek());
//		assertThrows(IllegalArgumentException.class,() ->{
//			fila4.isEmpty();
//			fila4.peek();
//		}, "Não pode ver o primeiro elemento, se a fila estiver vazia");
	}

    @Test
    public void testAdicionarElementosFila() {
    	Queue<Peca> fila7 = new LinkedList<>();
        int numeroAdicionar = 4;
        for (int i = 0; i < numeroAdicionar; i++) {
        	fila7.add(null);
        }
        assertTrue(!fila7.isEmpty());
        assertEquals(fila7.size(), numeroAdicionar, "Foi adicionado um objeto na fila");
    }
	
    
//	@Test
//	public void testAdicionar() {
//		Stack<Peca> pilha1 = new Stack<Peca>();
//		Queue<Peca> fila5 = new LinkedList<>();
//		System.out.println("Adicionar");
//		int antesAdd = fila5.size();
//		pilha1.add(null);
//		assertEquals(antesAdd, fila5.size());
//	}
	
	@Test
	public void testSize() {
		Queue<Peca> fila6 = new LinkedList<>();
		System.out.println("Teste Size");
		assertEquals(0, fila6.size());
		fila6.add(null);
		assertEquals(1, fila6.size());
		fila6.add(null);
		assertEquals(2, fila6.size());
		fila6.add(null);
		assertEquals(3, fila6.size());
	}
}
