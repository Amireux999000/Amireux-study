package itheima;

public class Phone {
    private String pinpai;
    private int jiage;

    public Phone() {
    }

    public Phone(String pinpai, int jiage) {
        this.pinpai = pinpai;
        this.jiage = jiage;
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

}
