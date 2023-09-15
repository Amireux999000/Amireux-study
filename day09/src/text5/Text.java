package text5;

public class Text {
    public static void main(String[] args) {
        phone[] p=new phone[3];
        phone e1=new phone("Mi",2999,"白色");
        phone e2=new phone("Oppo",2499,"黑色");
        phone e3=new phone("iqoo",4999,"灰色");
        p[0]=e1;
        p[1]=e2;
        p[2]=e3;
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getPinpai()+","+p[i].getJiage()+","+p[i].getYanse());
        }
        double pingjun=(p[0].getJiage()+p[1].getJiage()+p[2].getJiage())/ p.length;
        System.out.println("平均价格为:"+pingjun);
    }
}
