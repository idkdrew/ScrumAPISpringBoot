package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.DailyParticipantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyParticipantesRepository extends JpaRepository<DailyParticipantes, Integer> {
}
