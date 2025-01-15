package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.DailyParticipantes;
import br.com.alves.scrum.service.DailyParticipantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dailyparticipantes")
public class DailyParticipantesController {
    @Autowired
    private DailyParticipantesService dpService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id) {
        DailyParticipantes dp = dpService.findById(id);
        return ResponseEntity.ok(dp);
    }

    @GetMapping()
    public List<DailyParticipantes> findAll() {
        return dpService.findAll();
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody DailyParticipantes dp) {
        dpService.save(dp);
        return ResponseEntity.ok(dp);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        dpService.delete(id);
    }
}
