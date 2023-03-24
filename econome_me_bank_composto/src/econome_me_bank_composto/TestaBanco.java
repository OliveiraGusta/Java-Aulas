package econome_me_bank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente gustavo = new Cliente();
		gustavo.nome = "Gustavo Oliveira";
		gustavo.cpf = "333.333.33-33";
		gustavo.profissao  = "Programador";
		
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.deposita(100);
		
		//Associa o Cliente Gustavo a contaDoGustavo
		contaDoGustavo.titular = gustavo;
		System.out.println(contaDoGustavo.titular.nome);
		System.out.println(gustavo.nome);

	}
}
