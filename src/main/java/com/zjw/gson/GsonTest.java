package com.zjw.gson;

import com.google.gson.Gson;

/**
 * @author 朱俊伟
 * @date 2021/05/18
 */
public class GsonTest {
    public static void main(String[] args) {
//        jsonToBaseType();
//        baseTypeToJson();
        //POJO转JSON
        Gson gson = new Gson();
        User user = new User();
        user.age=18;
        user.emailAddress = "sfsg@163.com";
        user.name = "张三";
        String jsonObject = gson.toJson(user);
        System.out.println(jsonObject);
        String obj = jsonObject.replaceAll("张三","李四");
        User u = gson.fromJson(obj, User.class);
        System.out.println(u.name);
        System.out.println(u.age);
        System.out.println(u.emailAddress);

    }

    /**
     * 基本数据类型转为Json格式
     */
    private static void baseTypeToJson() {
        Gson gson = new Gson();
        String i = gson.toJson(100);
        String b = gson.toJson(false);
        String d = gson.toJson(99.99);
        String s = gson.toJson("hello");
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(s);
    }

    /**
     * 基本数据解析
     */
    private static void jsonToBaseType() {
        Gson gson = new Gson();
        Integer i = gson.fromJson("100", int.class);
        Double d = gson.fromJson("99.99", Double.class);
        Boolean b = gson.fromJson("false", Boolean.class);
        String s = gson.fromJson("string", String.class);
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
    }


}
