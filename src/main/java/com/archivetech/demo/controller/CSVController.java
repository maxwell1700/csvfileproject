package com.archivetech.demo.controller;

import com.archivetech.demo.service.UpdateCSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/csv")
public class CSVController {
    @Autowired
     private UpdateCSVService updateCSVService;
    // set a string that will take the file path
    String path = "C:\\Users\\maxwe\\Downloads\\ac56fe111.csv";

    @GetMapping("/getfile")
    public void getCSVFile() throws IOException {
     updateCSVService.readCSVFile(path);
    }

    @PostMapping("/{id}")
    public void updateCSVFile(){

    }
}
