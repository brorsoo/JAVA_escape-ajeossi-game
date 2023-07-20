package com.brorsoo.game.escapeAjeossi.dto;

public class KwakDooPal implements Ajeossi {

    public static final String NAME = "곽두팔";
    public static final int AGE = 55;
    public int mzPower;     // 생성시 초기화


    public KwakDooPal() {
    }

    public KwakDooPal(int mzPower) {
        this.mzPower = mzPower;
    }

    public int getMzPower() {
        return mzPower;
    }

    public void setMzPower(int mzPower) {
        this.mzPower = mzPower;
    }

    @Override
    public String toString() {
        return "---------------\n" +
                "이름 : " + NAME + "\n"
                + "나이 : " + AGE + "세 \n"
                + "MZ력 : " + this.mzPower
                + "\n---------------";
    }

    /* this는 여기서 toString */
    @Override
    public void ment() {
        System.out.println("　　∧__∧　　　　\n" +
                "　( ｀Д´ ）　　\n" +
                "(っ▄︻▇〓┳═　" + "   나 두팔쓰 " + AGE + "세! MZ력 무려 " + this.mzPower + "! \n" +
                "　/　　 )　　             다들 좋댓구알은 아는가??? 요즘 유우행하는 말인디! \n" +
                "　( /￣∪　　\n" +
                "      ");
    }

    @Override
    public int mzPower(int power, int isCheck) {
        if (isCheck == 0) {
            this.mzPower -= power;
            System.out.println("현재점수 : " + this.mzPower);

            if (this.mzPower < Ajeossi.MZ_MIN) {
                this.mzPower = 0;
                System.out.println("현재점수 : " + this.mzPower);
            }
        } else if(isCheck == 1) {
            this.mzPower += power;
            System.out.println("현재점수 : " + this.mzPower);
        }

        return this.mzPower;
    }


}
