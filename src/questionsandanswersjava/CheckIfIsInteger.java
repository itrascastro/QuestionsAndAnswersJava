/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsandanswersjava;

/**
 *
 * @author ismael trascastro
 */
public class CheckIfIsInteger 
{
    public static void main(String[] args)
    {
        System.out.println(CheckIfIsInteger.isInteger("3"));
    }
    
    public static boolean isInteger( String input )  
    {  
        try  
        {  
            Integer.parseInt( input );  
            return true;  
        } 
        catch( NumberFormatException e)  
        {  
            return false;  
        }  
    }
}
