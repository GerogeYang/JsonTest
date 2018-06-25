package com.tcl.jsontest;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 项目名：   JsonTest
 * 包名：     com.tcl.jsontest
 * 文件名：   JsonReader
 * 创建者：   70889
 * 创建时间： 2018/6/25 16:00
 * 描述：     TODO
 */

public class JsonReader {

    public static String getJson(AssetManager assetManager, String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (assetManager != null) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(assetManager.open(fileName)));
                String line;
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static User getJsonToUser(AssetManager assetManager, String fileName) {
        User user = null;
        StringBuilder stringBuilder = new StringBuilder();
        if (assetManager != null) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(assetManager.open(fileName)));
                String line;
                while ((line = br.readLine()) != null) {
                    stringBuilder.append(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String jsonString = stringBuilder.toString();
        System.out.println("YJ===> " + jsonString);
        Gson gson = new Gson();
        user = gson.fromJson(jsonString, User.class);
        if (user != null) {
            System.out.println("YJ===>1 user.id = " + user.getId() + ",user.name = " + user.getName() + ",user.address = " + user.getAddress());
        }
        return user;
    }
}
