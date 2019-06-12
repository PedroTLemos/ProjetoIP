public class NEException extends Exception{
	private String nome;
	public NEException(String nome){
		super("Não existe tal...");
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
} 	