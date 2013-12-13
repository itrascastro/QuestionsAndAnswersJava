/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsandanswersjava;

import java.util.Scanner;

/**
 *
 * @author ismael trascastro
 */
public class ReadChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char c;
        
        c = in.next().charAt(0);
        
        System.out.println(c);
    }
}
