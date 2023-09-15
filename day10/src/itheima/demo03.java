package itheima;

public class demo03 {
    public static void main(String[] args) {
        String phonenumber="18647911968";
        String s1 = phonenumber.substring(0, 3);
        String s2 = phonenumber.substring(7);
        String s=s1+"****"+s2;
        System.out.println(s);
    }
}
