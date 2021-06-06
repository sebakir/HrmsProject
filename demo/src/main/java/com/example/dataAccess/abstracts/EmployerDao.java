package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	Employer getById(int id);
}
