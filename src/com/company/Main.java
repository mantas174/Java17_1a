package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int skaicius;
        Scanner in = new Scanner(System.in);
        Main obj = new Main();

        System.out.println("Iveskite Skaiciu");
        skaicius = in.nextInt();

        obj.arLyginis(skaicius);
    }

    public void arLyginis(int sk){
        if (sk % 2 == 0){
            System.out.println("skaicius lyginis");
        }else {
            System.out.println("Skaicius nelyginis");
        }
    }
}
