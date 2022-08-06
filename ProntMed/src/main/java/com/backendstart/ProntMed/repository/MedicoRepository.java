package com.backendstart.ProntMed.repository;

import com.backendstart.ProntMed.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {

}
