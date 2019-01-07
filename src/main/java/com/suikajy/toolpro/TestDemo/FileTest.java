package com.suikajy.toolpro.TestDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("testDir");
        File destDir = new File("destDir");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isDirectory());
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            if (!mkdirs) {
                System.out.println("make directory failed.");
            }
        }
        if (!destDir.exists()) {
            boolean mkdirs = destDir.mkdirs();
            if (!mkdirs) {
                System.out.println("make directory failed: destDir");
            }
        }

        //createNewFile(file);

        String[] list = file.list();
        System.out.println(Arrays.toString(list));

        // 实现指定文件的剪切
        File[] files = file.listFiles(pathname -> pathname.getName().endsWith("9.txt"));
        for (File fileItem : files) {
            System.out.println(fileItem.getName());
            fileItem.renameTo(new File(destDir, fileItem.getName()));
        }


    }

    private static void createNewFile(File parentFile) {
        File file = new File(parentFile, "suika" + System.currentTimeMillis() + ".txt");
        if (!file.exists()) {
            try {
                boolean newFile = file.createNewFile();
                if (newFile) {
                    System.out.println("create new file success");
                }
            } catch (IOException e) {
                System.out.println("create new file failed.");
            }
        }
    }

}
