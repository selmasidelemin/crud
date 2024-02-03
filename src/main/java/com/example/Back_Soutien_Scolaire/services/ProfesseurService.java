package com.example.Back_Soutien_Scolaire.services;
import com.example.Back_Soutien_Scolaire.entities.ProfesseurEntity;
import com.example.Back_Soutien_Scolaire.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurService {
      @Autowired
    private ProfesseurRepository professeurRepository;
    public List<ProfesseurEntity> getAllProfesseurs() {
        return professeurRepository.findAll();
    }
    public ProfesseurEntity getProfesseurById(Long id) {
        return professeurRepository.findById(id).orElse(null);
    }
    public ProfesseurEntity saveProfesseur(ProfesseurEntity professeur) {
        return professeurRepository.save(professeur);
    }

    public ProfesseurEntity updateProfesseur(Long id, ProfesseurEntity professeur) {
        ProfesseurEntity existingProfesseur = professeurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professeur non trouvé avec l'ID : " + id));

        existingProfesseur.setNom(professeur.getNom());
        existingProfesseur.setPrenom(professeur.getPrenom());

        return professeurRepository.save(existingProfesseur);
    }
    public void deleteProfesseur(Long id) {
        professeurRepository.deleteById(id);
    }
}

