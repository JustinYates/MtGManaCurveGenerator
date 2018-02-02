package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("type your card mana type to start");

        Scanner ManaType = new Scanner(System.in);

        Scanner ManaCost = new Scanner(System.in);

        Scanner CardName = new Scanner(System.in);

        Scanner Colorless = new Scanner(System.in);

        String SmanaCost = ManaType.nextLine();

        System.out.println("How much " + SmanaCost + " mana " + "is the card?: ");

        int manaCost = ManaCost.nextInt();

        System.out.print("Name of the card?: ");

        String Cname = CardName.nextLine();

        System.out.println(" And how much colorless mana if any: ?");

        int ColorlessC = Colorless.nextInt();

        System.out.print("So your " + Cname + " card " + "cost" + " " + manaCost + " " + SmanaCost + " mana " + "with " + ColorlessC + " " + "colorless mana?");

    }
}
