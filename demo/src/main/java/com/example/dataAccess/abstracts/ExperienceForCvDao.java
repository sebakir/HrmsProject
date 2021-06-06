package com.example.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.ExperienceForCv;

public interface ExperienceForCvDao extends JpaRepository<ExperienceForCv, Integer> {
	
	ExperienceForCv getById(int id);

	List<ExperienceForCv> getAllByJobseeker_idOrderByEndAtDesc(int id);

	List<ExperienceForCv> getAllByJobseeker_id(int id);

}
