package com.example.entities.dtos;

import java.util.List;

import com.example.entities.concretes.ExperienceForCv;
import com.example.entities.concretes.ForeignLanguageForCv;
import com.example.entities.concretes.ImageForCv;
import com.example.entities.concretes.Jobseeker;
import com.example.entities.concretes.LinkForCv;
import com.example.entities.concretes.ProgrammingSkillForCv;
import com.example.entities.concretes.SchoolForCv;

public class JobseekerCvDto {
	public Jobseeker jobseeker;
	public List<SchoolForCv> schools;
	public List<ProgrammingSkillForCv> programingSkills;
	public List<LinkForCv> links;
	public List<ForeignLanguageForCv> languages;
	public List<ExperienceForCv> experiences;
	public ImageForCv image;
	

}
