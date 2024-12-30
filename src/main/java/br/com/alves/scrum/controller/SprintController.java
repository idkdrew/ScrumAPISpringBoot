package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.Sprint;
import br.com.alves.scrum.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sprint")
public class SprintController {
    @Autowired
    private SprintService sprintService;

    @GetMapping("/{id}")
    public ResponseEntity<Sprint> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(sprintService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Sprint>> findAll(){
        return ResponseEntity.ok(sprintService.findAll());
    }

    @PostMapping
    public ResponseEntity<Sprint> save(@RequestBody Sprint sprint){
        return ResponseEntity.ok(sprintService.save(sprint));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        sprintService.delete(id);
    }
}

