package com.mdi.calculator;

import java.util.Scanner;

public class CalculatorStandard {
	public CalculatorStandard(){
		Scanner scan = new Scanner(System.in);
        int oldValue = 0;
        while(true){
        	System.out.println("\nQuelle valeur pour a?(Ans pour l'ancienne valeur)");
        	String aChoice = scan.next();
        	int a=1;
        	if(aChoice.equals("Ans")){
        		a = oldValue;
        	}
        	else {
        		a = Integer.parseInt(aChoice);
        	}
        	
        	

        	System.out.println("\nQuelle valeur pour b?(Ans pour l'ancienne valeur)");
        	String bChoice = scan.next();
        	int b=1;
        	if(bChoice.equals("Ans")){
        		b = oldValue;
        	}
        	else {
        		b = Integer.parseInt(bChoice);
        	}


            System.out.println("\nQuelle opération voulez-vous faire ?\n\t+,-,*,ou /");
        	String opChoice = scan.next();
        	
        	switch(opChoice){
	        	case "+":
	        		oldValue = a + b;
	        		break;
	        	case "-":
	        		oldValue = a - b;
	        		break;
	        	case "*":
	        		oldValue = a * b;
	        		break;
	        	case "/":
	        		if(b==0)b=1;
	        		oldValue = a / b;
	        		break;
	        	default:
	        		System.out.println("\nMauvaise opération");
        	}
        	System.out.println("RES : "+oldValue);
        	
        	System.out.println("\nStop? (o/n)\n\n");
        	if(scan.next().equals("o")) break;
        }
	}
}
