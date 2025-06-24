package com.aston.foyeruniversitaire.service;

import com.aston.foyeruniversitaire.entity.Chambre;
import com.aston.foyeruniversitaire.entity.TypeChambre;

import java.util.List;

public interface IChambreService {

    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);











    // Here we will add later methods calling keywords and methods calling JPQL
    public List<Chambre> trouverchambreSelonEtudiant(long Cin);

    public List<Chambre> recupererChambresSelonTyp(TypeChambre tc);

}
