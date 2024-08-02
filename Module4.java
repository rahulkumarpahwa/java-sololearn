//chapter 1:
// Methods
// A method is a block of code designed to perform a particular task.
// For example, our app can have methods like <b>login()</b>, <b>logout()</b>, <b>convert()</b>, etc.
// The <b>println()</b> that we use for output is also a method.

//The purpose of a method is to create it once and call it multiple times when needed to perform particular tasks.

// You can define your own methods to perform your desired tasks. Here is an example:

static void welcome() {
  System.out.println("Welcome");
  System.out.println("I am a method");
  System.out.println("End of method");
}

// The code above declares a method called <b>welcome</b>, which prints 3 lines of text. 
// Note that the name of the method is followed by parentheses (). The statements of the method are inside curly braces.

//Let's look at the code again:
static void welcome() {
  System.out.println("Welcome");
  System.out.println("I am a method");
  System.out.println("End of method");
}

// note:
// <b>static </b>is needed to be able to use the method in <b>main</b>. You will learn about the static keyword in more advanced lessons.<b>void </b>means that this method does not have a return value. You will learn more about return values later in this module. <b>welcome </b>is the name of the method.

// Calling a Method

// After defining the method, we can use it in our program by "calling" it. To call a method, type its name followed by a set of parentheses.For example:

public class Demo {
    static void welcome() { 
        System.out.println("Welcome"); 
        System.out.println("I am a method"); 
        System.out.println("End of method"); 
    }
    public static void main(String[] args) {
        welcome();
    }
}

// OUTPUT

// Welcome
// I am a method
// End of method

// You can call a method as many times as necessary.Example: 

class Demo {
    static void welcome() { 
        System.out.println("Welcome"); 
        System.out.println("I am a method"); 
        System.out.println("End of method"); 
    }
    public static void main(String[] args) {
        welcome();
        //some code
        welcome();
        welcome();
    }
}

// chapter 1 Finished.

// chapter 2:
// PRACTICE EXERCISE
// Bot
// You are making an automated response program for a store.
// The bot should take a number from the user as input and reply with an automated message.
// There are currently 3 responses, that you need to a handle:
// User message: "1", Reply: "Order confirmed"
// User message: "2", Reply: "info@sololearn.com"
// For any other number, the reply should be: "Try again".
// The given code calls a method called bot(). Define the method, which should take an integer input from the user, and handle the above mentioned cases, by outputting the corresponding reply.
// Do not change the method call in <b>main</b>().

import java.util.Scanner;

public class Program {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    public static void main(String[] args) {
        bot();
    }
}

// my solution:
import java.util.Scanner;

public class Program { 

    static void bot(){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt(); 

    if(input == 1){
        System.out.println("Order confirmed");
    } else if (input == 2){
        System.out.println("info@sololearn.com");
    } else {
        System.out.println("Try again");
    }

    }
    public static void main(String[] args) {
        bot();
    }
}

// chapter 2 Finished.