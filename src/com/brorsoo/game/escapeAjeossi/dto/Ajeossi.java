package com.brorsoo.game.escapeAjeossi.dto;

public interface Ajeossi {

    /* 상수 필드 */
    int MZ_MIN = 0;     // 최소값

    /* 각 아저씨 멘트 */
    void ment();
    /* 각 아저씨  mz능력치
    * power : 능력치
    * isCheck : 증감 작동 식별자 */
    int mzPower(int power, int isCheck);

}
