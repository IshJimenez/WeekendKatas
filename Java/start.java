package examples;

public class MyFirstRobot {

    public static void message(String myString, int myInt) {
        System.out.println("This is my String: " + myString);
        System.out.println("and this is my int: " + myInt);
    }

    public static void main(String[] args) {
        message("Hey Fool!!!", 4)
    }
}

The first line in this class is the word package, which is a reserved word, or keyword.

That means that package had a defined use and acts as an instruction for the JVM.

Packages would be similar to folders and subfolders

A class in one package might not be able to access or be accessed by classes in other packages.

The second line is the class declaration.

It consists of an access modifier followed by the reserved word class, then the name of the class, and finally the curly
braces that wrap around the contents of the class.

Access modifiers for a class determine what other classes can access the code contrained in this class for their own use.

They can be public, or left blank meaning default.

When naming classes its conisdered a best practice to use nouns, and they are always written by 
capitalizing the first letter of each word in the name.

The curly braces indicate a change in scope.

As a general rule, code wirtten in a lower or deeper scope is isolated from code in a higher or shallower scope.

In addition to mandatory curly braces, nested scopes are indented for easier understanding.

The curly braces also group code into structures. In this example the class contains all the code between the curly braces 
that start immediately after the class declaration.

Next is the first method called message()

A method is a set of instructions that may or may not take in some values, and may or may not return some value.

The instructions a method contains can be invoked by just calling the methods name, and so this reudces the amount of code you have
to wirte by allowing you to reuse it over and over.

Methods can be 

public
private
protected
left blank

The next term is the return type for the the method and void indiciates that the method returns no values.

The method title, message, is followed by paranthesis that contain the input parameters.

In the example above we have a String and an integer.

Lastly the method body lies between the curly braces.

This is the location for the statements to be executed when message is called. 

All the method will do is print two phrases to the console.

Every Java program that you execute must contain one class with a main method in it only if you want the code to be executable.

This is where JWM will begin to run your code.

The signature for the main method must be public static void main() with a String array passed in as the input parameter.

Public indidcates the method is visible to the world. 

Static is a scope keyword that emans the method exists before an object of the class is instatiated.

Static means the method belonds to the class NOT the object.

It is globaly visible to all instances of the class.

The main method is static because the JV< needs to be able to access the method without creating an instance of the class 
that contains it.

That would require another class and method in which it would do so and another for instantiating that class, etc.

Void is the return type for this method and means that nothing is returned.

The code in the method will execute, and then the execution continues to the next line ater the method was invoked.

The main() method never returns anything, because when its execution finished the program is done.

In the example above class called MyFirstRobot having a main method.

The main method in this class tells the JVM to begin here.

Then the method named message() is invoked, and two things are passed-in: an integer, and a String.

Looking at the method delcaration, we know that the message() method requires these paramters in this order.

THen the main() method ends, and the program is done.

-
-
-
-
VARIABLES..
-
-
-
-

Temporarilly store data in RAM

Strongly typed each variable can only hold one type of data 

Java variable types come in 2 types

PRIMITIVE - Store data types as btyes like intergers, decimals, and alphanumeric characters

The range of values of a primitive can store is limited by the amount of memory reserved for the type.

There are 8 primitive data types in Java.

All primitive data types are lower-case and they contain by default the lowest value they can contain which would be a 
0 for numbers, false for boolean, and the null character for chars.

A boolean variable only holds a value T or F and so it only requires 1 bit of memory ultimately it stores a 0 or a 1.
False is not the same as 0

Java doesnt support truthly values where an integer 0 is the same as a boolean false.

A byte holds a 2 compliment integer, and true to its name it requires 8 bits(1 byte) of memory.

A 8 bit two compliment number can range from -128 too 127.

A short is a 16 bits(2 bytes) comoliment integer, and it ranges from -2^15 to 2^15-1.

