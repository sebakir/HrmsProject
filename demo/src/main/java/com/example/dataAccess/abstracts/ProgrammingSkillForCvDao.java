package com.example.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.ProgrammingSkillForCv;

public interface ProgrammingSkillForCvDao  extends JpaRepository<ProgrammingSkillForCv, Integer>{
	
	ProgrammingSkillForCv getById(int id);
	List<ProgrammingSkillForCv> getAllByJobseeker_id(int id);

}
