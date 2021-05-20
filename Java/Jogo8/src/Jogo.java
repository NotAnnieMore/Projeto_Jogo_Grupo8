import java.util.*;

import javax.swing.JOptionPane;

public class Jogo {

	public static void main(String[] args) {
	
		  // Creating an empty Stack
        Stack<Peca> stack = new Stack<Peca>();
  
        
        
        Peca peca1 = new Copo();
        Peca peca2 = new Panela();
        Peca peca3 = new Prato();
        Peca peca4 = new Pires();
        JOptionPane.showInputDialog("TESTE");
        // Use add() method to add elements into the Stack
        stack.add(peca1);
        stack.add(peca2);
        stack.add(peca2);
        stack.add(peca3);
        stack.add(peca4);
  
        // Displaying the Stack
        System.out.println("Stack: " + stack);
        System.out.println("==========================");   
        // Creating an iterator
        Iterator value = stack.iterator();
  
        // Displaying the values
        // after iterating through the stack
        System.out.println("Stack: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        
        System.out.println("==========================");   
        
        
        Queue<Peca> Fila1 = new LinkedList<>();
        
        Fila1.add(peca1);
        Fila1.add(peca2);
        Fila1.add(peca4);
  
        System.out.println(Fila1);
        
        System.out.println("==========================");  
        
        Peca remover = Fila1.remove();
        System.out.println("Removeu " + remover);
        
        System.out.println("==========================");  
        
        System.out.println(Fila1);
        
        System.out.println("==========================");  
        
        int size = Fila1.size();
        System.out.println("Size- "+ size);
        
        System.out.println("=========================="); 
        
        Peca primeiro = Fila1.peek();
        System.out.println("Primeiro- "+ primeiro);
        
        

        
    }
}