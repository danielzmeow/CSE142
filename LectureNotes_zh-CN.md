# 课堂笔记

> 由 OpenAI GPT-4o mini 从英文翻译至中文（简体）。

我只是用 VSCode 编写代码，并借助 GitHub Copilot。这并不是传统的方式，但很有趣。

此作品采用 [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1) 许可协议。

---

## 讲座 1

尝试将其视为一种新语言，并学习使用这种新语言的*思维过程*。

### 打印 "Hello, World!"

> 打印 "Hello, World!" 的旧习惯。

```java
public class Hello {
    //主方法
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 类和转义序列

**class** 应该是一个以大写字母开头的词，我们将在第 VII 章讨论 `public static void main(String[] args)` 的细节。

**转义序列**：`\` 一个由两个字符组成的序列，用于表示一个字符。

## 讲座 2

**子任务**的概念：不要将所有代码都放在主方法中，而是使用更多的子方法来表示不同的部分。

您可以定义自己的静态方法，例如 `public static void [name]([parameters])`。

### 方法

**方法**以小写字母开头，您应该以这样的方式命名它：`thisIsAReallyLongMethodInJava`。

## 讲座 3

*离散*和*连续*之间的一个想法。

## 讲座 4

考虑一个重要的事情：奇数和偶数之间的本质差异与我们在使用取模运算时获得的数字有关。

在这种情况下，仔细考虑取模的使用和其他计算方法。

### `For` 循环

> *C* 以这种方式进行了 For 循环，*C++* 和 *Java* 也选择了复制这一点。

```java
for (init; test; update) {
    body
}
```

## 讲座 5

拆解任务的能力很重要，我们从固定的情况开始，然后进一步探讨更通用的情况。

### `Final`

`final` 的用法：它是在**类**层次中的某种东西，而不是在任何方法内部。每个被定义为 final 的元素将变成一个**不可变**的元素。

## 讲座 6

尝试合并重复使用的代码。

### 变量

**变量作用域**：变量存在于程序的部分。例如：

```java
public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```
**局部变量**：仅在作用域内可用的变量。

**全局变量**：我们确实有它。尝试**不要**在此之前使用它。

关注单独的组件。

### 信息流

**参数** 旨在使信息能够 **流入** 方法。

## 讲座 7

Java 不仅仅是为过程式编程而设计的。Java 是一种面向对象的语言。**对象**使用的**实践**是重要的。

### 类型

**基本类型**以小写字母开头。

**对象类型**由类定义，以大写字母开头。

添加新对象的代码如下：

```java
Scanner input1 = new Scanner(System.in)
[类] [变量] = [关键字] [类(参数)]
```
### 类定义变量

`[类]` 定义了 `[变量]` 的类型。

变量存储对对象的引用。

### 面向对象编程

面向对象意味着您需要与对象*交谈*，例如：`panel.getGraphics().drawRect()` 需要 `.getGraphics()` 因为只有**图形**才能绘制东西。

## 讲座 8

尽可能保持 `main` 简洁。它应该是某种引线，来**引爆**整个程序。

本讲座基本上反复提到参数的使用。

## 讲座 9

### `Math` 类

`Math` 类是在 Java 中计算与数学相关的事物的标准方式。

当一个方法对一个值进行操作时，方法可能返回一个值，但您对此不做任何操作。因此，您需要一个变量来存储它。

> 不要害怕太多变量。

对于 `public static void ...`，`void` 是返回值。Java 注重对象的类型。

### 当前时间

根据另一种旧的约定，在现代语言中，大多数初始时间设置为 1970/1/1。

我们即将介绍一种获取当前时间的方法：

```java
int millis = System.currentTimeMillis();
```

请注意，它返回的值是从 1970/1/1 到当前时间的毫秒数差。返回值基于 `long`，可以存储更多的日期。

> `int` 是一种 32 位整数数据类型，能够存储 -2³¹ 到 2³¹-1 的数字，而 `long` 是一种 64 位整数数据类型，能够存储更大的数字，从 -2⁶³ 到 2⁶³-1。

### 整数溢出

此外，这听起来像个笑话，但它确实显示了方法 `.nanoTime` 中的整数溢出。

> 在大约 292 年（263 纳秒）的连续调用中，差异将不会正确计算经过的时间，因为数值溢出。

### 信息流

**了解跨不同方法的信息流很重要。** 例如，

```java
public static double convertToDays(double millis) {
    double answers = (millis / 1000 / 60 / 60 / 24);
    return answers;
}
```
对于 `double millis`，它是需要传入的值。对于 `double answers`，它是返回的值。

将 double 转换为 `int` 的简单方法如下：

```java
double weeks = (int) (days / 7);
```

## 讲座 10

### `Scanner` 类

我们即将介绍 `Scanner` 类。

 ```java
 //导入 Java 工具
 import java.util.*;
 ...
 Scanner console = new Scanner(System.in);
 console.nextInt();
 ```

注意在任何情况下，输入的类型必须与输出的类型一致。

## 讲座 11

如果您想从 `method` 中获取一个值，您需要使用 `return` 关键字。注意，私有变量无法全局使用。

### 如果 & 否则

我们实际上使用 `if-else` 来防止某些 `if` 被执行多次。下面是使用 `if-else` 的一个很好的示例。

```java
if (test1) {
    statement(1);
} else if (test2) {
    statement(2);
} else (test3) {
    statement(3);
}
```

必须强调的是，`if-if`、`if-else if` 和 `if-else` 是非常 **不同** 的。选择哪一种取决于您想要执行的分支数量。

## 讲座 12

### 风格错误

**避免**使用*链式*。避免在方法中使用方法并在另一个方法中使用。如果您使用这种链式，最终会变成一个*单向*方法。

另一件重要的事情是防止将方法传入但未使用的变量。

### 基本类型和对象类型

对于基本类型，它以小写字母开头。

### 测试 `String`

我们 *几乎* 涵盖了 `String` 类中的所有内容，如果您愿意，可以尝试使用任何东西。

| 方法                 | 描述                                 |
| -------------------- | ------------------------------------- |
| equals(str)          | 包含相同字符                           |
| equalsIgnoreCase(str)| 包含相同字符，忽略大小写               |
| startWith(str)       | 一个包含另一个作为开头                 |
| endWith(str)         | 一个包含另一个作为结尾                 |
| contains(str)        | 一个包含另一个                          |

作为提醒，`.equals()` 方法应具有对称性。

### `String` 方法

| 方法                     | 描述                                      |
| ------------------------ | ------------------------------------------- |
| indexOf(str)            | 查找 str 的第一个索引                     |
| length()                | 获取字符串的长度                          |
| substring(index1, index2)| 获取从 index1 到 index2 的子字符串      |
| toLowerCase()           | 一个 **新** 字符串，所有字符小写           |
| toUpperCase()           | 一个 **新** 字符串，所有字符大写           |

## 讲座 13

### `While` 循环

只要逻辑测试为真，则重复执行其主体。

```java
while (test) {
    statement(s);
}
```

> - While 循环：在您**不知道**需要多少次迭代时使用。它会持续，直到条件为假。
> - For 循环：在您预先知道迭代次数时使用，通常是用于遍历序列或范围。

### 栅栏问题

狭义上讲，栅栏问题（或越界错误）是一种编程错误，发生在未能考虑项目数量与它们之间的空间数量之间的差异时。广泛来说，可以扩展到更多条件。

## 讲座 14

### `Random` 类

`Random` 对象生成伪随机*数字。

> 伪随机：由算法生成的随机数。

| 方法             | 描述                                                                 |
| ---------------- | --------------------------------------------------------------------- |
| nextInt          | 返回一个随机整数                                                       |
| nextInt (max)    | 返回范围在 [0, max) 的随机整数，换句话说，包括 0 到 *max-1*       |
| nextDouble()     | 返回范围在 [0.0, 1.0) 的随机实数                                       |

在每种情况下，您首先需要有一个变量来存储一个类，然后通过这个变量使用一个方法。例如，

```java
Random rNumber = new Random();
rNumber.nextInt(10);
```

## 讲座 15

> 工程学研究物理，因为他们在物理世界中构建工件。

### 合法输入

您很难期望用户始终提供**合法的输入**。

我们基本上需要仔细考虑程序的每个部分。

## 讲座 16

### 类型 `boolean`

Java 中的一种基本类型，以小写字母开头。

或者：`||` 任何条件为真。

和：`&&` 所有条件为真。

### 其他

当 `return` 被运行时，该方法将立即退出。

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

## 讲座 17

函数式编程倾向于直接显示您想要的内容，而不是多样化的细节。

### 数组

我们可以使用 `int[] array` 在 Java 中定义一个数组。

要初始化一个数组，请使用以下格式：

```java
int[] array = {1, 2, 3, 4, 5};
```

要获取数组中的特定对象，使用 `array[n]`。`n` 是数组中特定数字的顺序。

### 函数式编程

传统 Java 编程被认为是面向对象编程。

函数式编程倾向于用更少的细节来展示**你想要的**具体内容。

| 方面                  | 传统 Java（OOP）                       | 函数式编程                           |
|----------------------|---------------------------------------|--------------------------------------|
| **状态管理**         | 可变状态                              | 不可变值                             |
| **主要单元**         | 类和对象                             | 函数                                  |
| **副作用**           | 常见                                 | 避免                                 |
| **数据与行为**       | Coupled together                    | Separated                           |
| **执行模型**         | 命令式（如何）                        | 声明式（什么）                        |
| **并发性**           | 由于共享状态而具有挑战性            | 使用不可变数据更容易                |
| **错误处理**         | 异常                                 | 返回值（例如，Option/Either）         |
| **继承**             | 核心特性                             | 组合优于继承                         |

我们比较如下。

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```

