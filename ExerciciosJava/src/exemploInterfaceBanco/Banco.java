package exemploInterfaceBanco;

class Banco{

   public static void main(String[] args){

      Conta conta1 = new Conta();
      Conta conta2 = new Conta(); 	
    
      conta1.creditar(10);
      conta1.creditar(20);

      conta2.creditar(34);

      conta1.showSaldo();		
      conta2.showSaldo();
   }

}
