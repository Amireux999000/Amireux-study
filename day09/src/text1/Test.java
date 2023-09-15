package text1;

public class Test {
    public static void main(String[] args) {
        juese r1=new juese("穆宇欣",100);
        juese r2=new juese("李建伟",100);
        while (true){
            r1.attack(r2);
            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"一拳Ko了"+r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"一拳Ko了"+r1.getName());
                break;
            }
        }
    }
}
