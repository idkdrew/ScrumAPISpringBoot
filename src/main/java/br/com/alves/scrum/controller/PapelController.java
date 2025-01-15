package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.Papel;
import br.com.alves.scrum.model.Projeto;
import br.com.alves.scrum.service.PapelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/papel")
public class PapelController {
    @Autowired
    private PapelService papelService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id) {
        Papel papel = papelService.findById(id);
        return ResponseEntity.ok(papel);
    }

    @GetMapping()
    public ResponseEntity<List<Papel>> findAll() {
        List<Papel> papels = papelService.findAll();
        return ResponseEntity.ok(papels);
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody Papel papel) {
        return ResponseEntity.ok(papelService.save(papel));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        papelService.delete(id);
    }
}
