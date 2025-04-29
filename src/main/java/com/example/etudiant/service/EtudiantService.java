package com.example.etudiant.service;

import com.example.etudiant.dao.entities.Etudiant;

import java.util.List;


public interface EtudiantService {

    public Etudiant saveEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public Etudiant deleteEtudiant(Integer id);
    public List<Etudiant> findAllEtudiants();
    public List<Etudiant> getByPrenom(String prenom);
    public Etudiant findById(Integer id);

}