```java
Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
```

### 匿名函数：lambda

流：源 -> 修改器 -> 终止器

Lambda 表达式（`element -> System.out.print(element)`）就像是在说：“当你得到一个元素时，去这个地方做这个事情。”

方法引用（`System.out::print`）就像是在说：“这是地方的地址。当你得到一个元素时，去那里。”

## 讲座 18

计算机科学导论的重要课。

```java
import java.io.*;
File file = new File("numbers.txt");
```

### 路径

绝对路径：文件系统的路径，例如：`/Users/danielzhang/developer`

相对路径：与您的**工作目录**相关的路径。

### 管道模型

您可以想象东西通过管道从一个地方流向另一个地方。

您可以将 `scanner` 视为水龙头，它是连接源和终端事物的一种方式。

```java
import java.io.*;
File file = new File("numbers.txt");
Scanner input = new Scanner(file);
input.nextDouble();
```

但重要的是检查 *文件未找到异常* 的条件。使用以下结构来解决它。

```java
try {
    File numberFile = new File("numbers.one");
    Scanner input = new Scanner(numberFile);
    System.out.println(input.nextLine());
    input.close();
} catch (FileNotFoundException error) {
    System.out.println("文件未找到: " + error.getMessage());
}
```

### 舍入误差

1. 有限精度：计算机使用固定数量的比特存储数字，这限制了精度。
2. 浮点表示：大多数实数以浮点格式（如 IEEE 754）表示，具有固有的限制。
3. 二进制表示：计算机使用二进制，这意味着某些十进制数字无法准确表示（例如，十进制的 0.1 无法在二进制中准确表示）。

