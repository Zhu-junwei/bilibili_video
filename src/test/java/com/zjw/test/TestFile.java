package com.zjw.test;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("D:\\a\\b\\hello.txt");
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getParentFile().getPath());
    }
}
