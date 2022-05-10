package exercicios;

public class HerancaAssociacaoInterface {

}

class Funcionario {
	Funcionario(){
		
	}
	
	void printClasse() {
		System.out.println("Funcionario - Classe Mae");
	}
}

class Faxineiro extends Funcionario{
	Faxineiro(){
		
	}
	
	@Override
	void printClasse() {
		System.out.println("Faxineiro - Classe Filha");
	}
}

class Gerente extends Funcionario{
	Gerente(){
		
	}
	
	/*@Override
	void printClasse() {
		System.out.println("Gerente - Classe Filha");
	}*/
}

class Vendedor extends Funcionario{
	Vendedor(){
		
	}
	
	@Override
	void printClasse() {
		System.out.println("Vendedor - Classe Filha");
	}
}