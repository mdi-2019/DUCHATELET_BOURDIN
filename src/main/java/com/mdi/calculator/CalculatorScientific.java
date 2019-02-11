package com.mdi.calculator;

import java.util.Scanner;

import org.apache.commons.math3.analysis.function.Exp;

public class CalculatorScientific {
	public CalculatorScientific() {
		Scanner scan = new Scanner(System.in);
		double oldValue = 0;
		while (true) {
			System.out.println("\nQuelle valeur pour a?(Ans pour l'ancienne valeur)");
			String aChoice = scan.next();
			double a = 1;
			if (aChoice.equals("Ans")) {
				a = oldValue;
			} else {
				a = Integer.parseInt(aChoice);
			}

			System.out.println("\nQuelle opération voulez-vous faire ?\n\texp ou ln");
			String opChoice = scan.next();

			switch (opChoice) {
			case "exp":
				oldValue = new Exp().value(a);
				break;
			case "ln":
				System.out.println("OSBLC");
			default:
				System.out.println("\nMauvaise opération");

			}
			System.out.println("RES : " + oldValue);

			System.out.println("\nStop? (o/n)\n\n");
			if (scan.next().equals("o"))
				break;
		}
	}
}
