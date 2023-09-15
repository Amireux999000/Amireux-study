package itheima;

public class deme04 {
    public static void main(String[] args) {
        String sfznumber = "15263220040302001X";
        String year = sfznumber.substring(6, 10);
        String month = sfznumber.substring(10, 12);
        String day = sfznumber.substring(12, 14);
        char sex = sfznumber.charAt(16);
        String chusheng = year + "年" + month + "月" + day + "日";
        int num=sex-48;
        if (num % 2 == 0) {
            sex = '女';
        } else {
            sex = '男';
        }
        System.out.println(chusheng);
        System.out.println(sex);
    }
}
