package br.com.alves.scrum.repository;

import br.com.alves.scrum.model.DailyScrum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyScrumRepository extends JpaRepository<DailyScrum, Integer> {
}
