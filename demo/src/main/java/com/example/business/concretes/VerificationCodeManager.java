package com.example.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.abstracts.VerificationCodeService;
import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.core.utilities.results.SuccessDataResult;
import com.example.core.utilities.results.SuccessResult;
import com.example.dataAccess.abstracts.VerificationCodeDao;
import com.example.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService {

	private VerificationCodeDao verificationCodeDao;

	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}


	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code has been saved.");
	}

	@Override
	public Result delete(VerificationCode code) {
		this.verificationCodeDao.delete(code);
		return new SuccessResult("Code has been deleted.");
	}

	@Override
	public Result update(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("Code has been updated.");
	}

	@Override
	public DataResult<VerificationCode> getById(int id) {
		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getOne(id));
	}

	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
	}

}
