package com.example.patterns.factory;

import com.example.patterns.factory.model.FileModel;

import java.io.FileInputStream;
import java.io.IOException;

public interface FileFactory {
    FileModel createFile(FileInputStream fileInputStream, String type) throws IOException;
}
