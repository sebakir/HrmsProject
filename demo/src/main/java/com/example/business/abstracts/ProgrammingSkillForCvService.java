package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ProgrammingSkillForCv;

public interface ProgrammingSkillForCvService {
	Result add(ProgrammingSkillForCv programmingSkillForCv);

	Result update(ProgrammingSkillForCv programmingSkillForCv);

	Result delete(int id);

	DataResult<ProgrammingSkillForCv> getById(int id);

	DataResult<List<ProgrammingSkillForCv>> getAll();

	DataResult<List<ProgrammingSkillForCv>> getAllByJobseekerId(int id);
}
