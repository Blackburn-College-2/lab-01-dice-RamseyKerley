/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramseykerleylab01;

import java.util.Scanner;

/**
 *
 * @author ramsey.kerley
 */
public class Counter {

    Scanner scan = new Scanner(System.in);

    public Counter() {
        System.out.println("How many sides should your die have");
        int sides = scan.nextInt();

        Die die = new Die(sides);
        Roller x = new Roller(die);

    }
}
