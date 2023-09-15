package text7;

public class student {
    private int xuehao;
    private String name;
    private int age;

    public student() {
    }

    public student(int xuehao, String name, int age) {
        this.xuehao = xuehao;
        this.name = name;
        this.age = age;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
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
}
