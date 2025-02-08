# CSE142

I just use VSCode for writing codes with help of GitHub Copilot. It is not quite traditional but it is quite fun.

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

**escape sequence**: \ A two character sequence to represent a single character.

## Lecture 2

The sense of **subtask**: Do not put all your code in the main method, instead, using more submethod to represent different parts.

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