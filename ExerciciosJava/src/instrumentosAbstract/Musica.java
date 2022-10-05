package instrumentosAbstract;

public class Musica {

	public static void afine(Instrumento i) {
	    // ...
	    i.toque();
	  }
	
	
	  public static void main(String[] args) {
	    Sopro flauta = new Sopro();
	    afine(flauta); 
	    Corda violino = new Corda();
	    afine(violino);
	    Instrumento fe = new Sopro();
	    afine(fe);	
	    
	  }
}
