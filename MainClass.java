package com.practice.methodsquestions;

public class MainClass {

	public static void main(String[] args) {
		
		MethodQuestions m = new MethodQuestions();
		
		m.printWelcome();
		System.out.println();
		
		m.printEvenNumbers();
		System.out.println();
		
		m.printSquarePattern();
		System.out.println();
		
		m.printSquare(4);
		System.out.println();
		
		m.printDetails("Rahul", 23);
		System.out.println();
		
		m.printMultiplicationTable(5);
		System.out.println();
		
		System.out.println("Age = "+m.getAge());
		System.out.println();
		
		System.out.println("Value of Pi = "+m.getPi());
		System.out.println();
		
		m.add(23, 12);
		System.out.println();
		
		System.out.println(m.isPositive(8));
		System.out.println();
		
		m.printCalculatorMenu();
		System.out.println();
		
		m.printFibonacci();
		System.out.println();
		
		m.printMax(45, 56, 23);
		System.out.println();
		
		m.printGrade("Priya", 78);
		System.out.println();
		
		System.out.println(m.getGreeting());
		System.out.println();
		
		System.out.println("Area of Rectangle = "+m.calculateArea(56.54, 45.45));
		System.out.println();
		
		m.printPrimeNumbers();
		System.out.println();
		
		m.displayStudent("Pranjal Darekar", 21, 88.98);
		System.out.println();
		
		System.out.println(m.getInitials("Pranjal", "Darekar"));
		System.out.println();
		
		System.out.println(m.basicCalculator(34, 2, "*"));
		System.out.println();
		
		System.out.println(m.vowelOrConsonant('P'));
		System.out.println();
		
		System.out.println("Second largest number = "+m.secondLargestNumber(55, 34, 45));
		System.out.println();
		
		System.out.println(m.profitOrLoss(1600.00, 2000.00));
		System.out.println();
		
		System.out.println(m.triangleValidity(54, 66, 60));
		System.out.println();
		
		System.out.println("Bonus amount = "+m.employeeAmount(65000.00, 5));
		System.out.println();
		
		m.areaCalculator();
		System.out.println();
		
		m.printElectricityMenu();
		System.out.println();
		
        m.displayPattern();
        System.out.println();
        
        m.printFactors(12);
        System.out.println();
		
		System.out.println("GCD = "+m.findGCD(12, 18));
	    System.out.println();
		
	}
	
}
