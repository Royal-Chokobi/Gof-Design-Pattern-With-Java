package com.design.pattern.compositePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.design.pattern.compositePattern
 * fileName       : Component
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
@Getter @Setter
@AllArgsConstructor
abstract public class Component {

    private String name;
}
