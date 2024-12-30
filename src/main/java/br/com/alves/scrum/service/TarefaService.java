package br.com.alves.scrum.service;

import br.com.alves.scrum.model.Tarefa;
import br.com.alves.scrum.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService{
    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa findById (int id){
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.orElse(null);
    }

    public List<Tarefa> findAll(){
        return tarefaRepository.findAll();
    }
    public Tarefa save(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }
    public void delete(int id){
        tarefaRepository.deleteById(id);
    }
}
