package com.aston.foyeruniversitaire.service;

import com.aston.foyeruniversitaire.entity.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {

    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
    public Etudiant recupererEtudiantParCin(long cin);

    public List<Etudiant> recupererEtudiantsSelonEcoleEtDataNaissance
            (String e, Date d);


}
