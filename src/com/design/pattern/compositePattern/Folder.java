package com.design.pattern.compositePattern;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.design.pattern.compositePattern
 * fileName       : Folder
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
@Getter
public class Folder extends Component{
    public Folder(String name) {
        super(name);
    }
    List<Component> child = new ArrayList<>();

    public boolean add(Component component){
        return child.add(component);
    }

    public boolean remove(Component component){
        return child.remove(component);
    }
}
