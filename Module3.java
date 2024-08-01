//chapter 1:
// Arrays

// Imagine a program that needs to store the ages of 10 users.With variables, you would need to create 10 separate variables for each of the users. That would be really not effective and repetitive.
// Arrays can help in these situations! An array stores multiple values in a single variable.

// An array needs to be declared, just like a variable, with the type of the items it will hold.
// To declare an array, you need to define the type of the elements with square brackets.

int[ ] ages;
//The name of the array is <b>ages</b>. The type of elements it will hold is <b>int</b>.

//Now, to create the array, we need to specify the number of items it will hold using the <b>new </b>keyword:
int[ ] ages;
ages = new int[5];

// We can combine the above code into one line:
int[] ages = new int[5];

//The items in an array are accessed using their position, also called their index.
// Here is an example, setting the item with the index 2 to the value 25:

ages[2] = 25;

//The index is specified in square brackets, next to the array name.
//The item with index 2 is actually the 3rd item of the array. That's because array indexes start from 0, meaning that the first element's index is 0 rather than one. So, the maximum index of the array int[5] is 4.
// Let's set the first items value:

ages[0] = 18;

//Similar to setting values, we can also access values of the array, using square brackets and the index of the item we want to access:

public class Demo {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 18;
        ages[2] = 25;
        System.out.println(ages[2]);
    }
}

//This will output the value of the 3rd item.

//If you already know what values to store in the array, instead of assigning them one by one, you can use the following syntax:

public class Demo {
    public static void main(String[] args) {
        String[ ] names = { "A", "B", "C", "D"};
        System.out.println(names[2]);
	}
}

//Place the values in a comma-separated list, enclosed in curly braces.The code above automatically creates an array containing 4 items, and stores the provided values.

//Note : Sometimes you might see the square brackets placed after the array name, which also works, but the preferred way is to place the brackets after the array's data type.

// chapter 1 Finished.

//chapter 2:
// PRACTICE EXERCISE
// Vending Machine

// You are making a program for a vending machine that provides drinks. The menu of the drinks is stored in an array called menu:

String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"}; 

//Take the choice of the customer as an integer from input and output the corresponding menu item.Also, check for errors: in case the input is out of the range of the array, output "Invalid".

//The choice defines the index of the array.

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        
    }

}

//my Solution:
import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        if( input >=0 && input<=4){
           System.out.println(menu[input]);
        } else {
          System.out.println("Invalid");
        }
        
    }

}

// chapter 2 Finished.

//chapter 3:
// Arrays

// Let's learn how to output the items of an array using a loop.To use a loop, we first need to find out how many items the array stores.For that, the array has a <b>length </b>property, which is accessed like this:

public class Demo {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        System.out.println(ages.length);
	}
}

//This will output the number of items stored in the array.

//Now, when we know the number of items, we can use a <b>for </b>loop and output all the items of the array:
public class Demo {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};

        for(int x=0;x<ages.length;x++) {
            System.out.println(ages[x]);
        }
	}
}

//We used the <b>x</b> variable of the loop as the index for our array. During each iteration of the loop, the next item of the array is accessed.

//We can also use a for loop to make calculations using array values. For example, let's calculate the sum of all values in an array:
public class Demo {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x=0;x<ages.length;x++) {
            sum += ages[x];
        }
        System.out.println(sum);
    }
}

//In the code above, we declared a variable <b>sum </b>to store the result and assigned it 0. Then we used a <b>for </b>loop to iterate through the array, and added each item's value to the variable.

//for-each Loop
// Java provides another version of the <b>for </b>loop, called the for-each loop, to loop over arrays, making the code shorter and easier to read.
// Here it is:

public class Demo {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7};

        for (int x: nums) {
            System.out.println(x);
        }
    }
}

//The loop creates a variable, which automatically is assigned to each value of the array during the loop. You can call the variable anything you want: we called it <b>x</b> in our example.
//Notice the colon after the variable - it reads as "for each x in nums".

//Let's use a for-each loop to calculate the sum of all values of an array:

public class Demo {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for(int x: ages) {
            sum += x;
        }
        System.out.println(sum); 
    }
}
//Note, that in this case we do not have the index, we have the value of each item of the array.

//chapter 3 Finished.

//chapter 4:
// PRACTICE EXERCISE
// Annual Revenue

// The given code declares an array that holds the monthly revenues for a company for a year.
// You need to calculate the average monthly revenue for the year.
// For that, calculate the sum of the revenue for all the months and divide it by the number of items in the array.
// You can find the number of items in the array using the <b>length </b>property. As the array is of type <b>double</b>, output the result as a double.

public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
       
    }
}

// My Solution:

public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        double items = revenue.length;
        double sum = 0;

        for(double x: revenue){
            sum += x;
        }
        System.out.println(sum/items);
    }
}

//chapter 4 Finished.
