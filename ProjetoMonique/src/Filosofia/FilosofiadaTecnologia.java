package Filosofia;

import java.util.Scanner;

public class FilosofiadaTecnologia extends Curso{
	int idade;
	int idadeMaxima;
	Scanner ler = new Scanner(System.in);
	@Override
	public void modalidade() {
	System.out.println("Filosofia da Tecnologia");
		
	}
@Override
	public void idadeMinima() {
	System.out.println("Digite sua idade");
	idade = ler.nextInt();
		
	}
@Override
	public void idadeMaxima() {
	
	idadeMaxima=80;
		
	}
public void descricao() {
	if(idade >= 30 || idade <= idadeMaxima) {
		System.out.println("Parabéns voce pode participar do curso de Filosofia da Tecnologia");
		
		
	}
	else {
		System.out.println("Infelizmente, voce não pode participar do nosso curso");
	}
	
}

}
