package com.brorsoo.game.escapeAjeossi.service;

import com.brorsoo.game.escapeAjeossi.dto.*;

import java.util.Scanner;

public class AjeossiManager {
    public String name = "선택안됨";

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

        A:
        while (true) {
            switch (num) {
                case 1:
                    choiceAjeossi = new KwakDooPal(40);
                    name = KwakDooPal.NAME;
                    break A;
                case 2:
                    choiceAjeossi = new SeoPalGwang(30);
                    name = SeoPalGwang.NAME;
                    break A;
                case 3:
                    choiceAjeossi = new MaChunDong(20);
                    name = MaChunDong.NAME;
                    break A;
                case 4:
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


        B:
        while (true) {
            if (count == 0) {
                System.out.println();
                // 엔딩으로 가야함 메소드 추가
                ending(ajeossi);

                break B;
            }

            System.out.println("\n=========================");
            System.out.println("트레이닝 선택 (남은기회 " + count + "회)");
            System.out.println("=========================");
            System.out.println(" 1. 줄임말 트레이닝\n 2. 최신 걸그룹노래 맞추기\n " +
                    "3. (복불복) MZ와 1:1 대화하기\n");
            System.out.print("번호선택 : ");

            num = sc.nextInt();

            switch (num) {
                case 1:
                    // 줄일말 트레이닝
                    shortWord(ajeossi);
                    count--;
                    break;
                case 2:
                    // 최신 걸그룹노래 맞추기
                    girlGroup(ajeossi);
                    count--;
                    break;
                case 3:
                    // 1:1 대화
                    mzMeeting(ajeossi);
                    count--;
                    break;
                default:
                    System.out.println("다시 선택해주세요");
            }
        }

    }


    public void end() {

        /* 게임 종료 메소드 */

        System.out.println("\n\n==================== GameOver ===================");
        System.out.println("MZ 근처에 가기도 전에 포기하셨습니다. 게임을 종료합니다...");
        System.out.println("=================================================\n\n");
    }


    public void mzMeeting(Ajeossi ajeossi) {

        /* 복불복 MZ와 1:1 대화하기 */

        int num = (int) (Math.random() * 2);

        if (num == 0) {
            System.out.println("MZ와 대화하다 못알아들어 화를 냈습니다.");
            System.out.println("MZ와의 거리가 멀어졌습니다. MZ력 -50!!");
            ajeossi.mzPower(50, 0);     // isCheck 0이면 점수 마이너스
        } else {
            System.out.println("MZ랑 티키타카 G렸음! 인정? 어 인정. MZ력 50상승!");
            ajeossi.mzPower(50, 1);     // isCheck 0이 아니면 점수 플러스
        }
    }

    public void shortWord(Ajeossi ajeossi) {

        /* 줄임말 게임 */

        Scanner sc = new Scanner(System.in);

        int num = (int) (Math.random() * 7) + 1;
        int answer = 0;     // 문제 정답
        int inputNum = 0;   // 입력받는 정답

        switch (num) {
            case 1:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======== \'캘박\'의 뜻은? =========\n");
                System.out.println(" 1. 캘린더박쥐\n 2. 캘린더박제\n 3. 캘린더박수\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 2;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;

            case 2:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======== \'주불\'의 뜻은? ========\n");
                System.out.println(" 1. 주문불가\n 2. 주가 하락을 보니 불경기네\n 3. 주소불러줘\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 3;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;

            case 3:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======= \'갑통알\'의 뜻은? =======\n");
                System.out.println(" 1. 갑자기 통역 알바\n 2. 갑자기 통장을 보니 알바를 해야 할 것 같다.\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 2;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;
            case 4:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======= \'오운완\'의 뜻은? =======\n");
                System.out.println(" 1. 오늘 운동 완료\n 2. 오늘 운세 완전 좋아\n 3. 오늘 운전 완전 잘한다.\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 1;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;
            case 5:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======= \'오다망\'의 뜻은? =======\n");
                System.out.println(" 1. 오늘 다 망했다.\n 2. 오늘 다들 망부석이야?\n 3. 오늘 다이어트 망했다.\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 3;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;

            case 6:
                System.out.println("\n======= 줄임말 테스트 문제 ========");
                System.out.println("\n======= \'스불재\'의 뜻은? =======\n");
                System.out.println(" 1. 스스로 불러온 재앙\n 2. 스피드하게 불끄는 재능\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 1;

                success(answer, inputNum, 10, ajeossi);     // 정답 확인 메소드
                break;
        }
    }

    public void girlGroup(Ajeossi ajeossi) {

        /* 최신 걸그룹 노래 맞추기 게임 */

        Scanner sc = new Scanner(System.in);

        int num = (int) (Math.random() * 7) + 1;
        int answer = 0;     // 문제 정답
        int inputNum = 0;   // 입력받는 정답

        switch (num) {
            case 1:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘SuperShy’를 부른 그룹은? \n\n1. 소녀시대\n2. 뉴진스\n3. 엑소\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 2;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;
            case 2:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘I AM’를 부른 그룹은? \n\n1. 에스파\n2. HOT\n3. 아이브\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 3;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;
            case 3:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘Unforgiven’를 부른 그룹은? \n\n1. 르세라핌\n2. 원더걸스\n3. NCT\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 1;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;
            case 4:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘퀸카’를 부른 그룹은? \n\n1. (여자)아이들\n2. (남자)아이들\n3. (혼성)아이들\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 1;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;
            case 5:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘Feel my Rhythm’를 부른 그룹은? \n\n1. 레드린넨\n2. 레드코튼\n3. 레드벨벳\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 3;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;
            case 6:
                System.out.println("\n======= 최신 걸그룹 노래 맞추기 문제 ========");
                System.out.println("\n‘Teddy Bear’를 부른 그룹은? \n\n1. 스테이씨\n2. 허각\n3. 방탄소년단\n");
                System.out.print("번호선택 : ");
                inputNum = sc.nextInt();
                answer = 1;

                success(answer, inputNum, 20, ajeossi);     // 정답 확인 메소드
                break;

        }
    }

    public void ending(Ajeossi ajeossi) {

        /* 마지막 mz력으로 엔딩 출력 */

        int result = ajeossi.mzPower(0,2 );

        System.out.println("=========== ENDING ============");
        System.out.println("나의 MZ력은" + result + "점!!!");

        if ( result >= 100) {
            System.out.println("\n내가 바로 MZ 대!통!령!\n");
            System.out.println("　|_＿＿＿\n" +
                    "　|　 　   \\　\n" +
                    "　|   ,ノ   \\\n" +
                    "　|  （ ●）ｕ \\\n" +
                    "　|人__）　　  |\n" +
                    "　|⌒´　　    /     큰일났다\n" +
                    "(⌒ー─’　　  ）     보통이 아니야!\n");
        } else if ( result >= 50) {
            System.out.println("\nMZ 아덜램이 있는 아부지 정도..?\n");
            System.out.println("　　    _＿＿＿_\n" +
                            "　   /　 　　　  \\　\n" +
                            "　  /　 _ノ 　ヽ_  \\ \n" +
                            "  /    （●）（●）   \\ \n" +
                            " |  　//（_人_）///  |    참내..\n" +
                            " \\  　 　　        / \n" +
                            "  /　 　 　    　   \\ \n");

        } else {
            System.out.println("\n나랏말싸미 듕귁에 달아..... 조상님......\n");
            System.out.println("         _＿＿＿_\n" +
                            "　　   /　　 　     \\　\n" +
                            "　   /   _ノ 　ヽ_   \\ \n" +
                            "   /    （●）（●）    \\\n" +
                            "  |   ///（_人_）///  |    측은..\n" +
                            "   \\   　　　 　      / \n" +
                            "   /　 　　　   　    \\ \n");
        }
        System.out.println("===============================");

    }


    public void success(int answer, int inputNum, int power, Ajeossi ajeossi) {

        /* 반복되는 정답유무 확인 메소드 */

        if (inputNum == answer) {
            System.out.println("\n정답입니다! MZ력 " + power + " 상승!\n");
            ajeossi.mzPower(power, 1);     // isCheck 1이면 점수 플러스
        } else {
            System.out.println("\n땡! MZ력 " + power + " 감소!\n");
            ajeossi.mzPower(power, 0);     // isCheck 0이면 점수 마이너스
        }
    }


}
