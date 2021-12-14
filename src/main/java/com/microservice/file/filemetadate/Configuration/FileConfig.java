package com.microservice.file.filemetadate.Configuration;

import com.microservice.file.filemetadate.entity.FileAnalyzeResponse;
import com.microservice.file.filemetadate.services.FileAnalyzeService;
import com.microservice.file.filemetadate.services.FileAnalyzeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileConfig {

   @Bean
    public FileAnalyzeService fileAnalyzeService(){
       return new FileAnalyzeServiceImpl();
   }
}
