package econo_me_bank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.saldo = 100;
		contaDoGustavo.deposita(50);
		
		System.out.println(contaDoGustavo.saldo);
		
		if(contaDoGustavo.saca(20)) {
			System.out.println("Saque realizado com sucesso!" );
			System.out.println("Seu saldo atual é de: R$" + contaDoGustavo.saldo);
		}else {
			System.out.println("Ocorreu um erro ao realizar o saque de: R$" + contaDoGustavo.saldo);
			System.out.println("Você não tem esse valor na conta");
		}
		
		Conta contaDaNivea = new Conta();
		contaDaNivea.deposita(1000);
		
	
		if(contaDaNivea.transfere(3000, contaDoGustavo)) {
			System.out.println("Transferencia realizada com sucesso");
			System.out.println("Seu saldo atual R$" + contaDaNivea.saldo);
		}else {
			System.out.println("Você não tem o saldo insuficente para a transferencia");
			System.out.println("Seu saldo atual é de R$" + contaDaNivea.saldo);
		}
		
		System.out.println(contaDaNivea.saldo);
		System.out.println(contaDoGustavo.saldo);
		
		
		contaDoGustavo.titular = "Gustavo Oliveira";
		System.out.println("Dono da conta: "+ contaDoGustavo.titular);

	}
}