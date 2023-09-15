package text4;

public class car {
    private String pinpai;
    private int jiage;
    private String color;

    public car() {
    }

    public car(String pinpai, int jiage, String color) {
        this.pinpai = pinpai;
        this.jiage = jiage;
        this.color = color;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public int getJiage() {
        return jiage;
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
