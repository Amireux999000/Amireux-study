package text3;

public class text {
    public static void main(String[] args) {
        goods[] e=new goods[3];
        goods r1=new goods("001","拯救者",5999,5);
        goods r2=new goods("002","穆宇欣",9999,1);
        goods r3=new goods("003","李建伟",9998,1);
        e[0]=r1;
        e[1]=r2;
        e[2]=r3;
        for (int i = 0; i < e.length; i++) {
            System.out.println("id:"+e[i].getId()+" name:"+e[i].getName()+" price:"+e[i].getPrice()+" count:"+e[i].getCount());
        }
    }


}
