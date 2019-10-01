
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50.0);
		System.out.println(conta.saldo);
		
		boolean conseguiuSacar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaAnd = new Conta();
		contaAnd.deposita(1000);
		
		if(contaAnd.transfere(1005, conta)) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println("Saldo conta And " + contaAnd.saldo);
		System.out.println("Saldo conta " + conta.saldo);
		
		contaAnd.titular = "Anderson Harada";
		System.out.println(contaAnd.titular);
	}

}
