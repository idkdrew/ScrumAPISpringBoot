package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.Papel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, Integer> {
}
