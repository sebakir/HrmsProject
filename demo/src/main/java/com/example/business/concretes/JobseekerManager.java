package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.ExperienceForCvService;
import com.example.business.abstracts.ForeignLanguageForCvService;
import com.example.business.abstracts.ImageForCvService;
import com.example.business.abstracts.JobseekerService;
import com.example.business.abstracts.LinkForCvService;
import com.example.business.abstracts.ProgrammingSkillForCvService;
import com.example.business.abstracts.SchoolForCvService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.JobseekerDao;
import com.example.entities.concretes.Jobseeker;
import com.example.entities.dtos.JobseekerCvDto;

@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private ExperienceForCvService experienceForCvService;
	private ForeignLanguageForCvService foreignLanguageForCvService;
	private ImageForCvService imageForCvService;
	private LinkForCvService linkForCvService;
	private ProgrammingSkillForCvService programmingSkillForCvService;
	private SchoolForCvService schoolForCvService;

	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao, ExperienceForCvService experienceForCvService,
			ForeignLanguageForCvService foreignLanguageForCvService, ImageForCvService imageForCvService,
			LinkForCvService linkForCvService, ProgrammingSkillForCvService programmingSkillForCvService,
			SchoolForCvService schoolForCvService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.experienceForCvService = experienceForCvService;
		this.foreignLanguageForCvService = foreignLanguageForCvService;
		this.imageForCvService = imageForCvService;
		this.linkForCvService = linkForCvService;
		this.programmingSkillForCvService = programmingSkillForCvService;
		this.schoolForCvService = schoolForCvService;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<Jobseeker> getById(int id) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getOne(id));
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

	@Override
	public DataResult<JobseekerCvDto> getJobseekerCvById(int id) {
		Jobseeker jobseeker = this.jobseekerDao.getById(id);
		JobseekerCvDto cv = new JobseekerCvDto();
		cv.experiences = jobseeker.getExperiences();
		cv.languages = jobseeker.getLanguages();
		cv.image = jobseeker.getImage();
		cv.links = jobseeker.getLinks();
		cv.programingSkills = jobseeker.getProgramingSkills();
		cv.schools = jobseeker.getSchools();
		return new SuccessDataResult<JobseekerCvDto>(cv);

	}

}
