package com.design.pattern.builderPattern;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MemberShipTest {

    @Test
    public void builderTest(){
        MemberShip memberShip = MemberShipBuilder.builder()
                                        .membershipId("A123")
                                        .userId("id")
                                        .membershipName("Java")
                                        .startDate("20210817")
                                        .membershipStatus("정상")
                                        .point(99999)
                                        .build();

        assertThat(memberShip).isNotNull();
        assertThat(memberShip.getMembershipId()).isEqualTo("A123");
        assertThat(memberShip.getUserId()).isEqualTo("id");
        assertThat(memberShip.getMembershipName()).isEqualTo("Java");
        assertThat(memberShip.getStartDate()).isEqualTo("20210817");
        assertThat(memberShip.getMembershipStatus()).isEqualTo("정상");
        assertThat(memberShip.getPoint()).isEqualTo(99999);

    }

}