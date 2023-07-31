package com.dgmf.repository;

import com.dgmf.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
