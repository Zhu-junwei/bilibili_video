package com.zjw.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

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
            this.prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
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

}
