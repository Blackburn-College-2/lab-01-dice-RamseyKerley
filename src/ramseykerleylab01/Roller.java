/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramseykerleylab01;

/**
 *
 * @author ramsey.kerley
 */
public class Roller {

    /**
     * this class rolls the dice
     */
    public Roller(Die roll) {

        while (true) {

            System.out.println(roll.roll());
        }

    }
}