A char is is a 16 bits(2 bytes) data type that holds a single Unicode character.

Character values sit between single quotes, and you can either type the character directly or use forward-slash-'u' followed by the characters 
4 digit code.

'\u0000' to '\uffff'

An init is a 32 bits(4 bytes) integer, and its probably going to be the most common integer data type.

An init can range from -2^31 to 2^31.

A float is a 32 bits floating point number which means it can store decimal values.

However because of the way floating point math works on computers, a 32 bit floating number is not as precise as a the double type.

A number can be specified as a float by following it with an 'f'

0.15f or scientific notation 1.25e4f

A float value can also incorporte e to represent a number in scientific notation.

Long is a 64-bits(4 bytes) integer, and their values can range from -2^63 to 2^63 - 1

To speicify a number as a long value instead of an init, you can follow it with a capital L.

500L

The last primitive data type is the double-precision floating point, called "double" for short.

A double is a 64 bit floating point number, and they can be differentiated from a float value by following the number with a 'd'.

Typically this will be the default decimal datatype you use.

Reference variables on the other hand, use a class name as their type.

The reference variable can then only point to an objject that is an instance of that class.

You can use the dot operator to access the variables or methods in the object being referenced.

This does NOT mean that the reference variable is the object and this distinction becomes very important to understanding Java.

Reference variables point to an object and they are not the object themselves.

REFERENCE - Store memory addresses where Objects are located, and are strongly typed too.

int x = 3;
MyClass reference = new MyClass();

The assignment operator works right to left, whatever exists on the right side of the equal side is worked through 
and stored in the variable on the left side.

In Java x = 3, not 3 = x

-
-
-
-
ARRAYS..
-
-
-
-


A collection of promitive values or object references

Values in an array are organized wit an index

Arrays have a fixed size and data type

A speicific amount of memory is reserved for an array based on the size and data type

Instatiating a size-10 int array with "new":
int[] intArray = new int [10];

Instatntiating a size-3 array with {}
int[] intArray = {2, 4, 6};

System.out.println(intArray[2]);
intArray[5] = 12;
System.out.println(intArray.length);

Multidimensional Arrays

Creating a multidimensional Arrays
int[] [] myArray = new init [3] [2];
int[] [] otherArr = { {1,2}, {2,4}, {3,6}};

Referencing the value at 2,1:
System.out.println(otherArr [2] [1]);

package examples2;

public class ArrayRobot {

    public static void main(String[] args) {

        int[] firstArray = new init [3];
        int[] secondArray = {1,2,3};

        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;

        System.out.println("This value of firstArray[1] is " + firstArray[1]);
        System.out.println("The length of the secondArray is  " + secondArray.length);
    }
}

If you know the values you want inside of the array, you can plug those values into the creation by using the curly braces.

Accesing a value in a array is as simple as referring to the index location of that value.

You can also access the length property of an array by using the dot operator.

When a varible is declared in a particular scope, it is visible to all lower level scopes, but not any higher level scopes.

A variable declared in the class scope, after the class delcaration but outside of any methods is called an instance variable.

Each instance of the class will have a copy of that variablem with a value unique to each instance.

public class Dog {
    String furColor;
}

Here every dog object will have a furColor variable, but one Dog object might have red fur, while another has white.

If a variable also has the keyword static, it becomes a class variable, or glaobal variable.

That means that every object of that class will share the same value for that variable, and if you change it in one Object
it is changed for all of them.

If a variable is declared inside a method, its called a local variable.

A local variable doesnt exist outside the method in which it is declared.

When the method is done executing, the variable is deleted from memory.

Java brings the use of strong typing, the selection of data types available, and the amount of memory reserved by each.

-
-
-
OPERATORS..
-
-
-
-

-Parenthesis

Work just like they normally do in math. You compute the value of whats inside parenthensis before outside.

-Postfix Operators

++ and -- They add/sub 1 from the expression provided.

x++ same as x = x + 1

