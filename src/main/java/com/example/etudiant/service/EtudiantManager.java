package com.example.etudiant.service;

import com.example.etudiant.dao.entities.Etudiant;
import com.example.etudiant.dao.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantManager implements EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        List<Etudiant> etudiants = etudiantRepository.findByEmail(etudiant.getEmail());
        if (etudiants.size() > 0) {
            System.out.println("Etudiant exist déja");
            return null;
        }else{
            return etudiantRepository.save(etudiant);
        }
    }


    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant deleteEtudiant(Integer id) {
        return null;
    }

    @Override
    public List<Etudiant>getByPrenom(String prenom) {
        return etudiantRepository.findByPrenom(prenom);
    }


    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(Integer id) {
        return null;
    }


}
