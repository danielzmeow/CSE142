# CSE142
Personal clone of [CSE142](https://www.youtube.com/playlist?list=PLMnqwkW7oW7EhGxyJ1peKXC-d7JfBVS6N), which is a Java introductory course by University of Washington. Since I do have little experience in coding, I use the style I like to code the programmes.

I do hope one day, it can remind me of my **original intention** of my final decision of learning computer science, which is to contribute to the foundation of the world.

> *"It has often been said that a person does not really understand something until after teaching it to someone else. Actually a person does not really understand something until after teaching it to a computer, i.e., expressing it as an algorithm."*

> By Donald Knuth, Selected Papers on Computer Science

---

**My lecture notes (English) below**. [**课堂笔记-中文(简体)**](LectureNotes_zh-CN.md)

# Lecture Notes

Using VSCode paired with GitHub Copilot for code writing may not be the traditional approach, but it's certainly enjoyable.

This content is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1).

***Every element has been meticulously rephrased by OpenAI GPT-4o to minimize the risk of errors or expressions unfamiliar to the local context.***

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

Introducing the `Scanner` class marks a significant step in handling user inputs in Java.

```java
// Import Java utilities
import java.util.*;
...
Scanner console = new Scanner(System.in);
console.nextInt();
```

It's crucial to ensure that the type of input matches the expected output type in every scenario.

## Lecture 11

Utilizing the `return` keyword is essential to extract values from a method. Remember, private variables are inaccessible globally.

### If & Else

The use of `if-else` statements helps prevent the repeated execution of multiple `if` statements. Demonstrated below is a proper example of employing `if-else`.

```java
if (test1) {
    statement(1);
} else if (test2) {
    statement(2);
} else if (test3) {
    statement(3);
}
```

It's important to distinguish between `if-if`, `if-else if`, and `if-else`, as they operate distinctly. The choice depends on the number of possible branches you want to execute.

## Lecture 12

### Style Errors

**Avoid** chaining methods such as calling one method inside another repeatedly. This can lead to what is known as a *one-way* method. Additionally, ensure that parameters passed into a method are utilized.

### Primitive and Object Types

Primitive types in Java typically start with a lowercase letter.

### Testing `String`

We have covered almost all aspects of the `String` class, allowing you to explore and utilize them as needed.

| Method                | Description                                    |
| --------------------- | ---------------------------------------------- |
| equals(str)           | Checks if two strings have the same characters |
| equalsIgnoreCase(str) | Checks character equality, ignoring case       |
| startsWith(str)       | Checks if one string starts with another       |
| endsWith(str)         | Checks if one string ends with another         |
| contains(str)         | Checks if one string contains another          |

Remember that the `.equals()` method should exhibit symmetry.

### `String` Methods

| Method                    | Description                                |
| ------------------------- | ------------------------------------------ |
| indexOf(str)              | Finds the first index of str               |
| length()                  | Gives the length of the string             |
| substring(index1, index2) | Extracts a substring from index1 to index2 |
| toLowerCase()             | Returns a **new** string in lowercase      |
| toUpperCase()             | Returns a **new** string in uppercase      |

## Lecture 13

### `While` Loop

The `while` loop continues to execute its block of code as long as a specified condition is true.

```java
while (test) {
    statement(s);
}
```

- While Loop: Useful when the number of iterations is unknown beforehand, operating until the condition is false.
- For Loop: Ideal when the number of iterations is predetermined, usually for iterating over sequences or ranges.

### Fencepost Problem

The Fencepost Problem, or Off-by-One Error, arises when one fails to consider the difference between the number of items and the spaces between them, although it can extend to more complex conditions.

## Lecture 14

### `Random` Class

Creating a `Random` object is essential for generating pseudo-random numbers.

> Pseudo-random: Random numbers generated through algorithms.

| Method        | Description                                                          |
| ------------- | -------------------------------------------------------------------- |
| nextInt       | Returns a random integer                                             |
| nextInt (max) | Generates a random integer between [0, max), i.e., from 0 to *max-1* |
| nextDouble()  | Produces a random number in the range [0.0, 1.0)                     |

