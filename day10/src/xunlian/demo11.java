package xunlian;

/* 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意：需要用已有的知识完成。*/

//不需要考虑乘积过大之后的结果
//就认为乘积一定是小于int的最大值的
public class demo11 {
    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "1";
        int chengji = zhuanshuzi(num1) * zhuanshuzi(num2);
        String cj = "" + chengji;
        System.out.println(cj);

    }

    public static int zhuanshuzi(String num) {
        char[] shuzu = num.toCharArray();
        int k = shuzu.length - 1;
        int number = 0;
        for (int i = 0; i < shuzu.length; i++) {
            int n = shuzu[i] - 48;
            number = number + n * pingfang(10, k);
            k--;
        }
        return number;
    }

    public static int pingfang(int dishu, int zhishu) {
        if (zhishu == 0) {
            return 1;
        } else {
            int linshi = dishu;
            for (int i = 0; i < zhishu - 1; i++) {
                dishu = dishu * linshi;
            }
            return dishu;
        }
    }
}
