package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.CoverLetterForCv;

public interface CoverLetterForCvDao extends JpaRepository<CoverLetterForCv, Integer> {
	CoverLetterForCv getById(int id);
}
