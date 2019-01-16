package com.suikajy.toolpro.TestDemo;

import java.io.*;

public class FileInputTest {

    /**
     * 获取缓存directory
     */
    private static File getTempDir() {
        File tempDir = new File("tempFileDir");
        if (!tempDir.exists()) {
            boolean success = tempDir.mkdirs();
            if (!success) return null;
        }
        return tempDir;
    }

    /**
     * 将文件写入到指定文件，写入同名文件会覆盖之前的文件。
     *
     * @param fileName 文件名
     * @param content  文件内容
     * @return
     */
    private static boolean saveData(String fileName, String content) {
        File tempDir = getTempDir();
        if (tempDir == null) return false;
        File destFile = new File(tempDir, fileName);
        if (!destFile.exists()) {
            try {
                boolean success = destFile.createNewFile();
                if (!success) return false;
            } catch (IOException e) {
                return false;
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile, false))) {
            bw.write(content);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private static String readData(String fileName) {
        File tempDir = getTempDir();
        if (tempDir == null) return "";
        File destFile = new File(tempDir, fileName);
        if (!destFile.exists()) return "";
        try (BufferedReader br = new BufferedReader(new FileReader(destFile))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        saveData("test.txt", "abde");

    }
}
