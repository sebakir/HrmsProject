package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.JobseekerService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.dataAccess.abstracts.JobseekerDao;
import com.example.entities.concretes.Jobseeker;




@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}

//	@Override
//	public Result add(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//      return new SuccessResult("Jobseeker has been added.");
//	}
//
//	@Override
//	public Result update(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//      return new SuccessResult("Jobseeker has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobseekerDao.deleteById(id);
//      return new SuccessResult("Jobseeker has been deleted.");
//	}
//
//	@Override
//	public DataResult<Jobseeker> getById(int id) {
//		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getOne(id));
//	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

}
