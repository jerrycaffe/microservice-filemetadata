package com.microservice.file.filemetadate.controller;

import com.microservice.file.filemetadate.entity.FileAnalyze;
import com.microservice.file.filemetadate.services.FileAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1")
public class FileMetaData {

    @Autowired
    private FileAnalyzer fileAnalyzeService;

    @PostMapping(value = "/file-analysis", produces = "application/json")
    public FileAnalyze analyze(@RequestParam("file") MultipartFile file){
        return fileAnalyzeService.fileAnalyze(file);
    }


}
