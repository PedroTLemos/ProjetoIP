public class JCException extends Exception{
	private String nome;
	public JCException(String nome){
		super("Já existe tal...");
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
