package com.example.Back_Soutien_Scolaire.services;

import com.example.Back_Soutien_Scolaire.entities.EtudiantEntity;
import com.example.Back_Soutien_Scolaire.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;
    public List<EtudiantEntity> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
    public EtudiantEntity getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }
    public EtudiantEntity saveEtudiant(EtudiantEntity etudiant) {
        return etudiantRepository.save(etudiant);}
    public EtudiantEntity updateEtudiant(Long id, EtudiantEntity etudiant) {
        EtudiantEntity existingEtudiant = etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec l'ID : " + id));

        existingEtudiant.setNom(etudiant.getNom());
        existingEtudiant.setPrenom(etudiant.getPrenom());

        return etudiantRepository.save(existingEtudiant);
    }
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }
}



