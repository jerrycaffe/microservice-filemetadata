package com.microservice.file.filemetadate.controller;

import com.microservice.file.filemetadate.entity.FileAnalyzeResponse;
import com.microservice.file.filemetadate.services.FileAnalyzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileMetaData {

    @Autowired
    private FileAnalyzeService fileAnalyzeService;

    @PostMapping(value = "/fileanalyse", produces = "application/json")
    public FileAnalyzeResponse analyze(@RequestParam("file") MultipartFile file){
        return fileAnalyzeService.fileAnalyze(file);
    }


}
