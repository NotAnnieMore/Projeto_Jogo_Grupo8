import java.util.Stack;

public class Pilha {

		//========== ATRIBUTOS ==========// 
		private  Stack<Peca> pecas;
	    String[] peca;         	// Store the chars in here.
	    int top;                // letters[top]: next available space.

	  //========== CONSTRUTOR - DEFAULT / ARGS ==========// 

	    public Pilha()
	    {
	    	pecas = new Stack<Peca>();
	    	peca = new String [100];
	    	top = 0;
	    }
		
		//========== ACESSORES - ACESSOS ==========// 
		
	
		
		//========== COMPORTAMENTOS ==========// 
		
		public void push (String ch)
	    {
	        // Note: what if top >= letters.length?
			peca[top] = ch;
			top ++;
	    }


	    public String pop ()
	    {
	        // Note: what if top < 0?
	        top --;
	        return peca[top];
	    }


	    public boolean isEmpty ()
	    {
	    	if (top == 0) {
	    		return true;
		}
	    	else {
	    		return false;
		}
	    }
		
		//========== METODOS COMPLEMENTARES ==========//
}
