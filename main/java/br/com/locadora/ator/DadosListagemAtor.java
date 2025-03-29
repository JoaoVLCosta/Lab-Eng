package br.com.locadora.ator;

public record DadosListagemAtor(Long id, String pais, String nome) {
	public DadosListagemAtor(Ator ator) {
		this(ator.getId(), ator.getPais(), ator.getNome());
	}
}
