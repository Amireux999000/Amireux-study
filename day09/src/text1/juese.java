package text1;

import java.util.Random;

public class juese {

    private int blood;

    private String name;

    public juese(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public juese() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    public void attack(juese js) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int newblood = js.getBlood() - hurt;
        if (newblood <= 0) newblood = 0;//判断血量是否为0
        js.setBlood(newblood);//修改血量
        if (hurt == 1) {
            System.out.println(this.getName() + "使用绵绵拳锤了一下" + js.getName() + "的胸口，仅仅造成了" + hurt + "伤害，" + js.getName() + "还剩下" + js.getBlood() + "点血");
        }
        if (hurt < 20 && hurt > 1) {
            System.out.println(this.getName() + "举起拳头打了" + js.getName() + "一下，造成" + hurt + "伤害，" + js.getName() + "还剩下" + js.getBlood() + "点血");
        }
        if (hurt == 20) {
            System.out.println(this.getName() + "运气爆表，生成暴击，狠狠往" + js.getName() + "的头上来了一下，造成" + hurt + "伤害，" + js.getName() + "还剩下" + js.getBlood() + "点血");
        }
    }
}
