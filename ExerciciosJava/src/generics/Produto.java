package generics;

public class Produto{
   private int codigo;
   private String descricao;
   private double preco;

   public Produto(int cod, String descr,double pr) {
       codigo = cod;
       descricao = descr;
       preco = pr;
   }

   public int getCodigo() { return codigo; }

   public String getDescricao() { return descricao;  }

   public double getPreco() { return preco; }

   @Override
   public String toString() {
       return "Produto{" + "codigo=" + 
       codigo + ", descricao=" + descricao +                             
       ", preco=" + preco + '}';
    }   
}
