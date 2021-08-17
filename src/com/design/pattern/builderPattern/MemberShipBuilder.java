package com.design.pattern.builderPattern;

public class MemberShipBuilder {
    private String membershipId;
    private String userId;
    private String membershipName;
    private String startDate;
    private String membershipStatus;
    private int point;

    public static MemberShipBuilder builder() {
        return new MemberShipBuilder();
    }

    public MemberShipBuilder membershipId(String membershipId) {
        this.membershipId = membershipId;
        return this;
    }

    public MemberShipBuilder userId(String userId) {
        this.userId = userId;
        return this;
    }

    public MemberShipBuilder membershipName(String membershipName) {
        this.membershipName = membershipName;
        return this;
    }

    public MemberShipBuilder startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public MemberShipBuilder membershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
        return this;
    }

    public MemberShipBuilder point(int point) {
        this.point = point;
        return this;
    }

    public MemberShip build() {
        return new MemberShip(membershipId, userId, membershipName, startDate, membershipStatus, point);
    }

    public String toString() {
        return "MemberShipBuilder(membershipId=" + this.membershipId + ", userId=" + this.userId + ", membershipName=" + this.membershipName + ", startDate=" + this.startDate + ", membershipStatus=" + this.membershipStatus + ", point=" + this.point + ")";
    }
}
