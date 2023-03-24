package econome_me_bank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaNivea = new Conta();
		System.out.println(contaDaNivea.saldo);
		
		contaDaNivea.titular = new Cliente();
		System.out.println(contaDaNivea.titular);
		
		contaDaNivea.titular.nome = "Nivea";
		System.out.println(contaDaNivea.titular.nome);
	}
	
}
