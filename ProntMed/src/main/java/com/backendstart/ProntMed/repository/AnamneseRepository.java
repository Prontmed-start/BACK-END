package com.backendstart.ProntMed.repository;

import com.backendstart.ProntMed.entity.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnamneseRepository extends JpaRepository<Anamnese,Long> {
}
