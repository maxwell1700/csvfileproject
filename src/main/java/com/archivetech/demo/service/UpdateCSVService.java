package com.archivetech.demo.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
// create a list<String> users = path .get path. collect collectors.tolist

public class UpdateCSVService {
    String path = "C:/Users/maxwe/Downloads/ac56fe111.csv";
    List<String> files = Files.lines(Paths.get(path)).
            collect(Collectors.toList());


    public UpdateCSVService() throws IOException {
    }

    public List<String> readAllCSVFile() throws IOException {
// provide general template on how to read a csv file
         return files;
    }

    public String readFileByName(String name){
        return files.stream().filter(file -> file.contains(name)).toList().toString();

    }
    public void writeCSVFile(){
// provide general template on how to read a csv file
    }

    //method to sort by a specific column
}