-- and ++ can be added before the expression.

The diff between postfix operator and these prefix operators

a++ will evaluate the expression after it is done

++a evaluates before it.

int c = 8;
System.out.println(++c);
That will print 9 to the console.

c++
Would print out 8 then increase the value after printing

-Multiplicative Operators 
% Modulus, /, *

Modulus returns the remainder of a division result.

Bytes, Shorts, Ints and Longs in Java only store whole numbers, which means that when division occur, you get a result
and a remainder.

Non floating point variables use whole numbers, and divide with remainders instead of decimals.

When dividing with / you get the resuly of integer division. If you use the % you get the remainder instead.

5 / 2 == 2
5 % 2 == 1

-Additive Operators
+, -

-Bit-Shift Operators
<< :Left-Shift
>> :Right-Shift
// >>> :Right shift (ignore sign) -----(Made the font white so commented it out...)

-Modifiy the binary representation of numbers

int a = 4;      // 00000011 == 3
a = a << 2;     // 00001100 == 12

Work on the binary value of a primitive types value.

These shift the digits of the binary representation of a value left or right a certain number of spaces, resulting
in a different value.

-Relational Operators

Compare two values to produce a boolean result
<, >, <==, >==, instanceof

instanceof: Determines if an object is an instance of a particular class

== equal To
!= not equal to
= assignment 

-Bitwise Operators
Used to manipulate the binary representation of values.

&   :bitwise AND
^   :bitwise XOR
|   :bitwise OR

Logical Operators

&& :logical AND || :logical OR
These operators join two other boolean expressions to produce a new boolean result.

-Ternary Operators
Make a quick if-Then statement (no else clause) expression_1 ? expression_2 : expression_3

The first expression must be a boolean expression and is followed by a ?

If the boolean expression is T the second statement will execute.

If the first expression is F, the third statement will execute.

int a = 3;
int b = 0
(a < 4) ? (b = 1) : (b = 2);
//prints "1"
System.out.println(b)

===
-Assignment Operators 
===

The operator with the lowest precedence is of course the assignment operator, are the arithmetic-assignment combo operators.


Arthmetic-assignment
+=, -=, /=, %=, &=, ^=, |=, <<=, >>>=

These operators are the same as applying an expression on the right side of the assignment operator to the variable on the left, and
storing the result back into the same variable.

d += 3 same as d = d + 3

Write a class named a1 in which you print the message “Hey, fool!” to the console

package program;

public class a1 {
		
	public static void main(String[] args) {
		System.out.println("Hey, Fool");
	}

}

Write a class named a2 in which you declare a variable, x. In the next line, set the value of x to
10. Print the value of x to the console.

package program;

public class a2 {
	public static void main(String[] args) {
		int x;
		x = 10;
		System.out.println(x);
}
}

Write a class named a3 in which you declare the variables, x and y. Set the value of x to 15 and
set the value of y to 10. Create a third variable, z and assign the result of the sum of x and y to z. Print the
value of z to the console.

package program;

public class a3 {
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		x = 15;
		y = 10;
		z = x + y;
		System.out.println(z);
}
}

Write a class named a4 in which you declare an array of 5 numbers. Print its length to the
console. (Use the .length property)

package program;

public class a4 {
	public static void main(String[] args) {
	int[] intArray = new int [5];
	System.out.println(intArray.length);
}
}

Write a class named a5 in which you declare an array of ten strings. Print the 2nd element.
(Remember that arrays indexes start at 0, not 1).

package program;

public class a5 {
	public static void main(String[] args) {
		String[] strArray = new String[10];
		 System.out.print(strArray[1]);
	}
}

Write a class named a6 that declares an array of two numbers (10 and 11). Add the two
numbers together and print the result.

package program;

public class a6 {
	public static void main(String[] args) {
		int[] array = {10, 11};
        int sum = 0;
        for ( int num : array) {
            sum = sum + num
        }

        System.out.println(sum);
	}
}

