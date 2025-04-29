package com.example.etudiant.dao.repositories;

import com.example.etudiant.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    public List<Etudiant> findByEmail(String email);

    public List<Etudiant> findByPrenom(String prenom);

    List<Etudiant> prenom(String prenom);
    // Etudiant deleteEtudiant(Etudiant et1);

}
