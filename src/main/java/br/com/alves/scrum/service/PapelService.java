package br.com.alves.scrum.service;

import br.com.alves.scrum.model.Papel;
import br.com.alves.scrum.model.SpringBacklog;
import br.com.alves.scrum.repository.PapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PapelService {
    @Autowired
    private PapelRepository papelRepository;

    public Papel findById(int id) {
        Optional<Papel> papel = papelRepository.findById(id);
        return papel.orElse(null);
    }

    public List<Papel> findAll() {
        return papelRepository.findAll();
    }

    public Papel save(Papel papel) {
        return papelRepository.save(papel);
    }

    public void delete(int id) {
        papelRepository.deleteById(id);
    }
}
