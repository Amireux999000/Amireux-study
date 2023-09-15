package itheima;

public class Student {
    private String ID;
    private String name;
    private int age;
    private int address;

    public Student() {
    }

    public Student(String ID, String name, int age, int address) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
