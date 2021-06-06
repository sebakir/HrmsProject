package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;

import com.example.entities.concretes.ExperienceForCv;

public interface ExperienceForCvService {
	Result add(ExperienceForCv experienceForCv);

	Result update(ExperienceForCv experienceForCv);

	Result delete(int id);

	DataResult<ExperienceForCv> getById(int id);

	DataResult<List<ExperienceForCv>> getAll();

	DataResult<List<ExperienceForCv>> getAllByJobseekerIdOrderByEndAtDesc(int id);

	DataResult<List<ExperienceForCv>> getAllByJobseekerId(int id);
}
