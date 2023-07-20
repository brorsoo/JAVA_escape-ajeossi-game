package com.brorsoo.game.escapeAjeossi.dto;

public class SeoPalGwang implements Ajeossi {
    public static final String NAME = "서팔광";
    public static final int AGE = 50;
    public int mzPower;         // 생성시 초기화

    public SeoPalGwang() { }

    public SeoPalGwang(int mzPower) {
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
                "(っ▄︻▇〓┳═　" + "   나 팔광쓰 " + AGE + "세! MZ력 " + this.mzPower + "! \n" +
                "　/　　 )　　             아따 인서타로 다렉트메쎄지 정도는 보낼 줄 알지!! \n" +
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
