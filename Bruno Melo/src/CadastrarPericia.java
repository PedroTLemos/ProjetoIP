public class CadastrarPericia {
	private Repositorio repositorio;

	public CadastrarPericia(Repositorio repositorio) {
		this.repositorio = repositorio;
	}

	public void cadastrar(String info) throws JCException {
		this.repositorio.inserir(info);
	}

	public void remove(String info) throws NEException {
		this.repositorio.remover(info);
	}

	public boolean existe(String info) {
		return this.repositorio.existe(info);
	}

	public void atualizar(Pericia informacaoAtualizada) throws NEException{
		this.repositorio.atualizar(informacaoAtualizada);
	}

	public Pericia procurar(String info) throws NEException {
		return this.repositorio.procurar(info);
	}
}
