package br.com.alves.scrum.service;

import br.com.alves.scrum.model.DailyScrum;
import br.com.alves.scrum.repository.DailyScrumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DailyScrumService {
    @Autowired
    private DailyScrumRepository dailyScrumRepository;

    public DailyScrum findById(int id){
        Optional<DailyScrum> dailyScrum = dailyScrumRepository.findById(id);
        return dailyScrum.orElse(null);
    }

    public List<DailyScrum> findAll(){
        return dailyScrumRepository.findAll();
    }

    public DailyScrum save(DailyScrum dailyScrum){
        return dailyScrumRepository.save(dailyScrum);
    }

    public void delete(int id){
        dailyScrumRepository.deleteById(id);
    }
}
