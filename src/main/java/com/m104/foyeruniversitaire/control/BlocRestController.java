package com.m104.foyeruniversitaire.control;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.m104.foyeruniversitaire.entity.Bloc;
import com.m104.foyeruniversitaire.service.IBlocService;

import java.util.List;

@Tag(name = "Gestion des Blocs du Foyer Formation " +
        "Chahir Franck Yaya Khould :")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    private final IBlocService blocService;


    @GetMapping
    @Operation(description = "WS de récuperation de tous les Blocs Formation 09/07 ")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }


    @GetMapping("/{bloc-id}")

    public Bloc retrieveBloc(@PathVariable("bloc-id") Long bId) {
        Bloc bloc = blocService.retrieveBloc(bId);
        return bloc;
    }


    @PostMapping
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }


    @DeleteMapping("/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }


    @PutMapping
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc bloc =blocService.modifyBloc(c);
        return bloc;
    }

    @GetMapping("/trouver-blocs-sans-foyer")
    public List<Bloc> getBlocswirhoutFoyer() {
        return blocService.trouverBlocsSansFoyer();
    }


    @GetMapping("/get-bloc-nb-c/{c}")
    public List<Bloc> recuperBlocsParCap(@PathVariable("c") long c) {

        return blocService.trouverBlocsParCap(c);

    }


    @GetMapping("/get-bloc-nb-c/{nb}/{c}")
    public List<Bloc> recuperBlocsParNomEtCap(
            @PathVariable("nb") String nb,
            @PathVariable("c") long c) {

        return blocService.trouverBlocsParNomEtCap(nb, c);

    }

}
