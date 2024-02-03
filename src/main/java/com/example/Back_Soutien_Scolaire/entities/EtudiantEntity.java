package com.example.Back_Soutien_Scolaire.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@jakarta.persistence.Table(name = "etudiant", schema = "test_db", catalog = "")
public class EtudiantEntity {
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

    @Basic
    @Column(name = "prenom")
    private String prenom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "tel")
    private String tel;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "dateNaissance")
    private Date dateNaissance;

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "niveau")
    private String niveau;

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Basic
    @Column(name = "specialite")
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Basic
    @Column(name = "adresse")
    private String adresse;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtudiantEntity that = (EtudiantEntity) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (dateNaissance != null ? !dateNaissance.equals(that.dateNaissance) : that.dateNaissance != null)
            return false;
        if (niveau != null ? !niveau.equals(that.niveau) : that.niveau != null) return false;
        if (specialite != null ? !specialite.equals(that.specialite) : that.specialite != null) return false;
        if (adresse != null ? !adresse.equals(that.adresse) : that.adresse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
        result = 31 * result + (niveau != null ? niveau.hashCode() : 0);
        result = 31 * result + (specialite != null ? specialite.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        return result;
    }
}
