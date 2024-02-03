package com.example.Back_Soutien_Scolaire.entities;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "matiere", schema = "test_db", catalog = "")
public class MatiereEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
 @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatiereEntity that = (MatiereEntity) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        return result;
    }
}
