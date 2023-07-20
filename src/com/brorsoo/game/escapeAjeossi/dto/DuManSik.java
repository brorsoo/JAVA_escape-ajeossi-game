package com.brorsoo.game.escapeAjeossi.dto;

public class DuManSik implements Ajeossi {
    public static final String NAME = "두만식";
    public static final int AGE = 53;
    public int mzPower;         // 생성시 초기화

    public DuManSik() { }

    public DuManSik(int mzPower) {
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
                "(っ▄︻▇〓┳═　" + "   나 만식쓰 " + AGE + "세여~! 그..MZ력 무려 " + this.mzPower + " 인디! \n" +
                "　/　　 )　　             핸드폰은 전화 걸고 받는거만 할 줄 알믄 되는거 아녀?! \n" +
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
