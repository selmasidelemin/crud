package com.example.Back_Soutien_Scolaire.repository;

import com.example.Back_Soutien_Scolaire.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository  extends JpaRepository<EtudiantEntity,Long> {
}
