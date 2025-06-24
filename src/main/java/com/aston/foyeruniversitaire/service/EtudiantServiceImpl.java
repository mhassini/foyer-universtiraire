package com.aston.foyeruniversitaire.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.aston.foyeruniversitaire.entity.Etudiant;
import com.aston.foyeruniversitaire.repository.EtudiantRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {


    private final EtudiantRepository etudiantRepository;

    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return etudiantRepository.findById(etudiantId).get();
    }
    public Etudiant addEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }
    public Etudiant modifyEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }
    public void removeEtudiant(Long etudiantId) {
        etudiantRepository.deleteById(etudiantId);
    }


    public Etudiant recupererEtudiantParCin(long cin)
    {
        return etudiantRepository.findEtudiantByCinEtudiant(cin);
    }





    public List<Etudiant> recupererEtudiantsSelonEcoleEtDataNaissance(String e, Date d)
    {

        return etudiantRepository.findAllByEcoleAndDateNaissanceGreaterThan(e, d);
    }





}









