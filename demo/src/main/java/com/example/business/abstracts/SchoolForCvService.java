package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ProgrammingSkillForCv;
import com.example.entities.concretes.SchoolForCv;

public interface SchoolForCvService {
	Result add(SchoolForCv schoolForCv);

	Result update(SchoolForCv schoolForCv);

	Result delete(int id);

	DataResult<SchoolForCv> getById(int id);

	DataResult<List<SchoolForCv>> getAll();

	DataResult<List<SchoolForCv>> getAllByJobseekerId(int id);

	DataResult<List<SchoolForCv>> getAllByJobseekerIdOrderByEndAtDesc(int id);
}
