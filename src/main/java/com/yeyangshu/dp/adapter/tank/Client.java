package com.yeyangshu.dp.adapter.tank;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:29
 */
public class Client {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("c:test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
