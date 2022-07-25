package com.design.pattern.bridgePattern;

/**
 * packageName    : com.design.pattern.bridgePattern
 * fileName       : Main
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        PrintMorseCode printMorseCode = new PrintMorseCode(new DefaultMorseCode());

        printMorseCode.J().A().V().A();
    }
}
