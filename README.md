# CSE142
Personal clone of [CSE142](https://www.youtube.com/playlist?list=PLMnqwkW7oW7EhGxyJ1peKXC-d7JfBVS6N), which is a Java introductory course by University of Washington. Since I do have little experience in coding, I use the style I like to code the programmes.

I do hope one day, it can remind me of my **original intention** of my final decision of learning computer science, which is to contribute to the foundation of the world.

> *"It has often been said that a person does not really understand something until after teaching it to someone else. Actually a person does not really understand something until after teaching it to a computer, i.e., expressing it as an algorithm."*

> By Donald Knuth, Selected Papers on Computer Science

---

**My lecture notes (English) below**. [**课堂笔记-中文（简体）**](LectureNotes_zh-CN.md)

# Lecture Notes

I just use VSCode for writing codes with help of GitHub Copilot. It is not quite traditional but it is quite fun.

This work is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1)

---

## Lecture 1

Try to view it as a new kind of language and learn the *thinking process* of using a new kind of language.

### Printing "Hello, World!"

> An old convention to print "Hello, World!"

```java
public class Hello {
    //main method
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Class and Escape sequence

**class** should be a word with capital letter, we'll get to the point of `public static void main(String[] args)` in Chapter VII.

**escape sequence**: `\` A two character sequence to represent a single character.

## Lecture 2

The sense of **subtask**: Do not put all your code in the main method, instead, using more sub-method to represent different parts.

You can define your own static methods like `public static void [name]([parameters])`.

### Method

**method** begins with lower case letter, you should name it in that way: `thisIsAReallyLongMethodInJava`.

## Lecture 3

An idea between *discrete* and *continuous*.

## Lecture 4

Take consideration of one important thing: the essence difference between odd and even is related to the number we get while being modded.

In this case, carefully thinking about the usage of mod and other ways of calculating.

### `For` Loop

> *C* did For Loops this way so did *C++* and so *Java* decided to copy. 

```java
for (init; test; update) {
    body
}
```

## Lecture 5

The ability to disassemble tasks is important, we begin with fixed situation, then we explore further to more common situation.

### `Final`

The usage of `final`: It is something in **class** layer, instead of inside any method. For each element used as final, it will become an **immutable** element.

## Lecture 6

Try merge repeated used codes.

### Variables

**Variable scope**: the part of program where variable exists. For example,

```java
public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```
**Local variable**: the variable only available inside the scope.

**Global variable**: we do have it. Try **DON'T** use it til now.

Focus on individual components.

### Information Flow

The **parameter** is designed to let information to **flow into** method.

## Lecture 7

Java is not only designed for procedural programming. Java is an object-oriented language. **Practice** of objects usage is important.

### Types

**Primitive types** begin with lowercase letters.

**Object types** are defined by class, which begin with capital letter.

Codes to add new object are shown below:

```java
Scanner input1 = new Scanner(System.in)
[Class] [Variable] = [Keyword] [Class(Argument)]
```
### Class defined variables

The `[Class]` define the type of `[Variable]`.

Variable stores a reference to the object.

### Object-Oriented Programming

Object-oriented means you need to *talk with* object, for example: `panel.getGraphics().drawRect()` needs `.getGraphics()` because only **graphics** can draw something.

## Lecture 8

Keep `main` concise when you can. It should some kind of fuse to **boom** the whole programmes.

This lecture basically repeats about parameters and do this again and again.

## Lecture 9

### `Math` Class

`Math` Class is the standard way for you in Java to calculate math related things.

When a method do something to a value, it is possible for the method to return a value but you do nothing with it. So you need variable to tore it.

> Don’t be afraid of too much variables.

For `public static void ...`, the `void` is return value. Java cares about the type of the objects.

### Current time

According to another old convention, in modern language, most of the initial time is setted to 1970/1/1.

We are about to introduce a way to get current time:

```java
int millis = System.currentTimeMillis();
```

Be careful that the value it returns is the difference between 1970/1/1 and current time in milliseconds. The returning value is based on `long`, which can store more more date.

> `int` is a 32-bit integer data type that can store numbers from -2³¹ to 2³¹-1, while `long` is a 64-bit integer data type that can store much larger numbers from -2⁶³ to 2⁶³-1

### Integer overflow

Plus, it like a joke but it do show the integer overflow in the method `.nanoTime`.

> Differences in successive calls that span greater than approximately 292 years (263 nanoseconds) will not correctly compute elapsed time due to numerical overflow

### Information flow

**Understand information FLOW over different method is important.** For example,

```java
public static double convertToDays(double millis) {
    double answers = (millis / 1000 / 60 / 60 / 24);
    return answers;
}
```
For the `double millis`, it is the value it requires to pass in. And for the `double answers`, it is the value it returns.

There is a simple way to convert double to `int`

```java
double weeks = (int) (days / 7);
```

## Lecture 10

### `Scanner` Class

 We are about to introduce `Scanner` class. 

 ```java
 //import Java utilities
 import java.util.*;
 ...
 Scanner console = new Scanner(System.in);
 console.nextInt();
 ```

Be careful that in any situation, the type of input must be consist with the type of output.

## Lecture 11

If you want to get a value out of `method`, you need to use `return` keyword. Be careful that private variable cannot be used globally. 

### If & else

We actually use `if-else` to prevent some `if` have been executed for more than once. A great example for using `if-else` is shown below.

```java
if (test1) {
    statement(1);
} else if (test2) {
    statement(2);
} else (test3) {
    statement(3);
}
```

It must be reminded that `if-if`, `if-else if` and `if-else` are quite **different**. What to choose depends on how many branches you want to execute

## Lecture 12

### Style error

**Avoid** using *chaining*. Avoid using method in method and in another method. If you use such chaining, it turns to be a *one-way* method.

Another important thing is to prevent pass in the method never be used.

### Primitive and Object Types

For primitive type, it begins with lower case

### Test `String`

We *almost* cover all the things in `String` class and try use anything if you would like to.

| Method                | Description                          |
| --------------------- | ------------------------------------ |
| equals(str)           | Contains same character              |
| equalsIgnoreCase(str) | Contains same character, ignore case |
| startWith(str)        | One contains other at start          |
| endWith(str)          | One contains other at end            |
| contains(str)         | One contains other                   |

As a reminder, the `.equals()` method should be symmetric.

### `String` Method

| Method                    | Description                             |
| ------------------------- | --------------------------------------- |
| indexOf(str)              | Find the first index of str             |
| length()                  | Get the length of the string            |
| substring(index1, index2) | Get the substring from index1 to index2 |
| toLowerCase()             | A **new** string with all lower case    |
| toUpperCase()             | A **new** string with all upper case    |

## Lecture 13

### `While` Loop

Repeatedly executes its body as long as a logical test is true.

```java
while (test) {
    statement(s);
}
```

> - While Loop: Used when you **don't know** how many iterations you need beforehand. It continues until a condition becomes false
> - For Loop: Used when you know the number of iterations in advance, typically for iterating over a sequence or range

### Fencepost Problem

Narrowly, the Fencepost Problem (or Off-by-One Error) is a programming error that occurs when failing to account for the difference between the number of items versus the number of spaces between them. While widely it can be extended to more condition.

## Lecture 14

 ### `Random` Class

A `Random` object generates pseudo-random* numbers. 

> Pseudo-random: a random generated by algorithm.

| Method        | Description                                                                           |
| ------------- | ------------------------------------------------------------------------------------- |
| nextInt       | returns a random integer                                                              |
| nextInt (max) | returns a random integer in the range [0, max) in other words, 0 to *max-1* inclusive |
| nextDouble()  | returns a random real number in the range [0.0, 1.0)                                  |

In each case, you first need to have a variable to store a class and then use a method through this variable. For example,

```java
Random rNumber = new Random();
rNumber.nextInt(10);
```
## Lecture 15

> Engineering study phyisc because they build artifacts in the physical world.

### Legal Input

It is very hard for you to expect the user always give you an **legal input**.

We basically need to consider each part of the program carefully.

## Lecture 16

### Type `boolean`

One of the primitive type in *Java*, which starts with lowercase letter.

Or: `||`  Any of the condition is true.

And: `&&` All the condition is true.

### Other

When `return` is run, the method will exit immediately.

```java
public static boolean lucky (Random rNumber) {
    for (int i = 1; i <= 10; i++) {
        int next = rNumber.nextInt(30);
        System.out.print(next + " ");
        if (next == 7) {
            return true;
        }
    }
    return false;
} 
```

## Lecture 17

Functional programming tend to show what you want directly instead of varieties of details.

### Array

We can use `int[] array` to define an array in Java.

To initialize an array, use such format

```java
int[] array = {1, 2, 3, 4, 5};
```

To get specific object in one array, use `array[n]` to do so. `n` is the order of the specific number in array.

### Functional Programming

Old school Java programming is considered to be object-oriented programming.

Functional programming tend to show few details with more specific of **what you want** .

| Aspect               | Traditional Java (OOP)          | Functional Programming              |
| -------------------- | ------------------------------- | ----------------------------------- |
| **State Management** | Mutable state                   | Immutable values                    |
| **Primary Unit**     | Classes and objects             | Functions                           |
| **Side Effects**     | Common                          | Avoided                             |
| **Data & Behavior**  | Coupled together                | Separated                           |
| **Execution Model**  | Imperative (how)                | Declarative (what)                  |
| **Concurrency**      | Challenging due to shared state | Easier with immutable data          |
| **Error Handling**   | Exceptions                      | Return values (e.g., Option/Either) |
| **Inheritance**      | Core feature                    | Composition over inheritance        |

We give a compare below.

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```

