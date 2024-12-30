package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.Projeto;
import br.com.alves.scrum.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id) {
        Projeto projeto = projetoService.findById(id);
        return ResponseEntity.ok(projeto);
    }

    @GetMapping()
    public ResponseEntity<List<Projeto>> findAll() {
        List<Projeto> projetos = projetoService.findAll();
        return ResponseEntity.ok(projetos);
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody Projeto projeto) {
        return ResponseEntity.ok(projetoService.save(projeto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        projetoService.delete(id);
    }
}
