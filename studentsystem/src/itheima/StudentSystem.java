package itheima;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            Scanner sc=new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" : System.out.println("添加学生");break;
                case "2" : System.out.println("删除学生");break;
                case "3" : System.out.println("修改学生");break;
                case "4" : System.out.println("查询学生");break;
                case "5" : System.out.println("退出");break;
                default:
                    System.out.println("没有这个选项");
            }
        }
    }
}
