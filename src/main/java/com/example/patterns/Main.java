package com.example.patterns;

import com.example.patterns.factory.FileFactory;
import com.example.patterns.factory.FileFactoryImpl;
import com.example.patterns.factory.model.FileModel;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        FileFactory factory = new FileFactoryImpl();
        File file = Path.of("C:\\Users\\zhakov-mv\\newFile.txt").toFile();
        FileModel fileModel = factory.createFile(new FileInputStream(file), Files.getFileExtension(file.getAbsolutePath()));
        System.out.println(fileModel.getExtension());
    }
}
