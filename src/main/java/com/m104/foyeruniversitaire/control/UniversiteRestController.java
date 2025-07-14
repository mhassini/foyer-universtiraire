package com.m104.foyeruniversitaire.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.m104.foyeruniversitaire.entity.Universite;
import com.m104.foyeruniversitaire.service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    private final IUniversiteService universiteService;

    @GetMapping
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    @GetMapping("/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long uId) {
        Universite universite = universiteService.retrieveUniversite(uId);
        return universite;
    }

    @PostMapping
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    @DeleteMapping("/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long uId) {
        universiteService.removeUniversite(uId);
    }

    @PutMapping
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.modifyUniversite(u);
        return universite;
    }

}
