package com.company;

public class Team7 extends Anime implements Printable {
    private String ability;


    public Team7(String ability) {
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }
    @Override
    public void print() {
        System.out.println(getName()+"\n"+" "+getAbility());
    }
}
