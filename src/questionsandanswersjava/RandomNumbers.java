/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsandanswersjava;

import java.util.Random;

/**
 *
 * @author ismael trascastro
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(26));
    }
}
