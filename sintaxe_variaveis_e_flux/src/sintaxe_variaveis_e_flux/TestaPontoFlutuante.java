package sintaxe_variaveis_e_flux;

public class TestaPontoFlutuante {
	public static void main(String [] args) {
		
		double salario;
		salario = 1320.50;
		System.out.println("Em 2023, o valor salário mínimo será de R$ " + salario);
		
		//Declarar variavel e valor na mesma linha
		double idade = 19;
		
		// double / Inteiro = Double
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		//1.57
		
		//Inteiro / Inteiro = Inteiro
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		//2
		
		//double / Inteiro  = double
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		//2.5
	}
}
