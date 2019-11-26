package com.ashlesh.springmysqlapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.ashlesh.springmysqlapp.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
