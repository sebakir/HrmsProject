package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.ForeignLanguageForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.ForeignLanguageForCvDao;
import com.example.entities.concretes.ForeignLanguageForCv;

@Service
public class ForeignLanguageForCvManager implements ForeignLanguageForCvService {

	private ForeignLanguageForCvDao foreignLanguageForCvDao;

	@Autowired
	public ForeignLanguageForCvManager(ForeignLanguageForCvDao foreignLanguageForCvDao) {
		super();
		this.foreignLanguageForCvDao = foreignLanguageForCvDao;
	}

	@Override
	public Result add(ForeignLanguageForCv foreignLanguageForCv) {
		this.foreignLanguageForCvDao.save(foreignLanguageForCv);
		return new SuccessResult("Foreign language has been added");
	}

	@Override
	public Result update(ForeignLanguageForCv foreignLanguageForCv) {
		this.foreignLanguageForCvDao.save(foreignLanguageForCv);
		return new SuccessResult("Foreign language has been updated");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageForCvDao.deleteById(id);
		return new SuccessResult("Foreign language has been deleted");
	}

	@Override
	public DataResult<ForeignLanguageForCv> getById(int id) {
		return new SuccessDataResult<ForeignLanguageForCv>(this.foreignLanguageForCvDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageForCv>> getAll() {
		return new SuccessDataResult<List<ForeignLanguageForCv>>(this.foreignLanguageForCvDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguageForCv>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ForeignLanguageForCv>>(this.foreignLanguageForCvDao.getAllByJobseeker_id(id));
	}
	
	
}
