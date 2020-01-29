/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramseykerleylab01;

import java.util.Random;

/**
 *
 * @author ramsey.kerley
 */
public class Die {

    private int[] sides;

    public Die() {
        sides = new int[6];
    }

    public Die(int x) {
        this.sides = new int[x];
    }

    /**
     * rolls a single die
     *
     * @return
     */
    public int roll() {
        Random rand = new Random();
        int roll = rand.nextInt(sides.length) + 1;

        return roll;
    }
}
