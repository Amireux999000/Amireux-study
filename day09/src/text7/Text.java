package text7;

public class Text {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息。
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
        student[] x = new student[3];
        student s1 = new student(1, "黑马", 18);
        student s2 = new student(2, "张三", 22);
        //student s3 = new student(3, "李四", 24);
        x[0] = s1;
        x[1] = s2;
        //x[2] = s3;

        student s4 = new student(4, "赵六", 26);
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        if (weiyi(x, s4.getXuehao()) == true) {
            System.out.println("学号有重复的");
        } else {
            int count = count(x);
            if (count == x.length) {
                student[] newx = createnewx(x);
                newx[count] = s4;
                bianli(newx);
            } else {
                x[count] = s4;
                bianli(x);
            }
        }
    }

    //要求2：添加完毕之后，遍历所有学生信息。
    public static void bianli(student[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != null) {
                System.out.println(x[i].getXuehao() + "," + x[i].getName() + "," + x[i].getAge());
            }
        }
    }

    //新建数组，并返回新的数组
    public static student[] createnewx(student[] x) {
        student[] newx = new student[x.length + 1];
        for (int i = 0; i < x.length; i++) {
            newx[i] = x[i];
        }
        return newx;
    }

    public static int count(student[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x != null) {
                count++;
            }
        }
        return count;
    }

    //学号唯一性判断
    public static boolean weiyi(student[] x, int xuehao) {
        for (int i = 0; i < x.length; i++) {
            student stu = x[i];
            if (stu != null) {
                if (x[i].getXuehao() == xuehao) {
                    return true;
                }
            }
        }
        return false;
    }
}