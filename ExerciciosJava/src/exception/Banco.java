package exception;

public class Banco{
	 	  
	private Conta[] contas;
	private int proximo;
	
	
	public Banco(Conta[] contas) {
		this.contas = contas;
	}


	private Conta procurar (String num) throws CNFException{
		
		Boolean achou = false;
		
	    for(int i=0; !achou && i<contas.length; i++){
	    	
	    	if(contas[i]!=null) {
		      if(num.equals(contas[i].getNumero())){
		    	  achou = true;
		    	  return contas [i]; 
		      }
	    	}
	    }
	    //return null;
	    throw new CNFException("Conta inexistente");
	  }

	
	void debitar(String num, double valor) 
	        throws CNFException, SaldoException{
	    procurar(num).debitar(valor);
	  }

	
	
	void debitar2(String num, double valor) 
			  				throws SaldoException, CNFException{
	    
		Conta c = procurar(num);
		
	    if(c!=null){
	      c.debitar(valor);
	    }else{
	      CNFException e;
	      e = new CNFException("Conta inexistente");
	      throw e;
	    }  
	  }
	 // ... 
}

