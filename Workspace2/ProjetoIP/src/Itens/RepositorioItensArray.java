package Itens;

public class RepositorioItensArray implements RepositorioItens{
	
	private Item[] inventario;
	private int indice;
	
	public boolean existe(String nome) {
		boolean existe = false;
		for(int i = 0; i < inventario.length && !(existe); i++) {
			if(inventario[i].getNome().equals(nome)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public void inserir(Item item) {
		inventario[indice] = item;
		indice++;
	}
	
	public void remover(String nome) throws ItemNaoEncontradoException{
		if(this.existe(nome)) {
			Item[] temporario = new Item[inventario.length - 1];
			int indicetemporario = 0;
			for(int i = 0; i < inventario.length; i++) {
				if(!(inventario[i].equals(nome))) {
					temporario[indicetemporario] = inventario[i];
					indicetemporario++;
				}
			}
			inventario = temporario;
		} else {
			throw new ItemNaoEncontradoException();
		}
	}
	
	public void atualizar(Item item) throws ItemNaoEncontradoException{
		if(this.existe(item.getNome())) {
			for(int i = 0; i < inventario.length; i++) {
				if(inventario[i].getNome().equals(item.getNome())) {
					inventario[i] = item;
				}
			}
		} else {
			throw new ItemNaoEncontradoException();
		}
	}
	
	public Item procurar(String nome) throws ItemNaoEncontradoException{
		Item itemprocurado = null;
		if(this.existe(nome)) {
			for(int i = 0; i < inventario.length; i++) {
				if(inventario[i].getNome().equals(nome)) {
					itemprocurado = inventario[i];
				}
			}
			return itemprocurado;
		} else {
			throw new ItemNaoEncontradoException();
		}
	}

}
