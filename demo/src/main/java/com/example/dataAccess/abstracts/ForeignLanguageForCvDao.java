package com.example.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.ForeignLanguageForCv;

public interface ForeignLanguageForCvDao extends JpaRepository<ForeignLanguageForCv, Integer> {
	ForeignLanguageForCv getById(int id);
	List<ForeignLanguageForCv> getAllByJobseeker_id(int id);

}
