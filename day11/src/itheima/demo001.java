package itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class demo001 {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student s1=new student();
            System.out.println("请输入第"+(i+1)+"位同学的姓名");
            String name = sc.next();
            s1.setName(name);
            System.out.println("请输入第"+(i+1)+"位同学的年龄");
            int age = sc.nextInt();
            s1.setAge(age);
            list.add(s1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"，"+list.get(i).getAge());
        }
    }
}
