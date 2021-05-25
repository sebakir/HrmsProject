package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.JobPosition;



public interface JobPositionService {
	
	Result add(JobPosition jobPosition);
//	Result update(JobPosition jobPosition);
//	Result delete(int id);
//	DataResult<JobPosition> getById(int id);
	
	DataResult<List<JobPosition>> getAll();
	DataResult<JobPosition> getJobByTitle(String title);
}
