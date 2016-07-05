package com.kovalsky.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

  public static void main(String[] args) {
    try {

      String filePath = "D:\\newfile.txt";
      File file = new File(filePath);

      if (file.createNewFile()) {
        System.out.println("File is created!");
      } else {
        System.out.println("File already exists.");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
