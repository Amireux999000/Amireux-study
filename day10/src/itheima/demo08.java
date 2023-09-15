package itheima;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A");
        String A = sc.next();
        System.out.println("请输入字符串B");
        String B = sc.next();
        String zhongjian = A;
        boolean br = false;
        for (int i = 0; i < A.length(); i++) {
            zhongjian = xuanzhuancaozuo(zhongjian);
            if (zhongjian.equals(B)) {
                br = true;
                break;
            }
            else {
                br = false;
            }
        }
        System.out.println(br);
    }

    public static String xuanzhuancaozuo(String A) {
        StringBuilder B = new StringBuilder();
        for (int i = 1; i < A.length(); i++) {
            B.append(A.charAt(i));
        }
        B.append(A.charAt(0));
        return B.toString();
    }
}
