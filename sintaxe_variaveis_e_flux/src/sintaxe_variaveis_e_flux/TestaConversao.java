package sintaxe_variaveis_e_flux;

public class TestaConversao {
	public static void main(String [] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		//Variaveis Numericas
		//Int guarda até 2**32
		
		//Nao Funciona
		//float pontoFluante = 3.14;
		float pontoFluante = 3.14F;
		
		long numeroGrande = 2000000000000000L;
		short valorPequeno = 2121;
		byte b = 127;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total); //0.30000000000000004  
		
		//Explicacao Matematica = https://0.30000000000000004.com/
		
	}
}
