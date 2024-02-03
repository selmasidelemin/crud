package com.example.Back_Soutien_Scolaire.controllors;


import com.example.Back_Soutien_Scolaire.entities.ProfesseurEntity;
import com.example.Back_Soutien_Scolaire.services.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professeur")
public class ProfesseurController {

    @Autowired
    private ProfesseurService professeurService;

    @GetMapping
    public List<ProfesseurEntity> getAllProfesseurs() {
        return professeurService.getAllProfesseurs();
    }

    @GetMapping("/{id}")
    public ProfesseurEntity getProfesseurById(@PathVariable Long id) {
        return professeurService.getProfesseurById(id);
    }

    @PostMapping("/add")
    public ProfesseurEntity saveProfesseur(@RequestBody ProfesseurEntity professeur) {
        return professeurService.saveProfesseur(professeur);
    }

    @PutMapping("/{id}")
    public ProfesseurEntity updateProfesseur(@PathVariable Long id, @RequestBody ProfesseurEntity professeur) {
        return professeurService.updateProfesseur(id, professeur);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id) {
        professeurService.deleteProfesseur(id);
    }
}
