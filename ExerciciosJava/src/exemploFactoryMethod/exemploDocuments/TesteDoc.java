package exemploFactoryMethod.exemploDocuments;

public class TesteDoc {

	public static void main(String[] args) {
		
			
		try {
			
			IFactoryDocumentos fabrica = new FactoryDocumentos();
			Documento pdf = fabrica.criarDocumento(EnumDocumentos.PDF);
			Documento docx = fabrica.criarDocumento(EnumDocumentos.DOCX);
			
			pdf.gravarConteudo("Conteúdo PDF");
			docx.gravarConteudo("Conteúdo DOCX");
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		

	}

}
