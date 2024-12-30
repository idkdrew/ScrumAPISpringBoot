package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.Tarefa;
import br.com.alves.scrum.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("{id}")
    public ResponseEntity<Tarefa> findById(@PathVariable int id) {
        return ResponseEntity.ok(tarefaService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Tarefa>> findAll(){
        return ResponseEntity.ok(tarefaService.findAll());
    }


    @PostMapping()
    public ResponseEntity<Tarefa> save(@RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(tarefaService.save(tarefa));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        tarefaService.delete(id);
    }
}
