package com.m104.foyeruniversitaire.control;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.m104.foyeruniversitaire.entity.Reservation;
import com.m104.foyeruniversitaire.service.IReservationService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    private final IReservationService reservationService;

    @GetMapping
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String rId) {
        return reservationService.retrieveReservation(rId);
    }

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @DeleteMapping("/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String rId) {
        reservationService.removeReservation(rId);
    }

    @PutMapping
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationService.modifyReservation(r);
    }

    @GetMapping("/retrieve-reservation-date-status/{d}/{v}")
    public List<Reservation> retrieveReservationParDateEtStatus
            (@PathVariable("d") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date d, @PathVariable("v") boolean b) {
        return reservationService.trouverResSelonDateEtStatus(d, b);
    }

}
