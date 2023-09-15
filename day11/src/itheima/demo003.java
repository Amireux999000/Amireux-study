package itheima;

import java.util.ArrayList;

public class demo003 {
    public static void main(String[] args) {
        ArrayList<Phone> arr=new ArrayList<>();
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        ArrayList<Phone> arr1=fanhui(arr);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i).getPinpai()+","+arr1.get(i).getJiage());
        }
    }
    public static ArrayList fanhui(ArrayList<Phone> arr){
        ArrayList<Phone> arr1=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getJiage()<3000) {
                Phone p=new Phone();
                p.setPinpai(arr.get(i).getPinpai());
                p.setJiage(arr.get(i).getJiage());
                arr1.add(p);
            }
        }
        return arr1;
    }
}
