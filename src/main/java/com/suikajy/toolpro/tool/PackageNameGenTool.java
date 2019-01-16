package com.suikajy.toolpro.tool;

import java.util.Random;

/**
 * 生成随机包名
 */
public class PackageNameGenTool {

    public static void main(String[] args) {
        Random random = new Random();
        String result = random.ints(4, 3, 7)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < i; j++) {
                        sb.append(((char) (97 + random.nextInt(26))));
                    }
                    return sb.toString();
                }).reduce("com", (a, b) -> a + "." + b);
        System.out.println(result);
    }
}