Write a class named a7 that declares an array of three numbers (8, 22, 34). Subtract the first
two and add the third; (8- 22 + 34). Print the result.

package program;

public class a7 {
	public static void main(String[] args) {
		int[] array = {8, 22, 34};
        int sum = array[0] - array[1] + array[2];

        System.out.println(sum);
	}
}

Write a class named a8, that declares two floats (105.678 and 222.4871). Multiply them and print
the result.

package program;

public class a8 {
	public static void main(String[] args) {

		float first = 105.678f;
        float second = 222.4871f;

        float product = first * second;

        System.out.println(product);
	}
}

Write a class named a9 that declares a boolean variable on. Set its value to true. Print the result.

package program;

public class a9 {
	public static void main(String[] args) {

    boolean xe = true;
    if (xe == true) {
          System.out.println("true");
}
}
}

Write a class named a10 that declares an array of five strings. Print the 5th element

package program;

public class a10 {
	public static void main(String[] args) {

    String[] superr = {"Batman","Superman","Ironman","WonderW","Spiderman"};
    System.out.println(superr[4]);

    }
}

-
-
-
-
STATEMENTS..
-
-
-
-
There are two types of statemnets in Java.

----Expression statemnets

Expression statments are made from expressions, which compute values and most likey use operators.

Statemnts can be grouped into blocks with the {} operators.

An expression in Java computes a value.

Variable declarations are expressions, either by being assigned a value or implicitly assigned a default value.

"int s"

s is an expression as is "s = 99" part of int s = 99

An expression could also be a method invocation that returns a result, a mathematical equation, or any combination.

All that matters is that a value be returned.

THe type of data returned by an expression depends on the types of elements used there in.

F = 8 returns an int, because the assignment operator returns the same type of data to the left side (f) that is used on the right side.

H > 1 will return a boolean result, because the //> operator returns a boolean result. (made text white >)

Method invocation are also statemnts, as are object creation statments that use the "new" keyword. 

A block is a grouping of zero or more statments between moustaches {}

You can use a bllock anywhere a single statment is allowed.

----Control statemnets

Can be further divided into decision statements and loop statments.

A decision statement, just like the name implies, forces the program to make a "decision" regarding which code to execute next.

Its sometimes referred to as a "conditional branch" in the program flow.

--Decision statments are used to check if a particular confition has been met and then take appropriate action based on he outcome.

Is "w" to 2 ? 
Is the user first name "Bob" 

Check if particular condition has been met and take the appropiate outcome.

--Loop Sraner

package examp;

public class IfElseExamp {

	public static void main(String[] args) {

        int y = 4;

        if ( y % 2 == 0)
        System.out.println("Num " + y + " is even");
        else
        System.out.println("Num " + y + " is not even");

    }
}

Switch statments

Evaluates a single expression to take action based on the value.

bytes, short, int, char, and Strings are all viable types for switch statements.

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

Execution can fall through a case if there is no break statment.

If no cases are met the default will run.

Loop Statments 

Executes a statement or block of statements repeatedly until a condition is met.

Java has the for, while, and do-while loop

-for

Runs x amount of times 

for (intialization, termination, increment) statement

class forLoopDemo {
    public static void main(String args[]){
        for (int x = 2; x <= 4; x++)
            System.out.println("Value of x:" + x);
    }
    System.out.println("Exited loop");
}
}

After loop concludes the variable x is out of scope.

Complier will not allow you do nothing anything else with it.

-While Loop

int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

-Do while
While run at least once

int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);

-Break Statements

Can be used in any control flow statment
Cause the program to exit the current block, ending any loop or condition statement

-Continue Statement 

Terminates the current iteration of a loop

1.	Write a class named B1 which uses a conditional statement to check if a number is even. 

package program2;

