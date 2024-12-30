package br.com.alves.scrum.service;

import br.com.alves.scrum.model.SpringBacklog;
import br.com.alves.scrum.repository.SpringBacklogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpringBacklogService {
    @Autowired
    private SpringBacklogRepository springBacklogRepository;

    public SpringBacklog findById(int id) {
        Optional<SpringBacklog> springBacklog = springBacklogRepository.findById(id);
        return springBacklog.orElse(null);
    }

    public List<SpringBacklog> findAll() {
        return springBacklogRepository.findAll();
    }

    public SpringBacklog save(SpringBacklog springBacklog) {
        return springBacklogRepository.save(springBacklog);
    }

    public void delete(int id) {
        springBacklogRepository.deleteById(id);
    }
}
