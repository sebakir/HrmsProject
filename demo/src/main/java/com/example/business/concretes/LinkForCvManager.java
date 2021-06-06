package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.LinkForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.LinkForCvDao;
import com.example.entities.concretes.LinkForCv;

@Service
public class LinkForCvManager  implements LinkForCvService{

	private LinkForCvDao linkForCvDao;
	
	@Autowired
	public LinkForCvManager(LinkForCvDao linkForCvDao) {
		super();
		this.linkForCvDao = linkForCvDao;
	}

	@Override
	public Result add(LinkForCv linkForCv) {
		this.linkForCvDao.save(linkForCv);
		return new SuccessResult("Link has been added");
	}

	@Override
	public Result update(LinkForCv linkForCv) {
		this.linkForCvDao.save(linkForCv);
		return new SuccessResult("Link has been updated");
	}

	@Override
	public Result delete(int id) {
		this.linkForCvDao.deleteById(id);
		return new SuccessResult("Link has been deleted");
	}

	@Override
	public DataResult<LinkForCv> getById(int id) {
		return new SuccessDataResult<LinkForCv>(this.linkForCvDao.getById(id));
	}

	@Override
	public DataResult<List<LinkForCv>> getAll() {
		return new SuccessDataResult<List<LinkForCv>>(this.linkForCvDao.findAll());
	}

	@Override
	public DataResult<List<LinkForCv>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<LinkForCv>>(this.linkForCvDao.getAllByJobseeker_id(id));
	}
	
}
