package Itens;

public class ItemJaCadastradoException extends Exception{
	
	public ItemJaCadastradoException() {
		super("Item já cadastrado!");
	}

}
