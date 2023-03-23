package econo_me_bank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta =  new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: R$" + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.numero);
		
		segundaConta.agencia = 25;
		
		System.out.println("Agora a segunda conta esta na agencia: " + segundaConta.agencia);
		
		//2 news
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Contas diferentes");
		}
		System.out.println("Numero da Referencia da primeira conta: " + primeiraConta);
		System.out.println("Numero da Referencia da segunda conta: " + segundaConta);
	}
	
}