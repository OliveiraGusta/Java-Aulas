
package sintaxe_variaveis_e_flux;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 15, quantidadedePessoas = 3;
		boolean acompanhado = quantidadedePessoas >= 2;

		System.out.println("** Você esta de porteiro de um festa **");
		System.out.println("** Suas ordems foram claras apenas pessoas maiores de 18 e acompanhadas **");
		System.out.println(".....");
		System.out.println("** Chegam " + quantidadedePessoas + " pessoas na porta de entrada da festa **");
		System.out.println("** Um deles se aproxima **");
		if (acompanhado) {
			
			System.out.println("Voce: Todos tem mais de 18?");
				if (idade >= 18) {
					System.out.println("Pessoa: Sim somos ");
					System.out.println("Voce: Sejam Bem Vindos");
				} else {
					System.out.println("Voce: Menores nao sao permitidos");
				}
		}else {
			System.out.println("Voce:Essas festa só pode entrar acompanhado");
		}
	}
}
