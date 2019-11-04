package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Ninja").print();
        System.out.println("__________________");
        createObject("Konoha").print();
        System.out.println("___________________");
        createObject("Team7").print();
        System.out.println("___________________");

    }

    public static Printable createObject(String className) {
        Printable printable=null;
        switch (className) {
            case "Ninja":
                printable = new Ninja(70, 120);
                break;
            case "Konoha":
                printable = new Konoha("Uzumaki", "Genin");
                break;
            case "Team7":
                printable = new Team7("UseChakra");
                break;

        }return printable;

    }
}
