package com.zjw.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @author 朱俊伟
 * @date 2022/07/14
 */
public class PropertiesUtil {

    private final Properties prop = new Properties();

    private static final PropertiesUtil instance = new PropertiesUtil();

    private PropertiesUtil() {
        try {
            //读取classes下的配置文件
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            this.prop.load(bufferedReader);
            Set<String> propertyNames = prop.stringPropertyNames();
            for (String key : propertyNames) {
                System.out.println(key+ ":" + prop.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertiesUtil getInstance() {
        return instance;
    }

    public String getValue(String key){
        return (String)this.prop.get(key);
    }

    public String getValue(String key, String defaultValue){
        return this.prop.getProperty(key, defaultValue);
    }

    public static void main(String[] args) {

    }

}
