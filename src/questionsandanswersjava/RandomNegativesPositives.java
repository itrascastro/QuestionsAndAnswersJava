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
public class RandomNegativesPositives {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        for (int i=0; i<100; i++)
        {
            System.out.println((aleatorio.nextInt(65536)-32768));
        }
    }
}
