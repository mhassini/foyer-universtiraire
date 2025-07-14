package com.m104.foyeruniversitaire.control;

import com.m104.foyeruniversitaire.service.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.m104.foyeruniversitaire.entity.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    private final IFoyerService foyerService;

    @GetMapping
    public List<Foyer> getFoyers() throws InterruptedException {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    @GetMapping("/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long fId) {
        Foyer foyer = foyerService.retrieveFoyer(fId);
        return foyer;
    }

    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long fId) {
        foyerService.removeFoyer(fId);
    }

    @PutMapping
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.modifyFoyer(f);
        return foyer;
    }

}
