package com.m104.foyeruniversitaire.repository;


import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.m104.foyeruniversitaire.entity.Chambre;
import com.m104.foyeruniversitaire.entity.TypeChambre;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {





    // Trouver toutes les chambres qui sont de typ SIMPlE :
    List<Chambre> findAllByTypeC(TypeChambre tc);

















    Chambre findByNumeroChambre(Long nc);


















    /* No need to code CRUD here. Its is already in the
    interfaces provided by the framework Spring Data JPA :
       - CrudRepository or
       - PagingAndSortingRepository or
       - JpaRepository
     */





   Chambre findChambreByNumeroChambre(Long num);





    // Recperer les chambres selon le CIN de l'étudiant qui les a réservé :
    @Query("SELECT ch FROM Chambre ch " +
            "INNER JOIN ch.reservations r " +
            "INNER JOIN r.etudiants e " +
            "WHERE e.cinEtudiant=:cin ")
    List<Chambre> trouverChselonEt(long cin);



    // Créer le Service qui permet de Recperer
    // les chambres selon le CIN de l'étudiant qui les a réservé
    // Respecter la signature suivante :
    // public void List<Chambre> recupChambresSelonCIN(long cin);




}
