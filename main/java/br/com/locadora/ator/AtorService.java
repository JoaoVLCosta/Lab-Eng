package br.com.locadora.ator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.locadora.ator.Ator;
import br.com.locadora.ator.AtorRepository;

@Service
public class AtorService {
	@Autowired
	private AtorRepository repository;
	
	public List<Ator> getAllAtor() {
		return repository.findAll(Sort.by("nome").ascending());
	}
	public Ator getFilmeById(Long id) {
		return repository.getReferenceById(id);
	}

}
