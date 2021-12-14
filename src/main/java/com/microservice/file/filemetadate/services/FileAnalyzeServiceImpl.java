package com.microservice.file.filemetadate.services;

import com.microservice.file.filemetadate.entity.FileAnalyzeResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileAnalyzeServiceImpl implements FileAnalyzeService{
    @Override
    public FileAnalyzeResponse fileAnalyze(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Long fileSize = file.getSize();
        String fileType = file.getContentType();

        return new FileAnalyzeResponse(fileName, fileSize, fileType);
    }
}
