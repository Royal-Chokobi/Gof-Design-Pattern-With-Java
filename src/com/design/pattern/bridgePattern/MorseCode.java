package com.design.pattern.bridgePattern;

/**
 * packageName    : com.design.pattern.bridgePattern
 * fileName       : MorseCode
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
public class MorseCode{
    MorseCodeFuntion morseCodeFuntion;

    public MorseCode(MorseCodeFuntion morseCodeFuntion){
        this.morseCodeFuntion = morseCodeFuntion;
    }

    public void setMorseCodeFuntion(MorseCodeFuntion morseCodeFuntion) {
        this.morseCodeFuntion = morseCodeFuntion;
    }

    public void dot(){
        morseCodeFuntion.dot();
    }
    public void dash(){
        morseCodeFuntion.dash();
    }
    public void space(){
        morseCodeFuntion.space();
    }
}
