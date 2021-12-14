package com.microservice.file.filemetadate.services;

import com.microservice.file.filemetadate.entity.FileAnalyzeResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FileAnalyzeService {

    public FileAnalyzeResponse fileAnalyze(MultipartFile file);
}
