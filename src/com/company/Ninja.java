package com.company;

public class Ninja  extends Anime implements Printable{
    private int attack;
    private int chakra;


    public Ninja(int attack,int chakra) {
        this.attack = attack;
        this.chakra = chakra;
    }

    public int getAttack() {
        return attack;
    }



    public int getChakra() {
        return chakra;
    }

    @Override
    public void print() {
        System.out.println(getName()+"\n"+ " "+getAttack()+"\n" + " "+getChakra());
    }

}
