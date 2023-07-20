package com.brorsoo.game.escapeAjeossi.run;

import com.brorsoo.game.escapeAjeossi.service.AjeossiManager;
import com.brorsoo.game.escapeAjeossi.dto.Ajeossi;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AjeossiManager ajeossiManager = new AjeossiManager();
        Ajeossi ajeossi = null;

        mainMenu :
        while (true) {
            System.out.println("\n=======================================");
            System.out.println("  ⢰⠒⠒⠒⢲⠆⠀⠀⢀⠤⢤⡀⠀ ⡴⠀⠀⢀⣀⣀⣰⣀⣀⡀⠀⠀⠀⠀⠀\n" +
                                 "⠀⠀⣎⣀⣀⣀⡜⠀⠀⢰⠃⠀ ⢠⠇ ⢰⠓⠂⠀⢀⠔⠒⠒⠲⡄⠀⠀⠀⠀⠀⠀\n" +
                                 "⠤⠤⠤⣤⠤⠤⠤⠄⠀⣇⠀ ⢀⠞ ⢀⡯⠤⠀⠀⠹⠤⡤⠤⠞⠁⠀⢠⠔⢤⣀⠆\n" +
                                 " ⠀⠀⢀⡏⠀⠀⠀⠀  ⠈⠉⠁⠀  ⡸⠀⠀⠠⠤⠤⠴⠧⠤⠤⠄⠀⠀⠀⠀⠀\n");
            System.out.println("============ 아저씨 탈출하기 ============");
            System.out.println("1. 아저씨 선택");
            System.out.println("2. MZ능력치 재확인 (selected : " + ajeossiManager.name + ")" );
            System.out.println("3. 트레이닝하기");
            System.out.println("0. 그냥 아저씨로 살기 (게임종료)");
            System.out.println("======================================");
            System.out.print("\n번호선택 : ");
            int menuNo = sc.nextInt();

            switch (menuNo) {
                case 1 :    // 아저씨 선택
                    ajeossi = ajeossiManager.selectAjeossi();
                    break;
                case 2 :    // MZ능력치 재확인
                    if(ajeossi != null) {
                        System.out.println(ajeossi);
                        ajeossi.ment();
                        break;
                    } else {
                        System.out.println("\n선택한 아저씨가 없습니다.\n");
                        break;
                    }
                case 3 :    // 트레이닝 메뉴
                    if(ajeossi != null) {
                        ajeossiManager.trainingMenu(ajeossi);
                        break mainMenu;
                    } else {
                        System.out.println("\n선택한 아저씨가 없습니다.\n");
                        break;
                    }
                case 0 :    // 그냥 아저씨로 살기(게임 종료)
                    ajeossiManager.end();
                    break mainMenu;
                default:
                    System.out.println("잘못 선택하셨습니다.");

            }
        }
    }
}
