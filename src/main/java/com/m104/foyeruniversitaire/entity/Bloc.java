package com.m104.foyeruniversitaire.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;

    String nomBloc;
    long capaciteBloc;


    @ManyToOne(cascade = CascadeType.ALL)
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    Set<Chambre> chambres = new HashSet<Chambre>();

}

