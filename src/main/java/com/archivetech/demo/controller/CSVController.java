package com.archivetech.demo.controller;

import com.archivetech.demo.service.UpdateCSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/csv")
public class CSVController {
    @Autowired
     private UpdateCSVService updateCSVService;
    // set a string that will take the file path


    @GetMapping("/getfile/{name}")
    public String getCSVRecordByName(@PathVariable String name) throws IOException {
        return updateCSVService.readFileByName(name);
    }

    @GetMapping("/files")
    public List<String> getCSVFile() throws IOException {
       return  updateCSVService.readAllCSVFile();
    }

    @PostMapping("/{id}")
    public void updateCSVFile(){

    }
}
