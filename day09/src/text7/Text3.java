package text7;

public class Text3 {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。

        要求3：通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。

        要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/


        //1.创建一个数组用来存储学生对象
        student[] x = new student[3];
        //2.创建学生对象并添加到数组当中
        student s1 = new student(1, "zhangsan", 23);
        student s2 = new student(2, "lisi", 24);
        student s3 = new student(3, "wangwu", 25);

        //3.把学生对象添加到数组当中
        x[0] = s1;
        x[1] = s2;
        x[2] = s3;

        /*要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。*/
        int shanchu = 1;
        int suoyin = shanchusuoyin(x, shanchu);
        if (suoyin >= 0) {
            x[suoyin] = null;
            bianli(x);
        } else {
            System.out.println("当前id不存在，删除失败");
        }
    }

    public static void bianli(student[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != null) {
                System.out.println(x[i].getXuehao() + "," + x[i].getName() + "," + x[i].getAge());
            }
        }
    }

    public static int shanchusuoyin(student[] x, int xuehao) {
        for (int i = 0; i < x.length; i++) {
            student stu = x[i];
            if (stu != null) {
                if (x[i].getXuehao() == xuehao) {
                    return i;
                }
            }

        }
        return -1;
    }
}
