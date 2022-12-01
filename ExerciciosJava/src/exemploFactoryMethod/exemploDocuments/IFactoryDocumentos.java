package exemploFactoryMethod.exemploDocuments;

public interface IFactoryDocumentos {

	public Documento criarDocumento(EnumDocumentos tipo) throws Exception; 
}
