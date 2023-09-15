package itheima;

import java.util.Scanner;
import java.util.StringJoiner;

public class demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = "";

        //判断字符串的合理性
        while (true) {
            System.out.println("请输入数字");
            number = sc.next();
            if (panduan(number)) {
                break;
            }
            System.out.println("输入错误，请重新输入");
        }

        //转换成罗马字母并打印
        StringJoiner s1 = new StringJoiner(", ");
        for (int i = 0; i < number.length(); i++) {
            char j1 = number.charAt(i);
            s1.add(luoma(j1 - 48));
        }
        System.out.println(s1.toString());
    }

    public static boolean panduan(String number) {
        if (number.length() > 9) {
            return false;
        }
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < 48 || number.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }

    public static String luoma(int number) {
        String[] luomachuan = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return luomachuan[number];
    }


}
