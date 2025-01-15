package br.com.alves.scrum.controller;

import br.com.alves.scrum.model.DailyScrum;
import br.com.alves.scrum.service.DailyScrumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dailyscrum")
public class DailyScrumController {
    @Autowired
    private DailyScrumService dailyScrumService;

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id) {
        DailyScrum dailyScrum = dailyScrumService.findById(id);
        return ResponseEntity.ok(dailyScrum);
    }

    @GetMapping()
    public List<DailyScrum> findAll() {
        return dailyScrumService.findAll();
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody DailyScrum dailyScrum) {
        dailyScrumService.save(dailyScrum);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        dailyScrumService.delete(id);
    }
}
