package com.archivetech.demo.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service

public class UpdateCSVService {

    public void readCSVFile(String path) throws IOException {
// provide general template on how to read a csv file
         Files.lines(Paths.get(path))
                .skip(1)
                .forEach(System.out::println);
    }

    public void writeCSVFile(){
// provide general template on how to read a csv file
    }
}

