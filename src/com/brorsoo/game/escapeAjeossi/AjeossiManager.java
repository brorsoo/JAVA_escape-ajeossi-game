package com.brorsoo.game.escapeAjeossi;

import java.util.Scanner;

public class AjeossiManager {
    String name = "000";

    public Ajeossi selectAjeossi() {
        /* 메인메뉴 */
        Ajeossi choiceAjeossi = null;
        int num = 0;

        Scanner sc = new Scanner(System.in);

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
                    choiceAjeossi = new SeoPalGwang(30);
                    name = SeoPalGwang.NAME;
                    break A;
                case 3 :
                    choiceAjeossi = new MaChunDong(20);
                    name = MaChunDong.NAME;
                    break A;
                case 4 :
                    choiceAjeossi = new DuManSik(10);
                    name = DuManSik.NAME;
                    break A;
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
        int count = 5;
        Scanner sc = new Scanner(System.in);



        B :
        while (true) {
            System.out.println("===============");
            System.out.println("트레이닝 선택 (남은기회 " + count + "회)");
            System.out.println("===============");
            System.out.println(" 1. 줄일말 트레이닝\n 2. 최신 걸그룹노래 맞추기\n " +
                    "3. (복불복) MZ와 1:1 대화하기\n");
            System.out.print("번호선택 : ");

            num = sc.nextInt();

            if( count <= 1 ) {
                System.out.println("ㅌㅌㅌㅌㅌㅌ");
                System.out.println( count );
                // 엔딩으로 가야함 메소드 추가
//                return;
                break B;
            }
            switch (num) {
                case 1 :
                    // 줄일말 트레이닝
                    count--;
                    break;
                case 2 :
                    // 최신 걸그룹노래 맞추기
                    count--;
                    break;
                case 3 :
                    // 1:1 대화
                    mzMeeting(ajeossi);
                    count--;
                    break;
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


    public void mzMeeting(Ajeossi ajeossi) {
        /* 복불복 MZ와 1:1 대화하기 */
        int num = (int)(Math.random() * 2);

        if( num == 0 ){
            System.out.println("MZ와 대화하다 못알아들어 화를 냈습니다.");
            System.out.println("MZ와의 거리가 멀어졌습니다. MZ력 -50!!");
            ajeossi.mzPower(50, 0);     // isCheck 0이면 점수 마이너스
        } else {
            System.out.println("MZ랑 티키타카 G렸음! 인정? 어 인정. MZ력 50상승!");
            ajeossi.mzPower(50, 1);     // isCheck 0이 아니면 점수 플러스
        }
    }



    /* 여기에 기능 쭈욱 만들기~~~~~ */



}
