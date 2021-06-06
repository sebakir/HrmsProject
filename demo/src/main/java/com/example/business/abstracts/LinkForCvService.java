package com.example.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.core.utilities.results.DataResult;
import com.example.core.utilities.results.Result;
import com.example.entities.concretes.LinkForCv;

public interface LinkForCvService {
	Result add(LinkForCv linkForCv);

	Result update(LinkForCv linkForCv);

	Result delete(int id);

	DataResult<LinkForCv> getById(int id);

	DataResult<List<LinkForCv>> getAll();

	DataResult<List<LinkForCv>> getAllByJobseekerId(int id);
}
