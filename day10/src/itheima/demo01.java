package itheima;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        String yhm = "李建伟";
        String mima = "Ljw200432";
        Scanner sc = new Scanner(System.in);
        int cishu = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String newyhm = sc.next();
            System.out.println("请输入密码");
            String newmima = sc.next();
            if (newyhm.equals(yhm) && newmima.equals(mima)) {
                System.out.println("登录成功");
                break;
            } else {
                cishu = cishu - 1;
                if (cishu == 0) {
                    System.out.println("用户名或密码错误，您没有机会了");
                } else {
                    System.out.println("用户名或密码错误，您还剩下" + cishu + "次机会");
                }

            }
        }
    }
}