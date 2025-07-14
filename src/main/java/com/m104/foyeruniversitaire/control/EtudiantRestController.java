package com.m104.foyeruniversitaire.control;

import com.m104.foyeruniversitaire.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.m104.foyeruniversitaire.entity.Etudiant;

import java.util.Date;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    private final IEtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    @GetMapping("/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long chId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(chId);
        return etudiant;
    }

    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.addEtudiant(c);
        return etudiant;
    }

    @DeleteMapping("/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long chId) {
        etudiantService.removeEtudiant(chId);
    }

    @PutMapping
    public Etudiant modifyEtudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.modifyEtudiant(c);
        return etudiant;
    }

    @GetMapping("/recup-etudiant/{ecole}/{date}")
    public List<Etudiant> recupEtudiant(
            @PathVariable("ecole") String e,
            @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date d )
    {
        return etudiantService.recupererEtudiantsSelonEcoleEtDataNaissance(e, d);
    }

    @GetMapping("/retrieve-etudiant-cin/{cin}")
    public Etudiant retrieveEtudiantParCin(@PathVariable("cin") Long cin) {
        Etudiant etudiant = etudiantService.recupererEtudiantParCin(cin);
        return etudiant;
    }

}
