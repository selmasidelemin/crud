package com.example.Back_Soutien_Scolaire.controllors;


import com.example.Back_Soutien_Scolaire.entities.EtudiantEntity;
import com.example.Back_Soutien_Scolaire.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")

public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public List<EtudiantEntity> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public EtudiantEntity getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    }

    @PostMapping("/add")
    public EtudiantEntity saveEtudiant(@RequestBody EtudiantEntity etudiant) {
        return etudiantService.saveEtudiant(etudiant);
    }

    @PutMapping("/{id}")
    public EtudiantEntity updateEtudiant(@PathVariable Long id, @RequestBody EtudiantEntity etudiant) {
        return etudiantService.updateEtudiant(id, etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.deleteEtudiant(id);
    }

}
