package com.ausmine.util;

import java.io.File;
import java.util.List;

public class FileExtensionProcessor {

    public static void main(String[] args) throws Exception {
        FileExtensionProcessor processor = new FileExtensionProcessor();
        processor.addExtension("C:\\Temp", "jpg");
    }

    public void addExtension(String fullFilePath, String extension) throws Exception {
        File dir = new File(fullFilePath);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            String fileName = file.getPath() + File.separator + file.getName();
            String newFileName = fileName + "." + extension;
            file.renameTo(new File(newFileName));
        }
    }
}
