//chapter 1:
// Input

// Some programs need user input. For example, a game may ask the user for a nickname and show it in the game, or a converter can ask for a value that you want to convert.
// There are a number of ways to take input in Java. Tap Continue to learn how.

// To take input from the user, we first must import the corresponding class.That is done using the following line:
import java.util.Scanner;

// This line should be written at the very top of your code, before the class declaration.This imports the Scanner class, which we will use for taking input.
// After importing the Scanner class, we need to create a Scanner object:
Scanner sc = new Scanner(System.in);

// Confused about the new terminology? Classes, objects, import... Don't worry, you will learn about these in more advanced lessons. For now, just remember the syntax for creating the Scanner object.

// Now we are ready to take input from the user and assign it to a variable. For example, to take a String input, we need to use the following:
import java.util.Scanner;

class Demo {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); 
        System.out.println("Name: "+name);        
    }
}

//Similarly, we can take a integer as input using nextInt():
import java.util.Scanner;

class Demo {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age: "+age);        
    }
}
//This will accept an integer input from the user and assign it to the age variable. There are similar methods available to take other types as input: nextDouble(), nextFloat(), nextBoolean().

// Multiple Inputs

// You can use the same Scanner to take multiple inputs. For example, let's take the name and age as input and output them
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name+": "+age);

	}
}

// Note, that when you run it in our Playground, you need to provide all the inputs in the popup, separated by new lines.

// chapter 1 Finished.

//chapter 2:
// PRACTICE EXERCISE
// Tip Calculator 

// You always tip 15% of the bill amount. 
// To make the calculation easier, you decide to write a program that will do that for you.
// Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.
// To calculate 15% of a number, multiply it by 15, then divide by 100.
// The input amount can be a decimal, so take a double from the input.

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        
    }
}

//my solution :

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble(); 
        System.out.println(15 * amount / 100);
        
    }
}

//chapter 2 Finished.

//chapter 3:
// Decision Making

// Conditional statements are used to perform different actions based on different conditions. 
// For example, a billing program can apply a discount to the total only if the amount is greater than a threshold. 
// Let's learn how to create such programs.



// The if statement is one of the most frequently used conditional statements. If the if statement's condition is true, the block of code inside the if statement is executed. 

// syntax:
if (condition) {
  //some code 
}

// if Statement
// Any of the following comparison operators may be used to form the condition:
// < less than
// > greater than
// != not equal to
// == equal to
// <= less than or equal to
// >= greater than or equal to

//For example:
class Demo {
    public static void main(String[ ] args) {
        int age = 24;
        if(age >= 18) {
            System.out.println("Welcome");
        }     
    }
}

// This code will output the message only if the age value is greater or equal to 18.

//Remember that you need to use two equal signs (==) to test for equality, since a single equal sign is the assignment operator.

// For example:
class Demo {
    public static void main(String[ ] args) {
        int number = 8;
        if(number == 8) {
            System.out.println("Bingo");
        }
    }
}

//else Statement
// An if statement can be followed by an optional <b>else </b>statement, which executes when the condition evaluates to false.

// For example:
class Demo {
    public static void main(String[ ] args) {
        int age = 30;

        if (age < 16) {
            System.out.println("Too Young");
        } else { 
           System.out.println("Welcome!");
        }
    }
}

//As <b>age </b>equals 30, the condition in the <b>if </b>statement evaluates to false and the <b>else </b>statement is executed.

//Nested if Statements
// You can use one if-else statement inside another <b>if</b> or <b>else </b>statement.

// For example:

class Demo {
    public static void main(String[ ] args) {
        int age = 25;
        if(age > 0) {
          if(age > 16) {
              System.out.println("Welcome!");
          } else {
              System.out.println("Too Young");
          }
        } else {
            System.out.println("Error");
        }
    }
}

//You can nest as many if-else statements as you want, however the code will become harder to read and understand.

// else if Statements
// Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.
// For example:

class Demo {
    public static void main(String[ ] args) {
        int age = 25;

        if(age <= 0) {
           System.out.println("Error");
        } else if(age <= 16) {
           System.out.println("Too Young");
        } else if(age < 100) {
           System.out.println("Welcome!");
        } else {
           System.out.println("Really?");
        }
    }
}

// You can include as many else if statements as you need.

//chapter 3 Finished.