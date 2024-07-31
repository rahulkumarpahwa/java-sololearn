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


