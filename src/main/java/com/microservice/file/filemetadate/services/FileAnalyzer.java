package com.microservice.file.filemetadate.services;

import com.microservice.file.filemetadate.entity.FileAnalyze;
import org.springframework.web.multipart.MultipartFile;

public interface FileAnalyzer {

    public FileAnalyze fileAnalyze(MultipartFile file);
}
