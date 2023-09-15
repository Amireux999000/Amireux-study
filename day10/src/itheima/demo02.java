package itheima;

import java.util.Scanner;

//零、壹、贰、叁、肆、伍、陆、柒、捌、玖
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("请输入金额");
            number = sc.nextInt();
            if (number > 0 && number <= 9999999) {
                break;
            } else {
                System.out.println("输入错误，请重新输入");

            }
        }

        //变大写
        String numberhanzichuan = "";
        while (true) {
            int time = number % 10;
            numberhanzichuan = numberhanzi(time) + numberhanzichuan;
            number = number / 10;
            if (number == 0) {
                break;
            }
        }
        System.out.println(numberhanzichuan);

        //补零
        int count = 7 - numberhanzichuan.length();
        for (int i = 0; i < count; i++) {
            numberhanzichuan = "零" + numberhanzichuan;
        }
        System.out.println(numberhanzichuan);

        //加单位
        String numberhanzichuancheng = "";
        for (int i = 0; i < 7; i++) {
            String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元" };
            numberhanzichuancheng = numberhanzichuancheng + numberhanzichuan.charAt(i) + arr[i];
        }
        System.out.println(numberhanzichuancheng);
    }

    public static String numberhanzi(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        return arr[number];
    }
}
