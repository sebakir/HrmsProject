package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.ForeignLanguageForCv;

public interface ForeignLanguageForCvService {
	
	Result add(ForeignLanguageForCv foreignLanguageForCv);

	Result update(ForeignLanguageForCv foreignLanguageForCv);

	Result delete(int id);

	DataResult<ForeignLanguageForCv> getById(int id);

	DataResult<List<ForeignLanguageForCv>> getAll();

	DataResult<List<ForeignLanguageForCv>> getAllByJobseekerId(int id);
}
