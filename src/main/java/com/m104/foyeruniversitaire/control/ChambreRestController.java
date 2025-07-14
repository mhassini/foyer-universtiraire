package com.m104.foyeruniversitaire.control;

import com.m104.foyeruniversitaire.entity.Chambre;
import com.m104.foyeruniversitaire.entity.TypeChambre;
import com.m104.foyeruniversitaire.service.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    private final IChambreService chambreService;

     @GetMapping
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }

    @PostMapping
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    @DeleteMapping("/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }

    @PutMapping
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

    @GetMapping("/trouver-chambres-selon-typ/{tc}")
    public List<Chambre> trouverChSelonTC(@PathVariable("tc") TypeChambre tc)
    {
        return chambreService.recupererChambresSelonTyp(tc);
    }

    @GetMapping("/trouver-chambre-selon-etudiant/{cin}")
    public List<Chambre> trouverChambreSelonEtudiant(@PathVariable("cin") long cin) {
        List<Chambre> chambres = chambreService.trouverchambreSelonEtudiant(cin);
        return chambres;
    }


}