```java
Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
```

### Anonymous Functions: lambda

Stream: source -> modifier -> terminator

Lambda expression (`element -> System.out.print(element)`) is like saying, "When you get an element, go to this place and do this thing."

Method reference (`System.out::print`) is like saying, "Here's the address of the place. Go there when you get an element."

## Lecture 18

An important one of intro computer science. 

```java
import java.io.*;
File file = new File("numbers.txt");
```

### Path

Absolute path: the route of the file system like: `/Users/danielzhang/developer`

Relative path: path related to your **working directory**

### Plumbing Model

You can imagine things flow through pipes from one to another

You can always view `scanner` as faucet, which is a way to connect source and terminal things.

```java
import java.io.*;
File file = new File("numbers.txt");
Scanner input = new scanner(file);
input.nextDouble();
```

It is, however, important to check for the *file not found exception* condition. Use the structure below to solve it.

```java
try {
    File numberFile = new File("numbers.one");
    Scanner input = new Scanner(numberFile);
    System.out.println(input.nextLine());
    input.close();
} catch (FileNotFoundException error) {
    System.out.println("File not found: " + error.getMessage());
}
```

### Round-Off Error

1. Finite Precision: Computers store numbers using a fixed number of bits, which limits the precision.
2. Floating-Point Representation: Most real numbers are represented in floating-point format (like IEEE 754), which has inherent limitations
3. Binary Representation: Computers use binary, which means some decimal numbers cannot be represented exactly (e.g., 0.1 in decimal cannot be represented exactly in binary).

