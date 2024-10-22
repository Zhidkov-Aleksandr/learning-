package com.max.idea;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
        //чтение файла smallfile.txt из рабочей директории
        String fileName = "smallfile1.txt";
        var fis = new FileInputStream(fileName);
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
        System.out.println();
    }
}