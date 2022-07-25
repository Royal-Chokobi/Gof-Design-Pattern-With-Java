package com.design.pattern.compositePattern;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.design.pattern.compositePattern
 * fileName       : File
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
@Getter
public class File extends Component{

    public File(String name) {
        super(name);
    }

    private Object data;
}
