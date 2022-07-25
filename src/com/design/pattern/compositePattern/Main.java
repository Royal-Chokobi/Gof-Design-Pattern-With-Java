package com.design.pattern.compositePattern;

/**
 * packageName    : com.design.pattern.compositePattern
 * fileName       : Main
 * author         : Jae-Yoon Lee
 * date           : 2022/07/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/25        Jae-Yoon Lee       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        // root/home/jyl/a.java
        // root/home/jyl/b.java
        // root/usr/c.java

        Folder root = new Folder("root"),
                home = new Folder("home"),
                jyl = new Folder("jyl"),
                usr = new Folder("usr");

        File a = new File("a.java"),
                b = new File("b.java"),
                c = new File("c.java");

        root.add(home);
            home.add(jyl);
                jyl.add(a);
                jyl.add(b);
        root.add(usr);
            usr.add(c);

        showAll(root);
    }

    public static void showAll(Component component){
        System.out.println(component.getClass().getSimpleName()+" : "+component.getName());
        if(component instanceof Folder){
            for(Component c : ((Folder) component).getChild()){
                showAll(c);
            }
        }
    }

}
