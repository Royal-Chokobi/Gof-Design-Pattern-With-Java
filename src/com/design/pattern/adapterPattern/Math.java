package com.design.pattern.adapterPattern;

public class Math {
    /**
     * 이미 설계된 프로세스
     * **/

    //두배
    public static double twoTime(double num){
        return num*2;
    }

    //절반
    public static double half(double num){
        return num/2;
    }

    //강화된 알고리즘
    public static Double doubled(Double d){
        return d*2;
    }
}
