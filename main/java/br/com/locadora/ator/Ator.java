package br.com.locadora.ator;

import java.io.Serializable;
import java.util.List;

import br.com.locadora.filme.Filme;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Table(name = "ator")
@Entity(name = "ator")
@EqualsAndHashCode(of = "id")
public class Ator implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToMany
	@JoinTable(name = "filme_ator", joinColumns = @JoinColumn(name = "ator_id"), inverseJoinColumns = @JoinColumn(name = "filme_id"))
	public List<Filme> filmes;

	private String nome;
	private String pais;

	public Ator() {
		
	}
	public Ator(DadosCadastroAtor dados) {
		this.pais = dados.pais();
		this.nome = dados.nome();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void atualizarInformacoes(DadosAtualizacaoAtor dados) {
		if (dados.pais() != null) {
			this.pais = dados.pais();
		}
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
	}

}
