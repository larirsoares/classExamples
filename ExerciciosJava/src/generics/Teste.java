package generics;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "r", 2.5);		
		System.out.println(p1.toString());

		ProdutoG<String> pg1 = new ProdutoG<>("AA112","Radio",438);
		System.out.println(pg1.toString());
		
		ProdutoG<Integer> pg2 = new ProdutoG<>(112,"Radio",438);
		System.out.println(pg2.toString());
		
		ProdutoG<Double> pg3 = new ProdutoG<>(112.3,"Radio",438);
		System.out.println(pg3.toString());

		ProdutoG2<Integer, Double> pgg1 = new ProdutoG2<>(12, "desc", 34.76);
		System.out.println(pgg1.toString());

	}

}
