package Filosofia;

import java.util.Scanner;

public class FilosofiadaReligiao extends Curso{
	int idadeMaxima;
	int idade;
	Scanner ler = new Scanner(System.in);
	@Override
	public void modalidade() {
	System.out.println("Filosofia da Religiao");
		
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
		System.out.println("Parabéns voce pode participar do curso de Filosofia da Religiao");
		
		
	}
	else {
		System.out.println("Infelizmente, voce não pode participar do nosso curso");
	}
	
}

}
