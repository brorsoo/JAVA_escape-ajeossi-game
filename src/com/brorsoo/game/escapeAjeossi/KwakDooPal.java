package com.brorsoo.game.escapeAjeossi;

public class KwakDooPal implements Ajeossi {

    private static final String NAME = "곽두팔";
    private static final int AGE = 55;
    public int mzPower;

    public KwakDooPal() { }

    public KwakDooPal(int mzPower) {
        this.mzPower = mzPower;
    }

    @Override
    public String toString() {
        return "---------------\n" +
                "이름 : " + NAME + "\n"
                + "나이 : " + AGE + "세 \n"
                + "MZ력 : " + this.mzPower
                + "\n---------------\n";
    }

    /* this는 여기서 toString */
    @Override
    public void ment() {
        System.out.println( this + "나 두팔쓰 " + AGE + "세! MZ력 무려 " + this.mzPower + "! 다들 좋댓구알은 아는가??? 요즘 유우행하는 말인디!");
    }

}
