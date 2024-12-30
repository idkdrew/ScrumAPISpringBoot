package br.com.alves.scrum.service;

import br.com.alves.scrum.model.Sprint;
import br.com.alves.scrum.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SprintService {
    @Autowired
    private SprintRepository sprintRepository;

    public Sprint findById (int id){
        Optional<Sprint> sprint = sprintRepository.findById(id);
        return sprint.orElse(null);
    }

    public List<Sprint> findAll(){
        return sprintRepository.findAll();
    }

    public Sprint save(Sprint sprint){
        return sprintRepository.save(sprint);
    }

    public void delete(int id){
        sprintRepository.deleteById(id);
    }
}
