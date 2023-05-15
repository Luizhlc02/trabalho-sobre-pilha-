package Pilha;

import java.util.List;

public class pilhagenerica <T> {
	private List<E> <T> pilha = new ArryList<T>();

	public void push (T t) {
		pilha.add(t);
	}
	public int size() {
		return pilha.size(); 
	}
	public T pop() { 
		if (isEmpty()) {
			throws new EmptyException();
		}
		return pilha.remove(size()-1);
		}
	public boolean isEmpty() {
		return pilha.isEmpty();
	}
	public T top() { 
		if (isEmpty()) {
			throws new EmptyException();
		}
		return pilha.get(size()-1);
	}

}