public class B1 {
	public static void main(String args[]){
		
		int y = 4;

        if ( y % 2 == 0)
        System.out.println("Num " + y + " is even");
}
}

2.	Write a class named B2 which creates an integer variable x. Set x to some value. 
Then write a conditional statement that checks if x is greater than 3. If so, print the message, “x is greater than 3” to the console. 

package program2;

public class B2 {
	public static void main(String args[]){
		
		int x = 4;

        if ( x > 3)
        System.out.println("x is greater than 3");
}
}

3.	Write a class named B3 which creates an integer variable x. Set x to some value. 
Then write a conditional statement that checks if x is greater than or equal 3. 
If so, print the message, “x is greater than or equal 3” to the console. 

package program2;

public class B3 {
	public static void main(String args[]){
		
		int x = 4;

        if ( x >= 3)
        System.out.println("x is greater than or equal 3");
}
}

4.	Write a class named B4 which creates an integer variable x. Set x to some value. 
Then write a conditional statement that checks if x is equal to 3. If so, print the message, “x is equal to 3” to the console. 
Write an associate else-statement that prints the message “x is NOT equal to 3” to the console.

package program2;

public class B4 {
	public static void main(String args[]){
		
		int x = 4;

        if ( x == 3)
        System.out.println("x is equal to 3");
        else 
         System.out.println("x is NOT equal to 3");
}
}

5.	Write a class named B5 which creates a float variable x. Set x to some value. 
Then write an if-statement that checks if x is equal to 3. If so, print the message, “x is equal to 3”. 
Write an else-if statement to check if x is greater than 5, and, if so, prints the message, “x is greater than 5”. 
Write another else-if statement to check if x is less than or equal to 0. 
If so, it prints the message, “x is less than or equal to 0”. 
Write an else-statement to prints the message, “x is none of the other options”. 

package program2;

public class B5 {
	public static void main(String args[]){
		
		int x = 4;

        if ( x == 3)
        System.out.println("x is equal to 3");
        else if ( x <= 0)
        System.out.println("x is less than or equal to 0");
        else
        System.out.println("x is none of the other options");
}
}

6.	Write a class named B6 which uses a for-loop to print only the even numbers between 0 and 10, inclusive. 

package program2;

public class B6 {
	public static void main(String args[]){
		
for ( int i = 0; i <= 10; i++) {
	if ( i % 2 == 0 ) {
        System.out.println(i);
}
}
}
}

7.	Write a class named B7 which uses a do-while loop to print only the odd number between 1 and 9, inclusive.

package program2;

public class B7 {
	public static void main(String args[]){
		
int i = 0;
    do {
    if(i%2 == 1)
    System.out.println(i);
    i++;
}
    while (i < 10);
}
}

8.	Write a class named B8 which uses a while loop to print the statement “In loop” 7 times.

package program2;

public class B8 {
	public static void main(String args[]){
		
	int i = 0;
    while (i < 7) {
	System.out.println("In Loop");
	i++;
}
}
}

9.	Write a class named B9 that uses a for-loop to navigate through an array of 10 double numbers and prints each element of the array. 

package program2;

public class B9 {
	public static void main(String args[]){
	int[] fun = { 10, 19, 18, 11, 34, 45, 23, 33, 22, 26};
	for (int i = 0; i < fun.length; i++)
	{
	    System.out.println(  fun[i] );
	}
}
}

10.	Write a class named B10 that uses a double for-loop (a for-loop within a for-loop). 
The outer loop should navigate through an integer array that has 10 elements corresponding to the numbers 1 through 10, inclusive. 
The inner loop should count from 1 to 10, and prints the value of the current count multiplied by a the current index of the array. 
You should end up printing the multiples of 1 through 10 from 1 to 10. Ex: 1*1, 1*2, 1*3…1*10, 2*1, 2*2, 2*3…10*9, 10*10.

package program2;

public class B10 {

