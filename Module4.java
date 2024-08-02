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

// chapter 3:

// Method parameters
// Methods can have parameters that can be used in their code.
// Parameters are defined in parentheses and can act as variables in a method.
// For example, let's add a String parameter called name to our welcome() function:

static void welcome(String name) {
  System.out.println("Welcome, " + name);
}

// The above method takes a String called name as its parameter, which is used in the method.
//Now, when calling the method, we need to pass it a value for the <b>name </b>parameter inside the parentheses:

class Demo {
    static void welcome(String name) { 
        System.out.println("Welcome, "+name);
    }
    public static void main(String[] args) {
        welcome("James");
        welcome("Amy");
    }
}

//This way, we can call our method with different parameters and generate different results based on them.
//The values passed as parameters are called arguments.

//Methods can take multiple parameters. For that, we simply need to separate them using commas, for example:
static void welcome(String name, int age) {
  System.out.println("Welcome, "+name);
  System.out.println("Your age: "+age);
}

// Now, our <b>welcome</b>() method takes a String and an integer as its parameters.
//Now, when calling the function, we need to provide all the parameters:

class Demo {
    static void welcome(String name, int age) {
        System.out.println("Welcome, "+name);
        System.out.println("Your age: "+age);
    }
    public static void main(String[] args) {
        welcome("James", 42);
        welcome("Amy", 25);
    }
}

//Note that the arguments need to match the parameters and must be passed in the same order.

// Method Parameters
// Method parameters are really handy! They allow our method to work with different values and produce results.
// For example, we can create a method to calculate a given percentage of a number and output it:

class Demo {
    static void perc(double num, int percentage) {
        double res = num*percentage/100;
        System.out.println(res);
    }
    public static void main(String[] args) {
        perc(530, 23);
    }
}

// chapter 3 Finished.