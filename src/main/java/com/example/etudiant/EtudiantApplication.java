package com.example.etudiant;

import com.example.etudiant.dao.entities.Etudiant;
import com.example.etudiant.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EtudiantApplication implements CommandLineRunner {

    @Autowired
    private EtudiantService etudiantService;
    public static void main(String[] args) {
        SpringApplication.run(EtudiantApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Etudiant et1 = new Etudiant();
        et1.setEmail("mam@gmail.com");
        et1.setNom("mam");
        et1.setPrenom("m");

       System.out.println(etudiantService.saveEtudiant(et1));

        Etudiant et2 = new Etudiant();
        et2.setEmail("mari@gmail.com");
        et2.setNom("mam");
        et2.setPrenom("m");

        System.out.println(etudiantService.saveEtudiant(et2));

        Etudiant et3 = new Etudiant();
        et3.setEmail("bab@gmail.com");
        et3.setNom("mam");
        et3.setPrenom("m");

        System.out.println(etudiantService.saveEtudiant(et3));

        Etudiant et4 = new Etudiant();
        et4.setEmail("mam@gmail.com");
        et4.setNom("mam");
        et4.setPrenom("m");

        System.out.println(etudiantService.saveEtudiant(et4));

        etudiantService.getByPrenom("mam").forEach(System.out::println);



    }

}
