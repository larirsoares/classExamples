package exception;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SaldoException, CNFException {
		
//		teste_debitar_simples();
//		teste_Saldo_Insuficiente();
//		teste_Conta_inexistente();
		teste_Conta_inexistente_com_trycatch();
		System.out.println("Imprime aqui");
	}
	
	public static void teste_debitar_simples() throws SaldoException {
		Conta conta = new Conta(100, "2345");
		
		conta.debitar(10000);
	}
	
	public static void teste_Saldo_Insuficiente() throws SaldoException, CNFException {
		
		Conta contas[] = new Conta[10];
		Conta conta1 = new Conta(100, "2345");
		contas[0] = conta1; 
		
		Banco banco = new Banco(contas);
		banco.debitar("2345", 200);	
		
	}
	
	public static void teste_Conta_inexistente() throws SaldoException, CNFException {
		
		Conta contas[] = new Conta[10];
		Conta conta1 = new Conta(100, "5555");
		contas[0] = conta1; 
		
		Banco banco = new Banco(contas);
		banco.debitar("1111", 200);	
		
	}
	
	public static void teste_Conta_inexistente_com_trycatch() {
		
		Conta contas[] = new Conta[10];
		Conta conta1 = new Conta(100, "5555");
		contas[0] = conta1; 
		
		Banco banco = new Banco(contas);
		try {
			banco.debitar("1111", 200);
		} catch (CNFException | SaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
