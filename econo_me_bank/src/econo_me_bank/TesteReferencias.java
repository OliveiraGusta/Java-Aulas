package econo_me_bank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta: R$"+ segundaConta.saldo);
		
		segundaConta.saldo +=  100;
		
		System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
		
		//mesma referencia
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println("Numero da Referencia da primeira conta: " + primeiraConta);
		System.out.println("Numero da Referencia da segunda conta: " + segundaConta);
}}