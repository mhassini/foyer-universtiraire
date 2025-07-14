package com.m104.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.m104.foyeruniversitaire.entity.Bloc;

import java.util.List;




@Repository
 public interface BlocRepository extends JpaRepository<Bloc, Long> {

 // CrudRepository
 // PagingAndSortingRepository
 // JpaRepository









 //Récupérer les Blocs qui ont une capacité supérieure à 50
 List<Bloc> findAllByCapaciteBlocGreaterThan(Long c);















// "SELECT * FROM Bloc WHERE capaciteBloc > c"


    


 //- Récupérer tous les Blocs qui ont un nom qui commence par "Bl"
 List<Bloc> findAllByNomBlocStartingWith(String nb);

 //Récupérer tous les Blocs qui ont un nom qui commence par "Bl"
 //et une capacité supérieure à  une valeur donnée

 List<Bloc> findAllByNomBlocStartingWithAndCapaciteBlocGreaterThan(String nb, Long capaciteBloc);



//Récupérer le bloc qui a un nom donné
    Bloc findBlocByNomBloc(String nomBloc);



















 // Récupérer les Blocs qui ont une capacité supérieure à 50 :
















   List<Bloc> findAllByCapaciteBlocGreaterThan(long c);
















   // Récupérer les Blocs qui ont une capacité inférieurs à 50 :
   List<Bloc> findAllByCapaciteBlocLessThan(long c);


    // Récupérer tous les Blocs qui ont un nom qui commence par "Bl" :
   //List<Bloc> findAllByNomBlocStartingWith(String c);


    // Récuprer tous les blocs qui ont un nom donné et une capacité donnée :
   List<Bloc> findAllByNomBlocAndCapaciteBloc (String nom , long capacite );


    // Récupérer le bloc qui a un nom donné :
    Bloc findByNomBloc (String nom);















    /* No need to code CRUD here. Its is already in the
    interfaces provided by the framework Spring Data JPA :
       - CrudRepository or
       - PagingAndSortingRepository or
       - JpaRepository
     */


    Bloc findBlocByNomBlocAndCapaciteBlocGreaterThan(String nb, long c);

    // List des blocs non affectés à aucun foyer :
    List<Bloc> findAllByFoyerIsNull();


    //Bloc findByC
    //List<Foyer> findAllByFoyerIsNull();




}
