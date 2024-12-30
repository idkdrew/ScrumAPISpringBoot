package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.SpringBacklog;
import br.com.alves.scrum.service.SpringBacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/springbacklog")
public class SpringBacklogController {
    @Autowired
    private SpringBacklogService springBacklogService;

    @GetMapping("/{id}")
    public ResponseEntity<SpringBacklog> findById(@PathVariable int id) {
        SpringBacklog springBacklog = springBacklogService.findById(id);
        return ResponseEntity.ok(springBacklog);
    }

    @GetMapping()
    public ResponseEntity<List<SpringBacklog>> findAll() {
        return ResponseEntity.ok(springBacklogService.findAll());
    }

    @PostMapping()
    public ResponseEntity<SpringBacklog> save(@RequestBody SpringBacklog springBacklog) {
        return ResponseEntity.ok(springBacklogService.save(springBacklog));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        springBacklogService.delete(id);
    }
}
