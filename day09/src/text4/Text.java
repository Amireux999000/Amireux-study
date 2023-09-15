package text4;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        car[] e=new car[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < e.length; i++) {
            car c=new car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌:");
            String pinpai = sc.next();
            c.setPinpai(pinpai);
            System.out.println("请输入第"+(i+1)+"辆车的价格:");
            int jiage = sc.nextInt();
            c.setJiage(jiage);
            System.out.println("请输入第"+(i+1)+"辆车的颜色:");
            String coler = sc.next();
            c.setColor(coler);
            e[i]=c;
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println("第"+(i+1)+"辆车的品牌是:"+e[i].getPinpai());
            System.out.println("第"+(i+1)+"辆车的价格是:"+e[i].getJiage());
            System.out.println("第"+(i+1)+"辆车的颜色是:"+e[i].getColor());
        }

    }
}
