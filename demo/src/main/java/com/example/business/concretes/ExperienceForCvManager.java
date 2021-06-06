package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.ExperienceForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.ExperienceForCvDao;
import com.example.entities.concretes.ExperienceForCv;

@Service
public class ExperienceForCvManager implements ExperienceForCvService {

	private ExperienceForCvDao experienceForCvDao;

	@Autowired
	public ExperienceForCvManager(ExperienceForCvDao experienceForCvDao) {
		super();
		this.experienceForCvDao = experienceForCvDao;
	}

	@Override
	public Result add(ExperienceForCv experienceForCv) {
		this.experienceForCvDao.save(experienceForCv);
		return new SuccessResult("Experience has been added.");
	}

	@Override
	public Result update(ExperienceForCv experienceForCv) {
		this.experienceForCvDao.save(experienceForCv);
		return new SuccessResult("Experience has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.experienceForCvDao.deleteById(id);
		return new SuccessResult("Experience has been deleted");
	}

	@Override
	public DataResult<ExperienceForCv> getById(int id) {
		return new SuccessDataResult<ExperienceForCv>(this.experienceForCvDao.getById(id));
	}

	@Override
	public DataResult<List<ExperienceForCv>> getAll() {
		return new SuccessDataResult<List<ExperienceForCv>>(this.experienceForCvDao.findAll());
	}

	@Override
	public DataResult<List<ExperienceForCv>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
	return new SuccessDataResult<List<ExperienceForCv>>(this.experienceForCvDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<ExperienceForCv>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ExperienceForCv>>(this.experienceForCvDao.getAllByJobseeker_id(id));
	}
	
}
