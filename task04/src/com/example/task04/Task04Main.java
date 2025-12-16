package com.example.task04;

import java.io.IOException;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Scanner sc = new Scanner(System.in);
        String str;
        if(sc.hasNext())
            str = sc.useDelimiter("\\Z").next();
        else
            str = "";
        String[] strArr = str.split("\\s");
        double sum = 0;
        for(String i: strArr){
            try {
                sum += Double.parseDouble(i);
            }
            catch(NumberFormatException e){}
        }
        String result = String.format("%.6f", sum);
        System.out.print(result.replace(",", "."));
    }
}
