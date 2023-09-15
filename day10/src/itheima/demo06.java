package itheima;

import java.util.Scanner;

public class demo06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        StringBuilder sb=new StringBuilder();
        sb.append(sc.next());
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        if (str1.equals(str2)){
            System.out.println("该字符串为反转字符");
        }
        else {
            System.out.println("该字符串不是反转字符");
        }
    }
}
