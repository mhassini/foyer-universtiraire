package com.m104.foyeruniversitaire.service;


import com.m104.foyeruniversitaire.entity.Chambre;
import com.m104.foyeruniversitaire.entity.TypeChambre;
import com.m104.foyeruniversitaire.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j // Simple Logging Facade for Java
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chambreRepository;

    public List<Chambre> retrieveAllChambres() {
        List<Chambre> listC = chambreRepository.findAll();
        return listC;
    }

    // Cette méthode est utlisée pour ...
    public Chambre retrieveChambre(Long chambreId) {
        Chambre c = chambreRepository.findById(chambreId).get();
        return c;
    }

    public Chambre addChambre(Chambre c) {
        Chambre chambre = chambreRepository.save(c);
        return chambre;
    }

    public Chambre modifyChambre(Chambre c) {
        Chambre chambre = chambreRepository.save(c);
        return chambre;
    }

    public void removeChambre(Long chambreId) {

        chambreRepository.deleteById(chambreId);

    }







    public List<Chambre> recupererChambresSelonTyp(TypeChambre tc)
    {
        return chambreRepository.findAllByTypeC(tc);
    }






















    public List<Chambre> trouverchambreSelonEtudiant(long cin) {
        return chambreRepository.trouverChselonEt(cin);
    }

}
















