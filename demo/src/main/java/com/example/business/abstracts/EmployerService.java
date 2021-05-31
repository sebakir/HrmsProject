package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);

	Result update(Employer employer);

	Result delete(int id);

	DataResult<Employer> getById(int id);

	DataResult<List<Employer>> getAll();
}
