package com.example.core.utilities.imageUpload;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.example.core.utilities.results.DataResult;

public interface ImageUploadService {
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
