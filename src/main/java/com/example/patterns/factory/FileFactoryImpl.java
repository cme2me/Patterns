package com.example.patterns.factory;

import com.example.patterns.exceptions.UnsupportedTypeException;
import com.example.patterns.factory.model.FileModel;

import java.io.FileInputStream;
import java.io.IOException;

public class FileFactoryImpl implements FileFactory {
    private final String EXE = "exe";
    private final String BAT = "bat";
    private final String TXT = "txt";

    public FileModel createFile(FileInputStream fileInputStream, String type) throws IOException {

        switch (type) {
            case EXE:
            case BAT:
            case TXT:
                return new FileModel(type, fileInputStream.readAllBytes());
        }
        throw new UnsupportedTypeException();
    }
}
