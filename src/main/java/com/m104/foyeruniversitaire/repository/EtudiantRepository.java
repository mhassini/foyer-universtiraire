package com.m104.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.m104.foyeruniversitaire.entity.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {























    List<Etudiant> findAllByEcoleAndDateNaissanceGreaterThan(String e, Date d);



    Etudiant findEtudiantByCinEtudiant(long cin);

}
