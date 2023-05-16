package src;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        
		primeiraConta.saca(50);
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		
		primeiraConta.deposita(50);
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		
	}

}
