package com.design.pattern.builderPattern;

public class MemberShip {

    private String membershipId;
    private String userId;
    private String membershipName;
    private String startDate;
    private String membershipStatus;
    private int point;

    MemberShip(String membershipId, String userId, String membershipName, String startDate, String membershipStatus, int point) {
        this.membershipId = membershipId;
        this.userId = userId;
        this.membershipName = membershipName;
        this.startDate = startDate;
        this.membershipStatus = membershipStatus;
        this.point = point;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public String getUserId() {
        return userId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "MemberShip{" +
                "membershipId='" + membershipId + '\'' +
                ", userId='" + userId + '\'' +
                ", membershipName='" + membershipName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", membershipStatus='" + membershipStatus + '\'' +
                ", point=" + point +
                '}';
    }
}
