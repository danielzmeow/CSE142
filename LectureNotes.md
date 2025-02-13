# CSE142

I just use VSCode for writing codes with help of GitHub Copilot. It is not quite traditional but it is quite fun.

This work is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1)

---

## Lecture 1

Try to view it as a new kind of language and learn the *thinking process* of using a new kind of language.

> An old convention to print "Hello, World!"

```java
public class Hello {
    //main method
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**class** should be a word with capital letter, we'll get to the point of `public static void main(String[] args)` in Chapter VII.

**escape sequence**: `\` A two character sequence to represent a single character.

## Lecture 2

The sense of **subtask**: Do not put all your code in the main method, instead, using more sub-method to represent different parts.

You can define your own static methods like `public static void [name]([parameters])`.

**method** begins with lower case letter, you should name it in that way: `thisIsAReallyLongMethodInJava`.

## Lecture 3

An idea between *discrete* and *continuous*.

## Lecture 4

Take consideration of one important thing: the essence difference between odd and even is related to the number we get while being modded.

In this case, carefully thinking about the usage of mod and other ways of calculating.

### For Loop

> *C* did For Loops this way so did *C++* and so *Java* decided to copy. 

```java
for (init; test; update) {
    body
}
```

## Lecture 5

The ability to disassemble tasks is important, we begin with fixed situation, then we explore further to more common situation.

The usage of `final`: It is something in **class** layer, instead of inside any method. For each element used as final, it will become an **immutable** element.

## Lecture 6

Try merge repeated used codes.

**Variable scope**: the part of program where variable exists. For example,

```java
public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```
**Local variable**: the variable only available inside the scope.

**Global variable**: we do have it. Try **DON'T** use it til now.

Focus on individual components.

The **parameter** is designed to let information to **flow into** method.

## Lecture 7

Java is not only designed for procedural programming. Java is an object-oriented language. **Practice** of objects usage is important.

**Primitive types** begin with lowercase letters.

**Object types** are defined by class, which begin with capital letter.

Codes to add new object are shown below:

```java
Scanner input1 = new Scanner(System.in)
[Class] [Variable] = [Keyword] [Class(Argument)]
```
The `[Class]` define the type of `[Variable]`.

Variable stores a reference to the object.

Object-oriented means you need to *talk with* object, for example: `panel.getGraphics().drawRect()` needs `.getGraphics()` because only **graphics** can draw something.

## Lecture 8

Keep `main` concise when you can. It should some kind of fuse to **boom** the whole programmes.

This lecture basically repeats about parameters and do this again and again.