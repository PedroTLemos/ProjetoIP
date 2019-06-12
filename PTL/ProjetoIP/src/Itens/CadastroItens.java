package Itens;

public class CadastroItens {
	
	private RepositorioItens inventario;
	
	public CadastroItens(RepositorioItens rep) {
		inventario = rep;
	}
	
	public void cadastrar(Item item) throws ItemJaCadastradoException{
		if(!inventario.existe(item.getNome())) {
			inventario.inserir(item);
		} else {
			throw new ItemJaCadastradoException();
		}
	}
	
	public void atualizar(Item item) throws ItemNaoEncontradoException{
		inventario.atualizar(item);
	}
	
	public void remover(String nome) throws ItemNaoEncontradoException{
		inventario.remover(nome);
	}
	
	public void procurar(String nome) throws ItemNaoEncontradoException{
		inventario.procurar(nome);
	}

}
