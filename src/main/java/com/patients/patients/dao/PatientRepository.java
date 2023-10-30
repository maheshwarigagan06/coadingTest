package com.patients.patients.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patients.patients.bean.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
