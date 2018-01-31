package com.company;

import uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite sveikaji skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();
        objektas.set_a(a);
        System.out.println("Skaicius a: " + objektas.get_a());
        objektas.skaiciuok();
    }
}
