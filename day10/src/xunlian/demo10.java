package xunlian;

import java.util.Random;

public class demo10 {
    /*生成验证码
    规则：
  	长度为5
  	内容中是四位字母，1位数字。
  	其中数字只有1位，但是可以出现在任意的位置。
    内容：可以是小写字母，也可以是大写字母，还可以是数字*/
    public static void main(String[] args) {
        Random r=new Random();
        char[] zimudaquan = new char[52];
        for (int i = 0; i < zimudaquan.length; i++) {
            if (i < 26) {
                zimudaquan[i] = (char) (97 + i);
            } else {
                zimudaquan[i] = (char) (65-26+i);
            }
        }
        String yanzhengma="";
        for (int i = 0; i < 4; i++) {
            yanzhengma=yanzhengma+zimudaquan[r.nextInt(52)];
        }
        yanzhengma=yanzhengma+r.nextInt(10);
        char[] charArray = yanzhengma.toCharArray();
        int xiabiao=r.nextInt(5);
        char linshi=0;
        linshi=charArray[4];
        charArray[4]=charArray[xiabiao];
        charArray[xiabiao]=linshi;
        String result=new String(charArray);
        System.out.println(result);
    }
}
