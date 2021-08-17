package com.design.pattern.builderPattern;

public class Main {
    public static void main(String[] args) {

        MemberShip memberShip = MemberShipBuilder.builder()
                                        .membershipId("A123")
                                        .userId("id")
                                        .membershipName("Java")
                                        .startDate("20210817")
                                        .membershipStatus("정상")
                                        .point(99999)
                                        .build();

        System.out.println("memberShip.toString() = " + memberShip.toString());

    }
}
