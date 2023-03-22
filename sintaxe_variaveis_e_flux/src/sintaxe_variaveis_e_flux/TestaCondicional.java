package sintaxe_variaveis_e_flux;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17, quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Seja Bem Vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18 anos, mas pode entrar,"
						+ " pois esta acompanhado");
			} else {
				System.out.println("Você nao pode entrar");
			}
		}
	}
}
