package com.microservice.file.filemetadate.services;

import com.microservice.file.filemetadate.entity.FileAnalyze;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileAnalyzeServiceImpl implements FileAnalyzer {
    @Override
    public FileAnalyze fileAnalyze(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Long fileSize = file.getSize();
        String fileType = file.getContentType();

        return new FileAnalyze(fileName, fileSize, fileType);
    }
}