	public static void main(String[] args) {
		double[] a = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}

-
-
-
-
Strings
-
-
-
-

Reference variables in Java are not an object on its own right, its a link to an instance of an object in memory.

When a string object is created, either in the primitive style or as a new object, a String object is created in memory that holds the
value we assign to it.

Strings are immutable, so if we try to change the value of the string in our reference variable, the JVM actually creataes a new String object, 
and redirects our reference.

If I have two strings that equal the same value the JMV decides that its safe for these 2 variables to share same instance and they will both be 
directed to the same object in memory.

If you used

two = new string ("Hello");

Will force the JVM to have duplicate Strings in memory.

Nowhere in Java but with Strings can you create an object of a class without using the "new" operator.

Using the primitive approach we have the following line of code.

package examp;

public class StringTest {

	public static void main(String[] args) {
		
        String stringA = "Hello";
        String stringB = new String("Hello");

			System.out.println("string A" + stringA);
            System.out.println("string B" + stringB);

            if (stringA == stringB)
            System.out.println("string A and string B point to same object");
            else
             System.out.println("string A and string B dont point to same object");
		}
	}

String is an object not a primitive

Java creates the "Hello" object in memory using a simple assignment.

For the 2nd line we have passed the desired string as a constructor argument.

They both have the same value but not the same object.

1.Write a class named C1 that declares two strings, “James” and (your name) and concatenates
them together. Print the result

package program3;

public class C1 {
	public static void main(String[] args) {
	
	String stringA = "James";
    String stringB = new String("Bond");

		System.out.println(stringA  + " " + stringB);
}
}

2.Write a class named C2 that uses a 2 if-statement to compare the strings “abc” and “ABC”.
The first if-statement should use the double equals (==) operator and the other that uses the .equals()
method of one of the strings to compare to the other. Print a message in both if-statements to indicate
that the strings are equal

package program3;

public class C3 {
	
	public static void main(String[] args) {
		String one = "abc";
		String two = "ABC";
		
		if (one == two) {
			System.out.println("The strings are equal using (==) ");
		}
		
		if (one.equals(two)){
			System.out.println("The strings are equal using (.equals)");
		}
	}
}

3.Write a class named C3 that declares 2 strings “abc” and “abc”. The first should use the
string literal syntax and the other should use the new keyword. Write a comparison operator that prints
a message if they are equal or otherwise. (Use an if/else-statement)

package program3;

public class C3 {
	
	public static void main(String[] args) {
		String one = "abc";
		String two = new String("abc");
		
		if (one == two){
			System.out.println("The strings are equivalent");
		} else {
			System.out.println("The strings are NOT equivalent");
		}
	}
}

4.Write a class named C4 that declares a string "abcdefghijklmnopqrstuvwxyz". Use the
indexOf() method to print the index of "s" and "f".

package program3;

public class C4 {
	
	public static void main(String[] args) {
		String onet = "abcdefghijklmnopqrstuvwxyz";
	
			System.out.println(onet.indexOf('s', 0));
			System.out.println(onet.indexOf('f', 0));
		}
	}

5.Write a class named C5 that uses the substring() method to print the last 5 characters of
"Hello My Name is Java".

package program3;

public class C5 {
	
	public static void main(String[] args) {
		String onett = "Hello My Name is Java";
	
			System.out.println(onett.substring(15));
		}
	}

6.Write a class named C6 that finds the index of the 2nd space character in "Hello My Name is
Java"; Print this number. (Hint: you may have to combine two String methods)

package program3;

public class C6 {
	public static void main(String[] args) {
		String str = "Hello My Name is Java";
		
		int index = str.indexOf(" ", str.indexOf(" ") + 1);
		
		System.out.println("The second space is at: " + index);
}
}

7.Write a class named Assignment7 that declares the string "http://example.com?
// access_token=EFEc8328h29jndjd02h12$3829&ds98d". Print only the token from the string (the part
AFTER the “=”. (Hint: Use the substring() method)

package program3;

public class C7 {
	
