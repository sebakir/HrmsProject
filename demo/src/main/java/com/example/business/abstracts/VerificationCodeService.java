package com.example.business.abstracts;

import java.util.List;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	Result add(VerificationCode code);

	Result delete(VerificationCode code);

	Result update(VerificationCode code);

	DataResult<VerificationCode> getById(int id);

	DataResult<List<VerificationCode>> getAll();
}
