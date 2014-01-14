/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *
 * @author ismael trascastro
 */
public class Examples {
    public static int[][] table = {{2, 3, 4}, {1, 1, 1}, {3, 5, 6}};
    
    public static void main(String[] args)
    {
        Examples.find(0);
    }
    
    public static void find(int n)
    {
        int[][] myArray = Examples.table;
        
        for (int i=0; i<myArray.length; i++) {
            for (int j=0; j<myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