	public static void main(String[] args) {
		String onettt = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
	
			System.out.println(onettt.substring(32));
		}
	}

8. Write a class named C8 that checks if two strings are anagrams. Recall that an anagram is
a word that can be formed by rearranging the letters of another. For example, angel is an anagram of
angle and glean. (Hint You will have to use the string methods that you are familiar with along with one
or more loops)

package program3;

public class C8 {

public static void main(String[] args) {
		String one = "";
		String two = "";
		
		
		//check if strings are exactly the same
		if (one.equals(two)) {
			System.out.println("The strings are equal and not anagrams");
		}
		if (one.length() != two.length()){
			System.out.println("The strings are different lengths");
		}
		
		
		int[] map = new int[one.length()];
		//initialize array to -1 values
		for (int i = 0; i < map.length; i++){
			map[i] = -1;
		}
		
		//loop through letters of 1st and check if they are in the 2nd
		for (int i = 0; i < one.length(); i++){
			char c = one.charAt(i);
			
			int index = two.indexOf(c);
			
			//if index is -1 the letter is not in the first
			if (index == -1){
				System.out.println("The strings are not anagrams");
				System.exit(0);
			}
			
			//loop through array if present, if so, update by one and try again
			for (int j = 0; j < map.length; j++){
				
				//check if duplicate letter
				if (map[j] == index){
					index = two.indexOf(c, index + 1);
					
					
					
					if (index == -1){
						System.out.println("the strings are not anagrams");
						System.exit(0);
					}
					
					continue;
				}
				
				
			}
			
			//store current index in map
			map[i] = index;
		}
		
		System.out.println("The strings are anagrams!");
	}
}

-
-
-
-
CLASSES
-
-
-
-
A class is a astrcture that can have states and behaviors. 

It serves as a template for objects, which are instances of a class with a specific state.

A Wizard class might have a state consisting of many possible properties such as size, weight, power, spellRange..etc

The Wizard class would be a blueprint for specific wizards. 

Gandalf would have his unique behaviors but he would share common behaviors with other Wizards.

=
Access Modifiers
=

Keywords that control the ability for outside code to access or change the states and behaviors of a class.

Java has four access modifiers public, private, protected and default(If no other access modifier is declared)

For fields, methods, and constructors any of these modifiers may be used.

However only "public" and "default" make sense for classes.

AM control how access to data is shared between class and other classes in the same package, other packages, and child or subclasses.

Public can be accessed or modified by any other class in the application, no mater if its in the same package, or another.

Protected data can be used by any class in the same package, or any sublcasses even if they are in another package.

Default will be accessible by any class or sublcass in the same package, butinvisible to code oustide of the package.

Private data is only accesible within the same class it is declared. It cant even be used by subclasses.

If you want to manipulate, its best to do that by making the data in a class private, and creating simple methods called accessor/getters and 
mutator/setters methods.

An accessor/getter method just returns the value of a variable stored in an object.

A setter method allows the user to change the value.

package example;

public class Wizards {
	
	private int maxRange;
	
	public int getMaxRange(){
		return maxRange;
	}
	
	public void setMaxRange(int maxRange) {
		if (maxRange >= 0)
		this.maxRange = maxRange;
		else
		this.maxRange = 0;
	}
	public void start(){
		System.out.println("The wizard has this " + maxRange + " range.");
	}
}

Start method is public and for now simply reports back the maxRange.

package examples;

public class WizardTest {
	public static void main(String[] args) {
		
		wizard myWizard = new Wizard();

		myWizard.start()
}
}

The new tells the JVM to create a new instance of Robot, and calls the constructor method to initialize the object.

By assigning a reference type variavle to this new instance we create a link to it that we can use to call its methods.

A constructor is used to create an object of a class and set its initial state.

Once we have the object we can use the fields and methods which were defined in the class.

A constructor has the same name as the class and no return type.

All classes have at least one constructor if you dont wirte one JVM will assign a default constructor.

The default constructor will take no arguments, and doesnt set any values.

A class can have many constructors all with the same name, but must be differentiated by the number or type of parameters they accept.

That would be method overloading.

package example;

public class Wizards {
	
