package com.max.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); //專案開發時不要拿掉, 開發完成後,是換成我們的log
        } catch (IOException e) {
            e.printStackTrace();  //專案開發時catch不要拿掉, 開發完成後,是換成我們的log
        }


        //filereader();
        //inputstream();
    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n!= -1 ) {
                System.out.print((char)n);
                n= fr.read(); //要確定有跳出while loop的條件
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        try {
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1){
                System.out.println((char)n);
                n = is.read();//要留下跳出while的條件
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File open success");
    }
}
