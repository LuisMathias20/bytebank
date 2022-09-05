package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.deposita(50);
//		System.out.println(contaDoPaulo.saldo);
		
		boolean consegiuRetirar = contaDoPaulo.saca(20);
//		System.out.println(contaDoPaulo.saldo);
//		System.out.println(consegiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		consegiuRetirar = contaDaMarcela.transfere(100, contaDoPaulo);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
