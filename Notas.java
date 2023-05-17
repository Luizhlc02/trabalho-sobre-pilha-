package Pilha;

import java.util.Scanner;
public class Notas<T> {
	public static <T> void main(String[]args) {
		 pilha<T> pilhaNotas = new pilha<T>();
		Scanner sc = new Scanner (System.in);
		while(true) {
		System.out.println("Digite a nota ou Digite 'sair':  ");
		String notas = sc.next();
		if (notas.equalsIgnoreCase("sair")) {
            break;
        }
		 pilhaNotas.push(notas);
		
		 System.out.println(notas);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}
}