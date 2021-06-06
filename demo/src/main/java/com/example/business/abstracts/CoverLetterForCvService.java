package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.CoverLetterForCv;

public interface CoverLetterForCvService {
	Result add(CoverLetterForCv coverLetterForCv);
	Result update(CoverLetterForCv coverLetterForCv);
	Result delete(int id);
	DataResult<CoverLetterForCv> getById(int id);
	DataResult<List<CoverLetterForCv>> getAll();
}