### Testing of Valid Input

A token-based way of data processing.

| Method          | Description                                                                                |
| --------------- | ------------------------------------------------------------------------------------------ |
| hasNext()       | returns true if there are any more tokens of input to read (always **true** for **console** input) |
| hasNextInt()    | returns true if there is a next token and it can be read as an int                         |
| hasNextDouble() | returns true if there is a next token and it can be read as a double                       |

### Logic Error with Calling `NextDouble()` Twice

You must realise that if you do not store it into a variable, it will be called twice in such codes. (The `double number = input.nextDouble()` part)

```java
double number = input.nextDouble();
System.out.println("Number: " + number);
sum += number;
```

## Lecture 19

We introduce a line-based data processing method: `.nextLine()`. Be careful to convert all the data into same capitalisation formats.

This is one thing to know is that: The second call to methods starts from where the first call **left off** (not from the beginning).

Carefully thinking the condition when nothing found in the contents, more detail in [Line-based Processing](chapterSix/LineBasedProcessing.java) programme, especially the `try` and `!data.equal("Movie Not Found")` parts.

## Lecture 20

### Array

```java
int[] list = new int[10];
list.length();
list
```

In this code, `10` is the length of array. The array calling is such kind of **Random** access.

## Lecture 21

When you are using same letter in different type of variables, be careful to recognise its different. For example `i` and `array[i]`.

### `Array` Class

`Array` Class is inside the `java.util.Arrays`, which provide multiple ways to operate the array.

### Reference Semantics (Objects)