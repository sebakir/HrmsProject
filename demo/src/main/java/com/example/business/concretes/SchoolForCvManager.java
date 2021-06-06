package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.SchoolForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.SchoolForCvDao;
import com.example.entities.concretes.SchoolForCv;

@Service
public class SchoolForCvManager implements SchoolForCvService {

	private SchoolForCvDao schoolForCvDao;

	@Autowired
	public SchoolForCvManager(SchoolForCvDao schoolForCvDao) {
		super();
		this.schoolForCvDao = schoolForCvDao;
	}

	@Override
	public Result add(SchoolForCv schoolForCv) {
		this.schoolForCvDao.save(schoolForCv);
		return new SuccessResult("School has been added.");
	}

	@Override
	public Result update(SchoolForCv schoolForCv) {
		this.schoolForCvDao.save(schoolForCv);
		return new SuccessResult("School has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolForCvDao.deleteById(id);
		return new SuccessResult("School has been deleted.");
	}

	@Override
	public DataResult<SchoolForCv> getById(int id) {
		return new SuccessDataResult<SchoolForCv>(this.schoolForCvDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolForCv>> getAll() {
		return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.findAll());
	}

	@Override
	public DataResult<List<SchoolForCv>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getAllByJobseeker_id(id));
	}

	@Override
	public DataResult<List<SchoolForCv>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolForCv>>(this.schoolForCvDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}
	
}
