package com.example.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.SchoolForCv;

public interface SchoolForCvDao extends JpaRepository<SchoolForCv, Integer> {
	
	SchoolForCv getById(int id);

	List<SchoolForCv> getAllByJobseeker_idOrderByEndAtDesc(int id);

	List<SchoolForCv> getAllByJobseeker_id(int id);
}
