package generics;

public class ProdutoG2<T,U> {
	   private T codigo;
	   private String descricao;
	   private U preco;

	   public ProdutoG2(T cod, String descr, U pr) {
	        codigo = cod;
	        descricao = descr;
	        preco = pr;
	    }

	    public T getCodigo() { return codigo; }
	    public String getDescricao() { return descricao; }
	    public U getPreco() { return preco; }

	    @Override
	    public String toString() {
	        return "ProdutoG2{" + "codigo=" + codigo + ", descricao=" +
	        descricao + ", preco=" + preco + "}";
	    }
	}
