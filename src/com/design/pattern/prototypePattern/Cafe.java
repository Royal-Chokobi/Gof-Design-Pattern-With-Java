package com.design.pattern.prototypePattern;

public class Cafe implements Cloneable{

    private int number;
    private CoffeeMenu coffeeMenu;

    public Cafe(int number, CoffeeMenu menu) {
        this.number = number;
        this.coffeeMenu = menu;
    }

    protected Object deepCopy() throws CloneNotSupportedException {
        Cafe cafe = (Cafe) this.clone();
        cafe.setCoffeeMenu(new CoffeeMenu(this.getCoffeeMenu().getMenu(), this.getCoffeeMenu().getPrice()));
        return cafe;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cafe cafe = (Cafe) super.clone();
        cafe.setNumber(cafe.getNumber()+1);
        return cafe;
//        return super.clone();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public CoffeeMenu getCoffeeMenu() {
        return coffeeMenu;
    }

    public void setCoffeeMenu(CoffeeMenu coffeeMenu) {
        this.coffeeMenu = coffeeMenu;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "number =" + number +
                ", coffeeMenu =" + coffeeMenu +
                '}';
    }
}
