package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.Jobseeker;
import com.example.entities.dtos.JobseekerCvDto;

public interface JobseekerService {

	Result add(Jobseeker jobseeker);

	Result update(Jobseeker jobseeker);

	Result delete(int id);

	DataResult<Jobseeker> getById(int id);

	DataResult<List<Jobseeker>> getAll();

	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);

	DataResult<JobseekerCvDto> getJobseekerCvById(int id);
}
