package sintaxe_variaveis_e_flux;

public class TestaCaracteres {
	public static void main(String[] args) {
		
		//Char SEMPRE ASPAS SIMPLES
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		//String SEMPRE ASPAS DUPLAS
		String palavra = "Ano que eu estou apredendo Java";
		System.out.println(palavra);
		
		palavra = palavra + " " + 2023;
		System.out.println(palavra);
	}
}
