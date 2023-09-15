package text6;

public class girl {
    private String name;
    private int age;
    private char xingbie;
    private String aihao;

    public girl() {
    }

    public girl(String name, int age, char xingbie, String aihao) {
        this.name = name;
        this.age = age;
        this.xingbie = xingbie;
        this.aihao = aihao;
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

    public char getXingbie() {
        return xingbie;
    }

    public void setXingbie(char xingbie) {
        this.xingbie = xingbie;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }
}
