package com.m104.foyeruniversitaire.repository;


import com.m104.foyeruniversitaire.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String>
{


//- Récupérer toutes les resevations valides
    List<Reservation> findAllByEstValideIsTrue();


    // 0 Code : CRUD
    // code semi prêt : Keywords
    // code à faire : JPQL




    /* No need to code CRUD here. Its is already in the
    interfaces provided by the framework Spring Data JPA :
       - CrudRepository or
       - PagingAndSortingRepository or
       - JpaRepository
     */

    /* Keywords : */

    // Je voudrais toutes les réservations avant en 2024 et qui sont invalides.
    List<Reservation> findAllByAnneeUniversitaireBeforeAndEstValide(Date d, boolean b );

}



