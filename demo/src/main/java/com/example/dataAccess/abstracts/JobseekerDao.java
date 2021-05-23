package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.Jobseeker;

public interface JobseekerDao extends JpaRepository<Jobseeker, Integer> {

}
