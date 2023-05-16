package Pilha;

public class Execucao extends generica{

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		pilha.push(1);
		pilha.push(2);
		
		System.out.println(pilha.top()); 
		
	}

}
