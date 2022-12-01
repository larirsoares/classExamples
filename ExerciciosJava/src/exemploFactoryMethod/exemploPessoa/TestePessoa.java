package exemploFactoryMethod.exemploPessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
		FactoryPessoa fabrica = new FactoryPessoa();
		String nome = "Larissa";
		String sexo = "F";
		fabrica.getPessoa(nome, sexo);
		

	}

}
