package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.entities.concretes.Jobseeker;



public interface JobseekerService {

//	Result add(Jobseeker jobseeker);
//	Result update(Jobseeker jobseeker);
//	Result delete(int id);
//	DataResult<Jobseeker> getById(int id);
	
	DataResult<List<Jobseeker>> getAll();
}
