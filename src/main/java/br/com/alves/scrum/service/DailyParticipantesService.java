package br.com.alves.scrum.service;

import br.com.alves.scrum.model.DailyParticipantes;
import br.com.alves.scrum.model.DailyScrum;
import br.com.alves.scrum.repository.DailyParticipantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DailyParticipantesService {
    @Autowired
    private DailyParticipantesRepository dpRepo;

    public DailyParticipantes findById(int id){
        Optional<DailyParticipantes> dp = dpRepo.findById(id);
        return dp.orElse(null);
    }

    public List<DailyParticipantes> findAll(){
        return dpRepo.findAll();
    }

    public DailyParticipantes save(DailyParticipantes dp){
        return dpRepo.save(dp);
    }

    public void delete(int id){
        dpRepo.deleteById(id);
    }
}
