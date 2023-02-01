package com.example.patterns.factory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FileModel {
    private String extension;
    private byte[] data;
}
