package com.practice.methodsquestions;

public class MethodQuestions {
	

	//Question 1. Create a method printWelcome() that prints “Welcome to Java”.
	
	public void printWelcome() {
		
		System.out.println("Welcome in Java");
		
	}
	
	//Question 2. Create a method printEvenNumbers() that prints all even numbers from 1 to 20.
	
	public void printEvenNumbers() {
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % 2 == 0) {
				
				System.out.print(i + " ");
				
			}
			
		}
		
		System.out.println();
		
	}
	
	//Question 3. Create a method printSquarePattern() that prints a 3 × 3 square of stars.
	
	public void printSquarePattern() {
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <= 3;j++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	//Question 4. Create printSquare(int n) to print the square of a number.
	
	public void printSquare(int n) {
		
		int square = n * n;
		System.out.println("Square of "+n +" = "+square);
		
	}
	
	//Question 5. Create printDetails(String name, int age) to print a person's name and age.
	
	public void printDetails(String name, int age) {
		
		System.out.println("Name --> "+name);
		System.out.println("Age --> "+age);
		
	}
	
	//Question 6. Create printMultiplicationTable(int n) to print the multiplication table of a number from 1 to 10.
	
	public void printMultiplicationTable(int n) {
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(n+" * "+i+" = "+(n * i));
			
		}
		
	}
	
	//Question 7. Create getAge() that returns an int representing your chosen age.
	
	public int getAge() {
		
		int age = 23;
		return age;
		
	}
	
	//Question 8. Create getPi() that returns the value 3.14159 as a double.
	
	public double getPi() {
		
		double pi = 3.14159;
		return pi;
		
	}
	
	//Question 9. Create add(int a, int b) that returns the sum of two numbers.

	
	public void add(int a, int b) {
		
		int add = a + b;
		System.out.println(a + " + "+ b+ " = "+ add);
		
	}
	
	//Question10. Create isPositive(int n) that returns a boolean indicating whether a number is greater than zero.
	
	public boolean isPositive(int n) {
		
		if(n > 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	//Question11. Create printCalculatorMenu() that displays options for addition, subtraction, multiplication, and division.
	
	public void printCalculatorMenu() {
		
		System.out.println("====Calculator Menu====");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		
	}
	
	//Question12. Create printFibonacci() that prints the first 10 Fibonacci numbers.

	
	public void printFibonacci() {
		
		int num1 = 0;
		int num2 = 1;
		
		for(int i = 1; i<= 10; i++) {
			
			System.out.print(num1+" ");
			
			int num3 = num1 + num2;
			
			num1 = num2;
			num2 = num3;
			
			
		}
		
		System.out.println();
		
	}
	
	//Question13. Create printMax(int a, int b, int c) that prints the largest of three numbers.
	
	public void printMax(int a, int b, int c) {
		
		if(a > b && a > c) {
			
			System.out.println("Largest number = "+a);
			
		} else if(b > a && b > c) {
			
			System.out.println("Largest number = "+b);
			
		} else if(c > a && c > b) {
			
			System.out.println("Largest number = "+c);
			
		} else {
			
			System.out.println("Write Different Numbers");
			
		}
		
	}
	
	//Question 14. Create printGrade(String name, int marks) that prints a student's name and grade based on marks.
	
	public void printGrade(String name, int marks) {
		
		System.out.println("Student Name = "+name);
		
		if(marks <= 100 && marks >= 0) {
			
			System.out.println("Student Marks = "+marks);
			
			if(marks >= 80) {
				
				System.out.println("Pass with A Grade");
				
			} else if(marks >= 60 && marks <= 79 ) {
				
				System.out.println("Pass with B Grade");
				
			} else if (marks >= 35) {
				
				System.out.println("Pass with C Grade");
				
			} else {
				
				System.out.println("Fail");
				
			}
			
			
		} else {
			
			System.out.println("Enter valid marks");
			
		}
		
	}
	
	//Question 15. Create getGreeting() that returns a String such as "Hello, Java Learner!".
	
	public String getGreeting() {
		
		String s = "Hello, Java Learner !";
		return s;
		
	}
	
	//Question 16. Create calculateArea(double length, double width) that returns the area of a rectangle as a double.
	
	public double calculateArea(double length, double width) {
		
		double area = length * width;
		return area;
		
	}
	
	//Question 17. Create printPrimeNumbers() that prints all prime numbers from 1 to 50.
	
	public void printPrimeNumbers() {
		
		System.out.println("Prime Numbers between 1 to 50 :");
		
		for(int i = 1; i <= 50; i++) {
			
			int count = 0;
			
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					
					count++;
					
				}
				
			}
			
			if(count == 2) {
				
				System.out.print(i+" ");
				
			}
			
		}
		
		System.out.println();
		
	}
	
	//Question 18. Create displayStudent(String name, int age, double percentage) that prints all three student details.

	public void displayStudent(String name, int age, double percentage) {
		
		System.out.println("Student Name = "+name);
		System.out.println("Student age = "+age);
		System.out.println("Percentage = "+percentage);
		
	}
	
	// Question 19. Create getInitials(String firstName, String lastName) that returns the initials as a String.
	
	public String getInitials(String firstName, String lastName) {
		
		String fName = firstName;
		String lName = lastName;

		return fName + " " + lName;
		
	}
	
	// Question 20. Create a method that accepts two numbers and operator , then returns the calculated result using switch.
	
	public String basicCalculator(int a, int b, String operator) {
	
		int c = 0;
		
		switch(operator) {
		
		case "+" :
			c = a + b;
			break;
		
		case "-" :
			c = a - b;
			break;
			
		case "*" :	
			c = a * b;
			break;
		
		case "/" :
			c = a / b;
			break;
			
		default :
			System.out.println("Enter valid operators.");
			return null;
		
		}
		return a + operator + b + " = "+c;
			
	}
	
	//Question 21. Create a method that accepts character and returns "Vowel" or "Consonant" using switch.
	
	public String vowelOrConsonant(char ch) {
		
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
				return "Vowel";
				
			} else {
				
				return "Consonant";
				
			}		
			
		} else {
			
			return "Invalid Input";
			
		}
		
	}
	 

	
}
