package com.max.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {  //加上層拋出的語法,出錯時內部不處理!
                                            //由於main方法已經是最上層的方法了,有問題會直接當掉程式!!
        File jkDir = new File("C:\\jk");  //加上這行是為了"沒有路徑"的exception
        jkDir.mkdir(); //會新增folder
        FileWriter fw = new FileWriter("C:\\jk\\output.txt"); //指定匯出位址 "D:\\jk\\output.txt"
        fw.write("abc"); //由於緩衝的關係,電腦本身會等到累積一定量才執行寫的動作
        fw.flush(); //把資料一口氣沖出去,像上完大號沖水一樣
        fw.close(); //雖然上一動作完會自動關閉,但我們養成習慣將它關閉

    }
}
