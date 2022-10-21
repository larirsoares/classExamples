package exception;

public class SaldoException extends Exception {
	   
	   private double saldo;
	   private String numero;

	   public SaldoException(String n, double s) {
	      super("Saldo Insuficente");
	      saldo = s;
	      numero = n;
	   }
	   public double getSaldo(){
		    return saldo;
	   }
	
	}

