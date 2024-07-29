//chapter 1 & 2 :

System.out.println("Write once, run anywhere!");

public class Program
{
    public static void main(String[] args) {
        System.out.println("Name: Rahul Kumar");
        System.out.println("Surname: Kumar");
	}
}

public class Program
{
    public static void main(String[] args) {
        System.out.println("Points:");
        System.out.println(500);
	}
}



//First Java Program

public class Program
{
    public static void main(String[] args) {
        System.out.println("My first Java Code Coach!");
	}
}

//chapter 1 & 2 finished.


// chapter 3: 

// In this lesson we will break down the structure of Java programs and understand how they work.
// The whole code to create a valid Java program that outputs a simple text is the following:

class Demo {
  public static void main(String[] args) {
    System.out.println("Hi there");
  }
}

//The first line of the code defines a class called Demo.
//In Java, every line of code that can actually run needs to be inside a class. You can call the class anything you want.
//We will learn more about classes in more advanced modules. For now, just remember, that any Java program needs to be inside a class.

class Demo {}

// Our program includes one more thing that we need to cover:

// As you can see, the Demo class includes the following line:
public static void main(String[] args) {}
// In Java, each application has an entry point, or a starting point, which is a method called main.
// We will cover public, static and void keywords definition in later lessons, when learning about methods. For now, remember that the main method needs to be declared identically to the code above.

// Notice that the main method, similar to the class, opens and closes with curly brackets.
public static void main(String[] args) {
  System.out.println("Hi there");
}

// The main method contains the code that executes when we run our program. In this case, the println method will be executed, when we run our program.

// The main method can contain multiple statements, for example:
class Demo {
  public static void main(String[] args) {
    System.out.println("Welcome");
    System.out.println("This is a demo"); 
    System.out.println("Bye");
  }
} 

// This is now a fully functioning Java program.

// chapter 3 finished

//chapter 4: 
/*Your First Code Coach 

Let's code for real!
The given program outputs “Coding is boring”.
But that’s not true, is it? Let’s change the message.

Task:
Modify the code to output "Coding is fun" to the screen. */

class Demo{
    public static void main(String[] args) {
        System.out.println("Coding is boring");
    }
}

//solution :

class Demo{
    public static void main(String[] args) {
        System.out.println("Coding is fun");
    }
}

// chapter 4 finished.

//chapter 5:

// Every program works with values.
// A variable lets you store a value by assigning it to a name. The name can be used to refer to the value later in the program.

// Every variable has a type, which defines the type of the value it holds.
// A variable can hold a text value, a number, a decimal, etc.
// We are already familiar with text values - they are created using quotes:

"this is some text"

// Text in quotes is called a String.

// Let's create a variable of type String:
String name;

//This creates a variable called name of type String. Now, our variable name can hold String values.
// In programming terms, the process of creating a variable is called declaration.
//After declaring our variable, we can assign it a value using the assignment = operator:

String name;
name = "James";
//Now, name holds the value "James".
//Note, that the type String should start with a capital letter S. A lowercase version will cause an error.

// We can use our variable in our program.
// For example, let's output its value using println():
class Demo {
    public static void main(String[] args) {
        String name;
        name = "James";
        System.out.println(name); 
    }
}

// We can combine the declaration and assignment into one statement, like this:
class Demo {
    public static void main(String[] args) {
        String name = "James";

        System.out.println(name);
    }
}
// This is handy when we already know the value for our variable and makes the code shorter and more readable.
//A variable can change its value during the program multiple times. For example, the player of a game can change his name:
class Demo {
    public static void main(String[] args) {
        String name = "James";
        name = "David";

        System.out.println(name);
    }
}

// Lesson 5 Finished.

//Lesson 6 Started : 
//Storing Characters

// The given program declares a variable that holds all the letters of the English alphabet. Task: Complete the program to output the value of the variable.
public class Program {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
    }
}

//solution:
public class Program {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet);
    }
}

//Lesson 6 Finished.

//Lesson 7 Started:

//Types

// There are other types that you can use for variables. The int type is used to store whole numbers (or integers, as we call them in programming).

class Demo {
    public static void main(String[] args) {
        int age = 42; 

        System.out.println(age);
    }
}

//Decimals
// To work with decimal numbers, use the type double:

class Demo {
    public static void main(String[] args) {
        double weight = 12.5; 

        System.out.println(weight);
    }
}

// Decimals

// Java has another type for decimals called float. When using the float type, you need to use an f postfix after the value:
class Demo {
    public static void main(String[] args) {
        float height = 1.94f; 

        System.out.println(height);
    }
}

// This tells Java to use the value as a float, instead of double.
// Wondering what's the difference between float and double? Tap Continue to learn more!

// float vs double

/* By default, decimal values are of type double.

float is using less storage in the memory, but is not as precise as the double type.

This means that the calculations that use floats are faster than the ones that use double, however, the result is less accurate in terms of the decimal digits. */

//As a general rule: use float instead of double when memory usage is critical. If you need more precise computations, for example, when dealing with currency, use double.

// Characters

// The char type is used to hold a single character. It is created similar to Strings, however it uses single quotes for the value:
class Demo {
    public static void main(String[] args) {
        char letter = 'B'; 

        System.out.println(letter);
    }
}

//Boolean

// Another important type is boolean. It can hold only the values true or false. This is handy when we work with states or conditions, for example:
class Demo {
    public static void main(String[] args) {
        boolean isOpen = false; 

        System.out.println(isOpen);
    }
}

// For example, the boolean above can show whether a shop is open or closed.

// chapter 7 Finished.

// chapter 8:
// PRACTICE EXERCISE
// Displaying Account Balance

// The given program declares a label and a balance variable, and assigns it to their values. Then, it outputs the label and the balance values. However, the code is missing the required types of the variables

// Task: Add the required types to make the program work as expected.

public class Program {
    public static void main(String[] args) {
        label = "Balance";
        balance = 599.84;

        System.out.println(label);
        System.out.println(balance);
    }
}

// my solution
public class Program {
    public static void main(String[] args) {
       String label = "Balance";
        double balance = 599.84;

        System.out.println(label);
        System.out.println(balance);
    }
}