	private int maxRange;

	////////////////////////////
	//        Adding constructor
	////////////////////////////

	public Wizard() {
		this.maxRange = 1 
	}
	
	public int getMaxRange(){
		return maxRange;
	}
	
	public void setMaxRange(int maxRange) {
		if (maxRange >= 0)
		this.maxRange = maxRange;
		else
		this.maxRange = 0;
	}
	public void start(){
		System.out.println("The wizard has this " + maxRange + " range.");
	}
}

This is used and the dot operator to refer to the objects instance variable maxRange, to differentiate it from the passed-in variable maxRange.

Java classes follow OOP principles and have both state and behaviors

The new keyword followed by a constructor call creates an object of that class in memory.

With an object in hand, a calling program can make use of that objects fields and methods.

Those methods and constructors can be overloaded.

By having multiple methods that share the same name, but accept a different number or types of parameters.

1. Write a class named Person. The person class should define a name (String) and age (int) instance
variables. Write another class, Application, in which you instantiate a new Person object. Set the person’s
age and name properties. Print the age and name properties of the created person. 

package program4;

public class Person {
	
	String name;
	int age;
		
}

package program4;

public class Application {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 22;
		p.name = "Firstname";
		System.out.println("Name: " + p.name + ", Age: " + p.age);
	}
}

2. Write a class named PrivatePerson. Declare instance variables name (String) and age (int) and mark them
private. Write getter and setter methods to access these properties. In a Main class, create a new instance
of Person and print its properties name and age. Place these files in a package named, “program4b”.

package program4b;

public class PrivatePerson {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

package program4b;

public class Application2 {

	public static void main(String[] args) {
		PrivatePerson pp = new PrivatePerson();
		pp.setAge(20);
		pp.setName("Firstname");
		
		System.out.println("Name: " + pp.getName() + ", Age: " + pp.getAge());
	}
}

3.Write a class named TalkablePerson that declares a public talk() method along with name (String) and age
(int) properties. The talk() method should have a void return type and print the message, “Hello my name is:
{name}”. Instead of {name} the person’s name property should be printed. In a Main class, create an
instance of Person and use their talk method. Place these files in a package named, “program4c”.

package program4c;

public class Application3 {
	public static void main(String[] args) {
		TalkablePerson tp = new TalkablePerson("Bond", 18);
		tp.talk();
	}
}

package program4c;

public class TalkablePerson {
	
	String name;
	int age;
	
	public TalkablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public void talk(){
		System.out.println("Hello my name is " + this.name );
	}
}

Extra Practice 

package program4d;

public class wizard {
	public static void main(String[] args) {
		power wi = new power("Merlin", 9000);
		wi.org();
	}
}

package program4d;

public class power {
	
	String name;
	int powerr;
	
	public power(String name, int powerr) {
	super();
	this.name = name;
	this.powerr = powerr;
	}
	
	public void org() {
		System.out.println("His power level is over" + " " + this.powerr );
	}
}

4.Write a class named ConstructorPerson that declares name (String) and age (int) instance variables. Write
a no-arg constructor1 that initializes ConstructorPerson with default values. In a Main class, create an
instance of a ConstructorPerson and print its properties name and age. 

package program4e;

public class ConstructorPerson {
	
	String name;
	int age;
	
	public ConstructorPerson() {
		this.name = "Bond";
		this.age = 700;
	}
}

package program4e;

public class Application {
	public static void main(String[] args) {
		ConstructorPerson nat = new ConstructorPerson();
		System.out.println("Name: " + nat.name + ", Age: " + nat.age);
	}
}


