package Filosofia;

import java.util.Scanner;

public class FilosofiaAntiga extends Curso{
	Scanner ler = new Scanner(System.in);
	int idade;
	int idadeMaxima;
@Override
	public void modalidade() {
	System.out.println("Filosofia Antiga");
		
	}
@Override
	public void idadeMinima() {
	
	System.out.println("Digite sua idade por favor");
	idade= ler.nextInt();
		
	}
@Override
	public void idadeMaxima() {
	
	idadeMaxima=80;
		
	}
public void descricao() {
	if(idade >= 30 || idade <= idadeMaxima) {
		System.out.println("Parabéns voce pode participar do curso de Filosofia Antiga");
		
		
	}
	else {
		System.out.println("Infelizmente, voce não pode participar do nosso curso");
	}
	
}
}
