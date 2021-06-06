package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.ProgrammingSkillForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.ProgrammingSkillForCvDao;
import com.example.entities.concretes.ProgrammingSkillForCv;

@Service
public class ProgrammingSkillForCvManager  implements ProgrammingSkillForCvService{
	
	private ProgrammingSkillForCvDao programmingSkillForCvDao;

	@Autowired
	public ProgrammingSkillForCvManager(ProgrammingSkillForCvDao programmingSkillForCvDao) {
		super();
		this.programmingSkillForCvDao = programmingSkillForCvDao;
	}

	@Override
	public Result add(ProgrammingSkillForCv programmingSkillForCv) {
		this.programmingSkillForCvDao.save(programmingSkillForCv);
		return new SuccessResult("Programming skill has been added");
	}

	@Override
	public Result update(ProgrammingSkillForCv programmingSkillForCv) {
		this.programmingSkillForCvDao.save(programmingSkillForCv);
		return new SuccessResult("Programming skill has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillForCvDao.deleteById(id);
		return new SuccessResult("Programming skill has been deleted.");
	}

	@Override
	public DataResult<ProgrammingSkillForCv> getById(int id) {
		return new SuccessDataResult<ProgrammingSkillForCv>(this.programmingSkillForCvDao.getById(id));
	}

	@Override
	public DataResult<List<ProgrammingSkillForCv>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkillForCv>>(this.programmingSkillForCvDao.findAll());
	}

	@Override
	public DataResult<List<ProgrammingSkillForCv>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ProgrammingSkillForCv>>(this.programmingSkillForCvDao.getAllByJobseeker_id(id));
	}
	
}
