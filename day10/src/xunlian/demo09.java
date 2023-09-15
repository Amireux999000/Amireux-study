package xunlian;

import java.util.Random;
import java.util.Scanner;


//键盘输入任意字符串，打乱里面的内容


public class demo09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.next();
        String s1 = daluan(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println(s1);
    }
    public static String daluan(String s){
        Random r=new Random();
        char[] result = s.toCharArray();
        char linshi = 0;
        for (int i = 0; i < result.length; i++) {
            int q=r.nextInt(result.length-1);
            linshi=result[q];
            result[q]=result[i];
            result[i]=linshi;
        }
        String s1=new String(result);
        return s1;
    }
}
