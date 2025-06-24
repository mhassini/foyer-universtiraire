package com.aston.foyeruniversitaire.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.aston.foyeruniversitaire.entity.Foyer;
import com.aston.foyeruniversitaire.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class FoyerServiceImpl implements IFoyerService {

    private final FoyerRepository foyerRepository;

    //@Scheduled(fixedRate = 60000) /* en milliseconde*/
    //@Scheduled(fixedDelay = 60000) /* en milliseconde*/
    //@Scheduled(cron = "15 * * * * *")
    //@Scheduled(cron = "0/15 * * * * *")
    //@Scheduled(cron = "0 0 9 14 2 SUN,TUE")
    public List<Foyer> retrieveAllFoyers() throws InterruptedException {


        List<Foyer> listFoyer = foyerRepository.findAll();
        return listFoyer;

    }

    public Foyer retrieveFoyer(Long foyerId) {
        return foyerRepository.findById(foyerId).get();
    }
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public void removeFoyer(Long foyerId) {
        foyerRepository.deleteById(foyerId);
    }
}
