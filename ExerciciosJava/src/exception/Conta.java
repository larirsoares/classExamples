package exception;

public class Conta {
	
	private double saldo;
	private String num;
	
	
	public Conta(double saldo, String num) {
		super();
		this.saldo = saldo;
		this.num = num;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getNumero() {
		return num;
	}


	//...
	public void debitar(double valor) 
	                       throws SaldoException {
	      if(valor <= saldo) {
	         saldo = saldo - valor;
	      } else {
	         SaldoException se;
	         se = new SaldoException(num, saldo);
	         throw se; 
	      } 
	   }
	  // ...
	}


