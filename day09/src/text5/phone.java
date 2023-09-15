package text5;

public class phone {
    private String pinpai;
    private int jiage;
    private String yanse;

    public phone() {
    }

    public phone(String pinpai, int jiage, String yanse) {
        this.pinpai = pinpai;
        this.jiage = jiage;
        this.yanse = yanse;
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

    public String getYanse() {
        return yanse;
    }

    public void setYanse(String yanse) {
        this.yanse = yanse;
    }
}
