package com.design.pattern.bridgePattern;

/**
 * packageName    : com.design.pattern.bridgePattern
 * fileName       : PrintMorseCode
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
public class PrintMorseCode extends MorseCode{

    public PrintMorseCode(MorseCodeFuntion morseCodeFuntion) {
        super(morseCodeFuntion);
    }

    public PrintMorseCode A(){
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode J(){
        dot();
        dash();
        dash();
        dash();
        space();
        return this;
    }

    public PrintMorseCode V(){
        dot();
        dot();
        dot();
        dash();
        space();
        return this;
    }

}
