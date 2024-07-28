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