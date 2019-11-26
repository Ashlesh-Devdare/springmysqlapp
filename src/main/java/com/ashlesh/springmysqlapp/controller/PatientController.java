package com.ashlesh.springmysqlapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashlesh.springmysqlapp.entity.Patient;
import com.ashlesh.springmysqlapp.repository.PatientRepository;

@Controller    
@RequestMapping(path="/patients")
public class PatientController {

	@Autowired 
	private PatientRepository patientRepository;

	@PostMapping
	public @ResponseBody String addNewpatients(@RequestBody List<Patient> patients) {
		
		for(Patient patient: patients) {
			patientRepository.save(patient);
		}
		
		return "Saved";
	}
	
	@GetMapping
	public @ResponseBody Iterable<Patient> getDcotors(){
		return patientRepository.findAll();
	}
	
	@PutMapping
	public @ResponseBody String updatePatients(@RequestBody List<Patient> patients) {
		
		for(Patient patient: patients) {
			patientRepository.save(patient);
		}
		
		return "Updated";
	}
	
	@DeleteMapping
	public @ResponseBody String deletePatients(@RequestBody List<Patient> patients) {
		
		for(Patient patient: patients) {
			patientRepository.delete(patient);
		}
		
		return "Deleted";
	}
}
