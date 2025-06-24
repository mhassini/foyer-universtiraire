package com.aston.foyeruniversitaire.service;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.aston.foyeruniversitaire.entity.Bloc;
import com.aston.foyeruniversitaire.repository.BlocRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j  // Simple Loggining Façade For Java
public class BlocServiceImpl  implements IBlocService {


    private final BlocRepository blocRepository;


   public List<Bloc> retrieveAllBlocs() {

        List<Bloc> listB = blocRepository.findAll();
        return listB;
    }












    // Exemple sans Keywords :
    @Transactional
    public List<Bloc> retrieveBlocsSelonCapacite(long c) {

        List<Bloc> listB = blocRepository.findAll();
        List<Bloc> listBselonC = new ArrayList<>();


        return listBselonC;
    }


    public Bloc retrieveBloc(Long blocId) {

        return blocRepository.findById(blocId).get();

    }


    public Bloc addBloc(Bloc c) {

        return blocRepository.save(c);
    }

    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }


    public List<Bloc> trouverBlocsSansFoyer() {
        return blocRepository.findAllByFoyerIsNull();
    }

    public List<Bloc> trouverBlocsParNomEtCap(String nb, long c) {
        return blocRepository.findAllByNomBlocAndCapaciteBloc(nb,  c);
    }


    public void ajouterBloc() {

        try {
            // code
            //....
            //
        } catch (Exception i) {
            //...
            //
        } finally {
            // code
            //
        }


    }


}
