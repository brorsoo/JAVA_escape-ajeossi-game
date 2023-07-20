package com.brorsoo.game.escapeAjeossi;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AjeossiManager ajeossiManager = new AjeossiManager();
        Ajeossi ajeossi = null;
        Ajeossi seletedAjeossi = null;

        mainMenu :
        while (true) {
            System.out.println("======== 아저씨 탈출하기 ========");
            System.out.println("1. 아저씨 선택");
            System.out.println("2. 트레이닝하기");
            System.out.println("3. 현재 MZ능력치 확인");
            System.out.println("9. 그냥 아저씨로 살기 (게임종료)");
            System.out.print("번호선택 : ");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1 :    // 아저씨 선택
                    ajeossi = ajeossiManager.selectAjeossi();
                    seletedAjeossi = ajeossi;
                    break;
                case 2 :    // 트레이닝 메뉴
                    ajeossiManager.trainingMenu(seletedAjeossi);
                    break;
                case 3 :    // 현재 MZ능력치 확인
                    if(ajeossi != null) {
                        System.out.println(ajeossi);
                        ajeossi.ment();
                        break;
                    } else {
                        System.out.println("\n선택한 아저씨가 없습니다.\n");
                        break;
                    }
                case 9 :    // 그냥 아저씨로 살기(게임 종료)
                    ajeossiManager.getName();
                    break mainMenu;
                default:
                    System.out.println("잘못 선택하셨습니다.");

            }
        }
    }
}
