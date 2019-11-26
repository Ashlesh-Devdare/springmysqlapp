package com.ashlesh.springmysqlapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashlesh.springmysqlapp.entity.Doctor;
import com.ashlesh.springmysqlapp.repository.DoctorRepository;

@Controller    
@RequestMapping(path="/doctors") 
public class DoctorController {
	@Autowired 
	private DoctorRepository doctorRepository;

	@PostMapping
	public @ResponseBody String addNewDoctors(@RequestBody List<Doctor> doctors) {
		
		for(Doctor doctor: doctors) {
			doctorRepository.save(doctor);
		}
		
		return "Saved";
	}
	
	@GetMapping
	public @ResponseBody Iterable<Doctor> getDcotors(){
		return doctorRepository.findAll();
	}
	
	@PutMapping
	public @ResponseBody String updateDoctors(@RequestBody List<Doctor> doctors) {
		
		for(Doctor doctor: doctors) {
			doctorRepository.save(doctor);
		}
		
		return "Updated";
	}
	
	@DeleteMapping
	public @ResponseBody String deleteDoctors(@RequestBody List<Doctor> doctors) {
		
		for(Doctor doctor: doctors) {
			doctorRepository.delete(doctor);
		}
		
		return "Deleted";
	}
		
}