In each situation, start with declaring a variable for the class and then use its methods. For instance:

```java
Random rNumber = new Random();
rNumber.nextInt(10);
```

## Lecture 15

> Engineers study physics as they create artifacts in the physical world.

### Legal Input

Anticipating that users will always provide **valid input** is unrealistic.

Every component of the program requires careful consideration.

## Lecture 16

### Type `boolean`

This primitive type in Java, lowercase, represents two possible values: true or false.

Logical operators:
- Or: `||` If any condition is true.
- And: `&&` If all conditions are true.

### Miscellaneous

Once `return` is executed, the method exits instantly.

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

Functional programming focuses on conveying intentions directly, bypassing extensive procedural details.

### Arrays

Define an array in Java with `int[] array`.

Initialize an array by:

```java
int[] array = {1, 2, 3, 4, 5};
```

Access specific elements using `array[n]`, where `n` is the index.

### Functional Programming

Traditional Java differs from functional programming primarily in its object-oriented paradigm.

Functional programming emphasizes minimal details, focusing on clearly specifying your goals.

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

Compare the two styles below:

```java
// Traditional loop
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

// Functional approach
Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
```

### Anonymous Functions: Lambda Expressions

The Stream: Source `->` Modifier `->` Terminator model is crucial here.

Lambda expression (`element -> System.out.print(element)`) specifies an action for each element.

Method reference (`System.out::print`) offers a shorthand approach for commonly invoked methods.

## Lecture 18

An essential computer science concept involves handling files and input streams.

```java
import java.io.*;
File file = new File("numbers.txt");
```

### Paths

- **Absolute Path**: Full directory list like `/Users/username/developer`.
- **Relative Path**: Path relative to the **current working directory**.

### Plumbing Model

Visualize data flowing through a series of connected pipes or components.

A `Scanner` acts as a faucet, linking sources with terminators.

```java
import java.io.*;
File file = new File("numbers.txt");
Scanner input = new Scanner(file);
input.nextDouble();
```

Ensure you handle *file not found exceptions* with a structure similar to this:

```java
try {
    File numberFile = new File("numbers.txt");
    Scanner input = new Scanner(numberFile);
    System.out.println(input.nextLine());
    input.close();
} catch (FileNotFoundException error) {
    System.out.println("File not found: " + error.getMessage());
}
```

### Round-Off Error

1. Finite Precision: Limited bits restrict numerical representation.
2. Floating-Point: Format like IEEE 754 has inherent limits.
3. Binary Representation: Some decimals (e.g., 0.1) cannot be perfectly represented in binary.

### Valid Input Testing

A token-based data processing approach ensures validity.

| Method          | Description                                                                  |
| --------------- | ---------------------------------------------------------------------------- |
| hasNext()       | Checks if more tokens are available (always **true** for **console** inputs) |
| hasNextInt()    | Verifies if the next token is an integer                                     |
| hasNextDouble() | Confirms if the next token is a double                                       |

### Logical Error with `nextDouble()`

Double-check if `nextDouble()` is mistakenly called twice without storage.

```java
double number = input.nextDouble();
System.out.println("Number: " + number);
sum += number;
```

When storing it, ensure it won't be accessed twice accidentally.

## Lecture 20

### Introduction to Arrays

Here’s how you might declare an array in Java: 

```java
int[] list = new int[10];
list.length();
list;
```

In this snippet, the array is initialized to have 10 elements. Notably, accessing elements in an array features the attribute of **random access**, allowing you to reach any index with the same efficiency.

## Lecture 21

When you utilize variables with similar naming, such as `i` and `array[i]`, exercise caution to maintain clarity between them.

### The `Array` Class 

Located within `java.util.Arrays`, the `Array` class offers a plethora of methods tailored for array manipulation, enhancing the efficiency of operations.

### Understanding Reference Semantics

Modifying parameters within a method does not alter the original data; rather, it behaves like creating a copy. Imagine several individuals sharing the same address—each visit takes you to that identical location.

The way Java manages parameter passing remains consistent with variable copying rules, whether they are of a primitive or reference type.

## Lecture 22

