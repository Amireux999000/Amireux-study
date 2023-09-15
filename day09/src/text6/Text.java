package text6;

public class Text {
    public static void main(String[] args) {
        girl[] my=new girl[4];
        girl g1=new girl("大老婆",18,'女',"打王者");
        girl g2=new girl("二老婆",18,'女',"打大A");
        girl g3=new girl("三老婆",18,'女',"玩蛋仔");
        girl g4=new girl("爱老婆",18,'女',"干饭");
        my[0]=g1;
        my[1]=g2;
        my[2]=g3;
        my[3]=g4;
        int pingjun=(my[0].getAge()+my[1].getAge()+my[2].getAge()+my[3].getAge())/ my.length;
        System.out.println("平均年龄:"+pingjun);
        int shuliang=0;//年龄比平均年龄底的女朋友的数量
        for (int i = 0; i < my.length; i++) {
            if (my[i].getAge()<pingjun){shuliang++;}
        }
        System.out.println("年龄比平均年龄底的女朋友的数量:"+shuliang);
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i].getName()+","+my[i].getAge()+","+my[i].getXingbie()+","+my[i].getAihao());
        }
    }


}
