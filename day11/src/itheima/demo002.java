package itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class demo002 {
    public static void main(String[] args) {
        ArrayList<yonghu> arr=new ArrayList<>();
        yonghu y1=new yonghu("heima001","李建伟","qwerty");
        yonghu y2=new yonghu("heima002","李","q");
        yonghu y3=new yonghu("heima003","伟","rty");
        arr.add(y1);
        arr.add(y2);
        arr.add(y3);
        System.out.println("请输入你要查找的ID");
        Scanner sc=new Scanner(System.in);
        String nextID = sc.next();
        System.out.println(findid(nextID, arr));

    }
    public static int findid(String id,ArrayList<yonghu> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
