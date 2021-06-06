package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.ImageForCv;

public interface ImageForCvDao  extends JpaRepository<ImageForCv, Integer>{

	ImageForCv getById(int id);
	ImageForCv getByJobseeker_id(int id);
}
