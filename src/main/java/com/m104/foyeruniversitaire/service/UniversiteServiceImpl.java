package com.m104.foyeruniversitaire.service;


import com.m104.foyeruniversitaire.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.m104.foyeruniversitaire.entity.Universite;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UniversiteServiceImpl implements IUniversiteService {

    private final UniversiteRepository universiteRepository;

    final static int i = 0 ;
    // final : constante
    // static :


    public List<Universite> retrieveAllUniversites() {



        ArrayList<Universite> univList  = (ArrayList)universiteRepository.findAll();

        for (Universite u:
        univList) {

            log.info("Université : " + u);
        }
        
        return univList;
    }

    public Universite retrieveUniversite(Long universiteId) {
        return universiteRepository.findById(universiteId).orElse(null);
    }






    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public void removeUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }
}
