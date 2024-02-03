package com.example.Back_Soutien_Scolaire.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "professeur_matiere", schema = "test_db", catalog = "")

public class ProfesseurMatiereEntity {
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
   @Column(name = "matiere_id")
    private int matiereId;

    public int getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(int matiereId) {
        this.matiereId = matiereId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfesseurMatiereEntity that = (ProfesseurMatiereEntity) o;

        if (professeurId != that.professeurId) return false;
        if (matiereId != that.matiereId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professeurId;
        result = 31 * result + matiereId;
        return result;
    }
}
