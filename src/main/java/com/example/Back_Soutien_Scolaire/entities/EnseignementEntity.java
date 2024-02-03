package com.example.Back_Soutien_Scolaire.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enseignement", schema = "test_db", catalog = "")

public class EnseignementEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
 @Column(name = "professeur_id")
    private int professeurId;

    public int getProfesseurId() {
        return professeurId;
    }

    public void setProfesseurId(int professeurId) {
        this.professeurId = professeurId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
  @Column(name = "etudiant_id")
    private int etudiantId;

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnseignementEntity that = (EnseignementEntity) o;

        if (professeurId != that.professeurId) return false;
        if (etudiantId != that.etudiantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professeurId;
        result = 31 * result + etudiantId;
        return result;
    }
}
