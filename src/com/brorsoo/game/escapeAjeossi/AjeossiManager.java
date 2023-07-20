package com.brorsoo.game.escapeAjeossi;

import java.util.Scanner;

public class AjeossiManager {

    String name = "000";
    Scanner sc = new Scanner(System.in);

    public Ajeossi selectAjeossi() {
        /* 메인메뉴 */
        Ajeossi choiceAjeossi = null;
        int num = 0;

        System.out.println("===============");
        System.out.println("아저씨 캐릭터 선택");
        System.out.println("===============");
        System.out.println(" 1. 곽두팔\n 2. 서팔광\n 3. 마춘동\n 4. 두만식\n");
        System.out.print("번호선택 : ");

        num = sc.nextInt();

        A :
        while (true) {
            switch (num) {
                case 1 :
                    choiceAjeossi = new KwakDooPal(40);
                    name = KwakDooPal.NAME;
                    break A;
                case 2 :
                    choiceAjeossi = new SeoPalGwang(); break A;
                case 3 :
                    choiceAjeossi = new MaChunDong(); break A;
                case 4 :
                    choiceAjeossi = new DuManSik();  break A;
                default:
                    System.out.println("다시 선택해주세요");
            }
        }

        System.out.println();
        System.out.println(choiceAjeossi);
        choiceAjeossi.ment();

        return choiceAjeossi;
    }

    public void trainingMenu(Ajeossi ajeossi) {
        /* 트레이닝 메뉴 선택 */
        int num = 0;

        System.out.println("===============");
        System.out.println("트레이닝 선택");
        System.out.println("===============");
        System.out.println(" 1. 줄일말 트레이닝\n 2. 최신 걸그룹노래 맞추기\n 3. (복불복) MZ와 1:1 대화하기\n");
        System.out.print("번호선택 : ");

        num = sc.nextInt();

        B :
        while (true) {
            switch (num) {
                case 1 :
                    // 줄일말 트레이닝
                    break B;
                case 2 :
                    // 최신 걸그룹노래 맞추기
                    break B;
                case 3 :
                    // 1:1 대화
                    break B;
                default:
                    System.out.println("다시 선택해주세요");
            }
        }

    }


    public void getName() {
        /* 게임 종료 메소드 */
        System.out.println("\n\n======= GameOver =======");
        System.out.println(name + "씨는 MZ에 실패하셨습니다.");
        System.out.println("========================\n\n");
    }




    /* 여기에 기능 쭈욱 만들기~~~~~ */



}
