package com.aston.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aston.foyeruniversitaire.entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long>
{




}
