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


