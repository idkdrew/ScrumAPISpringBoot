package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.SpringBacklog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBacklogRepository extends JpaRepository<SpringBacklog, Integer> {
}
