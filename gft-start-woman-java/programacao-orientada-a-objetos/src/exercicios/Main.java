package exercicios;

public class Main {

	public static void main(String[] args) {
		//Carro carro = new Carro("fusca", "azul", 75);
		
		//System.out.println(carro.valorTanque(6));
		
		//Faxineiro faxineiro = (Faxineiro) new Funcionario(); //downcast -> nao funciona
		Funcionario funcionario = new Vendedor(); //upcast
		Funcionario funcionario2 = new Funcionario();
		Faxineiro faxineiro = new Faxineiro();
		Vendedor vendedor = new Vendedor();
		Gerente gerente = new Gerente();
		
		funcionario.printClasse();
		funcionario2.printClasse();
		faxineiro.printClasse();
		vendedor.printClasse();
		gerente.printClasse(); //sem override / sobrescrita
	}
}
