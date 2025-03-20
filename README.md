# CSE142
Personal clone of [CSE142](https://www.youtube.com/playlist?list=PLMnqwkW7oW7EhGxyJ1peKXC-d7JfBVS6N), which is a Java introductory course by University of Washington. Since I do have little experience in coding, I use the style I like to code the programmes.

I do hope one day, it can remind me of my **original intention** of my final decision of learning computer science, which is to contribute to the foundation of the world.

> *"It has often been said that a person does not really understand something until after teaching it to someone else. Actually a person does not really understand something until after teaching it to a computer, i.e., expressing it as an algorithm."*

> By Donald Knuth, Selected Papers on Computer Science

---

**My lecture notes (English) below**. [**课堂笔记-中文（简体）**](LectureNotes_zh-CN.md)

# Lecture Notes

Using VSCode paired with GitHub Copilot for code writing may not be the traditional approach, but it's certainly enjoyable.

This content is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1).

---

## Lecture 1

Consider looking at it as an entirely new language and focus on mastering the *cognitive framework* associated with learning this novel language.

### Displaying "Hello, World!"

> A classic tradition is to print "Hello, World!" to the console.

```java
public class Hello {
    //main method
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Class and Escape Sequences

The term **class** should be capitalized. The detailed explanation of `public static void main(String[] args)` will be covered in Chapter VII.

**Escape sequences**: Represented by `\`, these are two-character combinations used to symbolize a single character.

## Lecture 2

Understanding **subtasks**: Avoid placing all your code within the `main` method; instead, utilize multiple sub-methods to delineate different sections.

You have the ability to create your own static methods such as `public static void [name]([parameters])`.

### Methodology

When naming a **method**, start with a lowercase letter, following a format like: `thisIsAReallyLongMethodInJava`.

## Lecture 3

The concept of distinguishing between *discrete* and *continuous*.

## Lecture 4

Contemplate a crucial concept: the fundamental distinction between odd and even numbers lies in the remainder obtained when they are divided.

In this context, analyzing the application of the modulo operation and other computational methods is essential.

### `For` Loop Structure

> *C*'s approach to For Loops was mimicked by *C++*, leading *Java* to adopt a similar method.

```java
for (init; test; update) {
    body;
}
```

## Lecture 5

The capacity to deconstruct tasks is vital; begin with fixed scenarios and gradually extend to more general cases.

### `final` Keyword Usage

The `final` keyword applies at the **class** level rather than within methods. Any element declared as final becomes **immutable**.

## Lecture 6

Effort should be made to consolidate repeatedly used code segments.

### Understanding Variables

**Variable scope** defines the region within a program where a variable is accessible. For instance,

```java
public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```

**Local variables** exist solely within their scope.

**Global variables** are possible but should be avoided, at least for now.

Focus on individual elements.

### Information Flow

**Parameters** facilitate the transmission of information **into** a method.

## Lecture 7

Java supports more than just procedural programming. As an object-oriented language, mastering **object handling** is crucial.

### Type Categories

**Primitive types** begin with lowercase letters.

**Object types** are delineated by class, which commence with uppercase letters.

Here's how to instantiate a new object:

```java
Scanner input1 = new Scanner(System.in)
[Class] [Variable] = [Keyword] [Class(Argument)]
```

### Class-Defined Variables

The `Class` specifies the type of `Variable`.

Variables store pointers to the object.

### Object-Oriented Programming Concepts

In object-oriented design, interaction with objects is fundamental. For example: invoking `panel.getGraphics().drawRect()` requires `.getGraphics()` because only <em>graphics</em> objects can execute drawing functions.

## Lecture 8

Keep `main` streamlined whenever feasible, acting as a kind of trigger to initiate the program.

This segment largely reiterates points on parameters, emphasizing repetitive practice.

## Lecture 9

### Utilizing the `Math` Class

The `Math` class in Java offers a comprehensive toolkit for conducting mathematical operations.

When a method processes a value, it may return a result, which requires storage in a variable to be used effectively.

> Don't shy away from creating multiple variables.

In `public static void ...`, the `void` indicates absence of a return value. Java requires strict adherence to object type definitions.

### Accessing Current Time

Following another time-honored practice, contemporary languages often default initial time to 1970/1/1.

Here’s a method to access the current time:

```java
int millis = System.currentTimeMillis();
```

Bear in mind that the returned value reflects the elapsed milliseconds since 1970/1/1, based on `long`, capable of handling larger datasets.

> `int` is a 32-bit data type, covering values from -2³¹ to 2³¹-1, whereas `long` offers 64-bit storage, accommodating much larger figures from -2⁶³ to 2⁶³-1.

### Handling Integer Overflow

While it may seem humorous, the `.nanoTime` method demonstrates integer overflow.

> If differences between consecutive calls extend beyond approximately 292 years (263 nanoseconds), elapsed time calculations may be inaccurate due to numerical overflow.

### Information Flow Dynamics

**Awareness of how information flows across different methods is paramount.** Consider the example below:

```java
public static double convertToDays(double millis) {
    double answers = (millis / 1000 / 60 / 60 / 24);
    return answers;
}
```

In `double millis`, the parameter is required as input. Meanwhile, `double answers` is what the method returns.

There exists a straightforward technique to cast a double to an `int`:

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

| Method          | Description                                                                                        |
| --------------- | -------------------------------------------------------------------------------------------------- |
| hasNext()       | returns true if there are any more tokens of input to read (always **true** for **console** input) |
| hasNextInt()    | returns true if there is a next token and it can be read as an int                                 |
| hasNextDouble() | returns true if there is a next token and it can be read as a double                               |

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

Passing parameters into the method and change them inside it will not change the original value (like copying a new one).

To understand reference, you can say these're multiple people live in same address. Each time you visit one of them, you go to the same address.

Parameter passing works consistently with how variables are handled in terms of copying (Primitive type & Reference type)

## Lecture 22

### `char` Data Type

```java
char ch;
char letter = 'A';
char unicodeChar = '\u0041';  // This is also 'A'
char intChar = 65;  // This is also 'A'
```

## Lecture 23

### Object Oriented Programming

Java is designed for OOP (Object Oriented Programming).

1970's story: Xerox PARC, GUI: Xerox Alto and the Macintosh. In CLI days, you put in command like `verb + noun (rm -r data.txt)` to run such command. However, in GUI days, you point to some object and do something, which turns to be `noun + verb`. 

There's only one class, which is thought to be a blueprint (a description of constructing objects/instances). View a class as a factory.

| Characteristic             | Local Variables                                            | Class (Instance) Variables                            |
| -------------------------- | ---------------------------------------------------------- | ----------------------------------------------------- |
| **Definition**             | Variables declared within methods, constructors, or blocks | Variables declared within a class but outside methods |
| **Scope**                  | Limited to the block in which they are declared            | Available throughout the entire class                 |
| **Lifetime**               | Created when block is entered, destroyed when exited       | Exist as long as the object exists                    |
| **Default Initialization** | Not initialized automatically                              | Automatically initialized (0, false, null, etc.)      |
| **Access Modifiers**       | Cannot have access modifiers                               | Can have access modifiers (private, public, etc.)     |
| **Storage Location**       | Stored on the stack                                        | Stored in the heap with the object                    |
| **Declaration Position**   | Inside methods, constructors, or blocks                    | Inside class, outside methods                         |
| **Must be Initialized**    | Must be explicitly initialized before use                  | Optional (will use default values)                    |
| **Accessibility**          | Only within its declaring block                            | From any method in the class                          |
| **Static Keyword**         | Cannot use static keyword                                  | Can be declared as static (class variable)            |

### Ability to Include Method

| Feature                 | Instance Methods                               | Static Methods                                      |
| ----------------------- | ---------------------------------------------- | --------------------------------------------------- |
| Declaration             | Without `static` keyword                       | With `static` keyword                               |
| Association             | Associated with object instances               | Associated with the class itself                    |
| Invocation              | Called on object instances (`object.method()`) | Called on the class (`Class.method()`)              |
| Access to instance data | Can access instance variables/methods          | Cannot access instance variables/methods            |
| Access to static data   | Can access static variables/methods            | Can access only static variables/methods            |
| `this` keyword          | Can use `this` to refer to current instance    | Cannot use `this` (no instance context)             |
| Memory allocation       | One copy per object instance                   | One copy per class                                  |
| When to use             | When logic depends on instance state           | For utility functions independent of instance state |
| Overriding              | Can be overridden in subclasses                | Cannot be overridden (can be hidden)                |
| Example use cases       | Getters/setters, business logic operations     | Utility methods, factory methods, constants         |

## Lecture 24

### Object Views: External vs. Internal

From an external standpoint, an object presents a *client* view, while internally, it represents *implementation*. There's a prevailing belief that clients should remain unaware of the underlying mechanisms.

> An object encapsulates its state (*fields*, comparable to *variables*) and reveals its behavior through methods.

### Constructors

A constructor is uniquely invoked using `new`.

### The Role of `private`

The `private` keyword is a powerful attribute that ensures the confidentiality of class components, restricting their accessibility to the class itself. Here's what this entails:

- No external code can directly interact with private attributes.
- Private members remain inaccessible even to subclasses of the containing class.
- Objects originating from the same class are unable to access each other's private attributes.

Due to this encapsulation, the use of *getters* and *setters* becomes essential for managing private data. Consider the following example:

```java
public class Person {
    private int age;
    
    // Constructor
    public Person(int age) {
        this.age = age; 
        // Here, this.age refers to the instance variable, while age is the method parameter.
    }
    
    // Getter
    public int getAge() {
        return age;
    }
    
    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}
```

## Lecture 25