package com.design.pattern.bridgePattern;

/**
 * packageName    : com.design.pattern.bridgePattern
 * fileName       : DefaultMorseCode
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
public class DefaultMorseCode implements MorseCodeFuntion{
    @Override
    public void dot() {
        System.out.print(".");
    }

    @Override
    public void dash() {
        System.out.print("-");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
