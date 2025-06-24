package com.aston.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.aston.foyeruniversitaire.entity.Chambre;
import com.aston.foyeruniversitaire.entity.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {


















//- Récupérer les Chambres qui ont un numero donné

    List<Chambre> findAllByNumeroChambre(Long nc);











// Trouver toutes les chambres qui sont de typ SIMPlE :
   List<Chambre> findAllByTypeC(TypeChambre tc);









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
