package com.mdi.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	enum Mode {STANDARD, SCIENTIFIC};
    public static void main( String[] args )
    {
        System.out.println( "Choisissez votre mode: \n\t0 - standard\n\t1 - scientific");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        Mode mode = (choice==0)?Mode.STANDARD:Mode.SCIENTIFIC;
        
        System.out.println(mode);
        
    }
}
