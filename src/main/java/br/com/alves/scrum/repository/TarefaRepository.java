package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
    Tarefa findByNome(String name);
}
