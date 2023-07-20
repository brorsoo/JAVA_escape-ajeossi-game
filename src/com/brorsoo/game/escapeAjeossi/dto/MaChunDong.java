package com.brorsoo.game.escapeAjeossi.dto;

public class MaChunDong implements Ajeossi {
    public static final String NAME = "마춘동";
    public static final int AGE = 58;
    public int mzPower;         // 생성시 초기화

    public MaChunDong() { }

    public MaChunDong(int mzPower) {
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
                "(っ▄︻▇〓┳═　" + "   나 춘동쓰 " + AGE + "세인디! MZ력은 무려 " + this.mzPower + " 이여! \n" +
                "　/　　 )　　             요즘 신세대들은 아이폰 쓴다해서 하나 장만 해봤는디 어뗘! \n" +
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
