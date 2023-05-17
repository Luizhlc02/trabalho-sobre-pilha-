package Pilha;

import java.util.ArrayList;

public class generica <T> {
	
	    private ArrayList<T> pilha;
	    
	    public void Pilha() {
	        pilha = new ArrayList<T>();
	    }

	    public void push(T item) {
	        pilha.add(item);
	    }

	    public T pop() {
	        if (pilha.isEmpty()) {
	            throw new RuntimeException("Pilha vazia");
	        }
	        return pilha.remove(pilha.size() - 1);
	    }

	    public boolean isEmpty() {
	        return pilha.isEmpty();
	    }

	    public int size() {
	        return pilha.size();
	    }

	    public T top() {
	        if (pilha.isEmpty()) {
	            throw new RuntimeException("Pilha vazia");
	        }
	        return pilha.get(pilha.size() - 1);
	    }

}
	

