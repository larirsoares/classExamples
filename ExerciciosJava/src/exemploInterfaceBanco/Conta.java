package exemploInterfaceBanco;

class Conta implements IConta{
    private double saldo;   
   
    public void creditar(double valor){
       saldo = saldo + valor;
    }
    public void creditarPirata(double valor){
       saldo =saldo + valor -1;
    } 
   
    public void debitar(double valor){
       saldo = saldo - valor;
    }

    public void showSaldo(){
       System.out.println("Saldo= "+saldo);
    }

   
}

