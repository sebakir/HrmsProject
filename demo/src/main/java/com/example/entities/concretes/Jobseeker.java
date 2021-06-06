package com.example.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobseekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")

public class Jobseeker extends User {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "national_id")
	private String nationalId;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<SchoolForCv> schools;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ProgrammingSkillForCv> programingSkills;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<LinkForCv> links;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ForeignLanguageForCv> languages;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ExperienceForCv> experiences;

	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<CoverLetterForCv> coverLetters;

	@JsonIgnore
	@OneToOne(mappedBy = "jobseeker", optional = false, fetch = FetchType.LAZY)
	private ImageForCv image;
}
