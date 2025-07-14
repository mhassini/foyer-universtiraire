package com.m104.foyeruniversitaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.m104.foyeruniversitaire.entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long>
{
}
