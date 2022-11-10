package com.archivetech.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CSVController {
    // set a string that will take the file path
    String path = "C:\\Users\\maxwe\\Downloads\\ac56fe111.csv";

    @GetMapping()
    public String getCSVFile(){

     return "";
    }

    @PostMapping("/csv/{id}")
    public void updateCSVFile(){

    }
}
