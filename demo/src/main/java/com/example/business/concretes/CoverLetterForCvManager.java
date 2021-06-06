package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.CoverLetterForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.CoverLetterForCvDao;
import com.example.entities.concretes.CoverLetterForCv;

@Service
public class CoverLetterForCvManager implements CoverLetterForCvService {

	private CoverLetterForCvDao coverLetterForCvDao;

	@Autowired
	public CoverLetterForCvManager(CoverLetterForCvDao coverLetterForCvDao) {
		super();
		this.coverLetterForCvDao = coverLetterForCvDao;
	}

	@Override
	public Result add(CoverLetterForCv coverLetterForCv) {
		this.coverLetterForCvDao.save(coverLetterForCv);
		return new SuccessResult("Cover letter has been added");
	}

	@Override
	public Result update(CoverLetterForCv coverLetterForCv) {
		this.coverLetterForCvDao.save(coverLetterForCv);
		return new SuccessResult("Cover letter has been updated");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterForCvDao.deleteById(id);
		return new SuccessResult("Cover letter has been deleted");
	}

	@Override
	public DataResult<CoverLetterForCv> getById(int id) {
		return new SuccessDataResult<CoverLetterForCv>(this.coverLetterForCvDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterForCv>> getAll() {
		return new SuccessDataResult<List<CoverLetterForCv>>(this.coverLetterForCvDao.findAll());
	}

}
