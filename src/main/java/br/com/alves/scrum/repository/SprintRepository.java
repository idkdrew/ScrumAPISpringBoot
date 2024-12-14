package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
