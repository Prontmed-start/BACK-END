package com.backendstart.ProntMed.repository;

import com.backendstart.ProntMed.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

}
