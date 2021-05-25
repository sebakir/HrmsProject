package com.example.business.abstracts;

import com.example.core.utilities.results.Result;
import com.example.entities.concretes.Employer;
import com.example.entities.concretes.Jobseeker;

public interface AuthService {
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobseeker(Jobseeker jobseeker, String confirmPassword);
}
