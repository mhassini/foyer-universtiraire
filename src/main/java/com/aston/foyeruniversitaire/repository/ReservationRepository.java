package com.aston.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aston.foyeruniversitaire.entity.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String>
{


//- Récupérer toutes les resevations valides
    List<Reservation> findAllByEstValideIsTrue();








    /* No need to code CRUD here. Its is already in the
    interfaces provided by the framework Spring Data JPA :
       - CrudRepository or
       - PagingAndSortingRepository or
       - JpaRepository
     */

    /* Keywords : */

    List<Reservation> findAllByAnneeUniversitaireBeforeAndEstValide(Date d, boolean b );

}



