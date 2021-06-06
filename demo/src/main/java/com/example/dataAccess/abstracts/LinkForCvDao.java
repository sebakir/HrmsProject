package com.example.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.LinkForCv;

public interface LinkForCvDao  extends JpaRepository<LinkForCv , Integer>{

	LinkForCv getById(int id);
	List<LinkForCv> getAllByJobseeker_id(int id);
}