```java
char ch;
char letter = 'A';
char unicodeChar = '\u0041';  // Represents 'A' in Unicode
char intChar = 65;  // Numeric representation of 'A'
```

This segment showcases the versatility of the `char` data type, embracing symbols, Unicode, and direct integer values.

## Lecture 23

Java's architecture is inherently aligned with Object-Oriented Programming (OOP) principles. 

### A Blast from the Past: OOP's Evolution

Recalling the 1970s at Xerox PARC, groundbreaking work on GUI systems like the Xerox Alto inspired transitions from command-line interfaces (CLI) to graphical user interfaces (GUI), shifting from `verb + noun` commands to `noun + verb` interactions.

### The Pillars of Classes

Classes serve as blueprints for object creation, akin to factories producing specific items.

### Comparing Local and Class Variables

| Characteristic           | Local Variables                               | Class (Instance) Variables                         |
| ------------------------ | --------------------------------------------- | -------------------------------------------------- |
| **Definition**           | Found within methods, constructors, or blocks | Reside within a class but outside methods          |
| **Scope**                | Confined to the block where they appear       | Accessible throughout the class                    |
| **Lifetime**             | Exists briefly during block execution         | Lasts as long as the object                        |
| **Initialization**       | Requires explicit initial setup               | Default values (0, false, null, etc.) are provided |
| **Access Modifiers**     | Cannot utilize access modifiers               | Free to use modifiers like private or public       |
| **Storage Location**     | Located on the stack                          | Stored on the heap                                 |
| **Declaration Position** | Within methods or blocks                      | Within class, outside methods                      |
| **Initialization Need**  | Must be initialized before use                | Optional initialization                            |
| **Access Range**         | Limited to its declaring block                | Available to any class method                      |
| **Static Modifier**      | Cannot be static                              | Can be static (class-level variable)               |

### Methods: Instance vs. Static

| Feature               | Instance Methods                     | Static Methods                              |
| --------------------- | ------------------------------------ | ------------------------------------------- |
| Declaration           | Omit `static`                        | Use `static`                                |
| Association           | Tied to instances                    | Tied to the class                           |
| Invocation            | Called through object instances      | Invoked via the class                       |
| Instance Data Access  | Access instance variables or methods | Restricted to static data                   |
| Static Data Access    | Can freely access static data        | Only static data                            |
| Keyword `this`        | Allowed to use in current context    | Inapplicable                                |
| Memory Dynamics       | Each instance holds its own          | Single copy for the class                   |
| Suitable Scenarios    | Instance-specific logic              | Utility functions, independent operations   |
| Overriding Capability | Overridable in child classes         | Only hidden, not overridden                 |
| Usage Examples        | Accessors/mutators, core logic       | Helper or factory methods, static constants |

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

All information is conveyed through code, so please refer to the commit message and comments for details.

## Lecture 26

**Inheritance** is a fundamental principle in object-oriented programming. The concept of hierarchy (*is A*) plays a vital role throughout the programming lifecycle. The primary objective of inheritance is to effectively reuse code.

> A legal secretary **is A** type of secretary, a legal secretary **is A** type of clerical employee, and a clerical employee **is A** type of employee.

It's preferable to have a single, generic repository to keep all data together, rather than creating separate copies for various categories.


```java
public class A (extend objects) {
    public void methodOne () { Action1; }

    public void methodTwo () { Action2; }
    // Class A as a super class 
}
public class B extend A {
    public void methodOne() { Action 4; }
    public void methodThree() { Action 3; }
    // Class B as a sub-class of A
}
```

| Class | methodOne | methodTwo | methodThree |
| ----- | --------- | --------- | ----------- |
| A     | Action1   | Action2   | N/A         |
| B     | Action4   | Action2   | Action3     |

The table above illustrates the methods for both overriding and inheritance.

Several essential aspects to consider are:

- You have the ability to override the behaviour defined in a superclass.
- You can also inherit behaviors from a superclass.

## Lecture 27

`Static` means one shared by all instance of the class (belongs to class)

### ArrayList

```java
ArrayList<String> list = new ArrayList<>();
list.set(i, value);
list.size();
list.get(i);
list.add(value);
list.add(i, value);
list.remove(i);
list.clear();
```

