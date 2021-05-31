package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);

	Result update(JobAdvert jobAdvert);

	Result delete(int id);

	Result changeOpenToClose(int id);

	DataResult<JobAdvert> getById(int id);

	DataResult<List<JobAdvert>> getAll();

	DataResult<List<JobAdvert>> getAllOpenJobAdvertList();

	DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();

	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
}
