package exemploFactoryMethod.exemploDocuments;

public class DocumentoDocx implements Documento{ 
	
	@Override 
	public void gravarConteudo(String conteudo) { 
		System.out.println(conteudo + " salvo em Docx"); 
	}


}