### 合法输入的测试

基于令牌的数据处理方法。

| 方法               | 描述                                                                                   |
|-------------------|----------------------------------------------------------------------------------------|
| hasNext()         | 如果还有更多要读取的输入令牌，则返回 true（对于 **控制台** 输入总是 **true**）        |
| hasNextInt()      | 如果有下一个令牌，并且可以将其读取为整数，则返回 true                                  |
| hasNextDouble()   | 如果有下一个令牌，并且可以将其读取为双精度数，则返回 true                             |

### 调用 `NextDouble()` 两次的逻辑错误

您必须意识到，如果您不将其存储到变量中，则在这样的代码中将被调用两次（`double number = input.nextDouble()` 部分）。

```java
double number = input.nextDouble();
System.out.println("Number: " + number);
sum += number;
```

## 讲座 19

我们介绍一种基于行的数据处理方法：`.nextLine()`。注意将所有数据转换为相同的大小写格式。

要知道的一件事是：第二次调用方法从第一次调用 **停留** 的地方开始（而不是从开头）。

仔细考虑在内容中未找到内容时的条件，特别是在 [基于行的处理](chapterSix/LineBasedProcessing.java) 程序中，尤其是 `try` 和 `!data.equal("Movie Not Found")` 部分。

## 讲座 20

### 数组

```java
int[] list = new int[10];
list.length();
list
```

在此代码中，`10` 是数组的长度。对数组的调用是一种 **随机** 访问。

## 讲座 21

当您在不同类型的变量中使用相同的字母时，请注意识别其不同之处。例如 `i` 和 `array[i]`。

### `Array` 类

`Array` 类位于 `java.util.Arrays` 中，提供多种操作数组的方法。

### 引用语义（对象）

将参数传递给方法并在其中更改它们将不会更改原始值（就像复制一个新的值）。

为了理解引用，可以将其比作多个住在同一地址的人。每次您拜访其中一个人时，您都是去同一个地址。

参数传递的方式与变量处理的复制方式一致（基本类型和引用类型）。