package com.hust.kstn.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            String filename = "test.exe";

            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            long startTime = System.currentTimeMillis();

            StringBuffer sb = new StringBuffer();  // hoặc StringBuilder
            for (byte b : inputBytes) {
                sb.append((char) b);
            }

            String result = sb.toString();

            long endTime = System.currentTimeMillis();
            System.out.println("NoGarbage time: " + (endTime - startTime) + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
