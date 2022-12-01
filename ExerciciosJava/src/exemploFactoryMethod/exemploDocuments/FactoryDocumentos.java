package exemploFactoryMethod.exemploDocuments;

public class FactoryDocumentos implements IFactoryDocumentos{
	

	@Override 
	public Documento criarDocumento(EnumDocumentos tipo) throws Exception{ 
		switch (tipo) { 
			case PDF:
				return new DocumentoPDF();
			case DOCX:
				return new DocumentoDocx();
			default:
				throw new Exception("Tipo inválido");

		}
	}
}
