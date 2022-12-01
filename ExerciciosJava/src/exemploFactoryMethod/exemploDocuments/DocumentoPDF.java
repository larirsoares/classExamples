package exemploFactoryMethod.exemploDocuments;

public class DocumentoPDF implements Documento{

	@Override
	public void gravarConteudo(String conteudo) {
		System.out.println(conteudo + " salvo em PDF"); 
		
	}
	
}
