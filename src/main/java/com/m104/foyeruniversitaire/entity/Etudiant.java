package com.m104.foyeruniversitaire.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    long cinEtudiant;
    String ecole;
    Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    @ToString.Exclude
    Set<Reservation> reservations;

}



