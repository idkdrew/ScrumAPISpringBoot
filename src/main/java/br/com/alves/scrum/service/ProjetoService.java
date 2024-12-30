package br.com.alves.scrum.service;

import br.com.alves.scrum.model.Projeto;
import br.com.alves.scrum.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto findById(int id) {
        Optional<Projeto> projeto = projetoRepository.findById(id);
        return projeto.orElse(null);
    }
    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    public Projeto save (Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public void delete (int id) {
        projetoRepository.deleteById(id);
    }
}
