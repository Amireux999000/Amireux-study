package itheima;

public class demo05 {
    public static void main(String[] args) {
        String talk="你玩的SB真好，TMD,QNMD";
        String[] str={"SB","TMD","QNMD","MLGB"};
        for (int i = 0; i < str.length; i++) {
            talk = talk.replace(str[i], "***");
        }
        System.out.println(talk);

    }
}
