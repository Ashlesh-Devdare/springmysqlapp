package com.ashlesh.springmysqlapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.ashlesh.springmysqlapp.entity.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

}
