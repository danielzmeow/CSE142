# 讲座笔记

> 由 OpenAI GPT-4o 从英文翻译至中文（简体）。

使用VSCode和GitHub Copilot进行代码编写可能不是传统的方法，但这种体验无疑愉快。

本内容采用 [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/?ref=chooser-v1) 许可协议。

---

## 讲座1

把它视为一种全新的语言，并专注于掌握与学习这种新语言相关的*认知框架*。

### 显示“Hello, World!”

> 经典做法是在控制台打印“Hello, World!”。

```java
public class Hello {
    // 主方法
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 类和转义序列

术语**class**应该大写。`public static void main(String[] args)`的详细解释将在第七章中介绍。

**转义序列**：由 `\` 表示，是用于表示单个字符的两字符组合。

## 讲座2

理解**子任务**：避免将所有代码放在`main`方法中，而是利用多个子方法来划分不同的部分。

你可以创建自己的静态方法，如 `public static void [name]([parameters])`。

### 方法论

命名一个**方法**时，以小写字母开始，格式如下：`thisIsAReallyLongMethodInJava`。

## 讲座3

区分*离散*和*连续*概念。

## 讲座4

思考一个关键概念：奇数和偶数的根本区别在于它们被除时得到的余数。

在此背景下，分析模运算和其他计算方法的应用至关重要。

### `For`循环结构

> *C*的`For`循环方法被*C++*模仿，进而被*Java*采用了相似的方法。

```java
for (init; test; update) {
    body;
}
```

## 讲座5

拆分任务的能力至关重要；从固定场景开始，逐步拓展到更普遍的情况。

### `final`关键词的使用

`final`关键词适用于**类**级别而非方法内。任何声明为final的元素都将变得**不可变**。

## 讲座6

努力归纳重复使用的代码段。

### 理解变量

**变量作用域**定义了程序中变量可访问的区域。例如，

```java
public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
```

**局部变量**仅存在于其作用域内。

**全局变量**是可能的，但至少目前应避免。

专注于单个元素。

### 信息流

**参数**便于将信息传入方法**中**。

## 讲座7

Java不仅支持过程式编程。作为一种面向对象的语言，掌握**对象处理**至关重要。

### 类型类别

**基本类型**以小写字母开头。

**对象类型**由类定义，并以大写字母开头。

以下是实例化新对象的方法：

```java
Scanner input1 = new Scanner(System.in)
[Class] [Variable] = [Keyword] [Class(Argument)]
```

### 类定义的变量

`Class`指定`Variable`的类型。

变量存储指向对象的指针。

### 面向对象编程概念

在面向对象的设计中，与对象的交互是基础。例如：调用`panel.getGraphics().drawRect()`时需要`.getGraphics()`，因为只有<em>graphics</em>对象可以执行绘图功能。

## 讲座8

尽量保持`main`方法简洁，它起到触发程序启动的作用。

这一部分主要重申了关于参数的要点，强调了重复练习的必要性。

## 讲座9

### 使用`Math`类

Java的`Math`类提供了用于数学运算的全面工具包。

当方法处理一个值时，它可能返回一个结果，需要将其存储在变量中以便有效使用。

> 不要害怕创建多个变量。

在`public static void ...`中，`void`表示没有返回值。Java要求严格遵循对象类型定义。

### 访问当前时间

遵循另一个悠久的做法，现代语言通常将初始时间默认为1970年1月1日。

以下是访问当前时间的方法：

```java
int millis = System.currentTimeMillis();
```

要注意的是，返回值反映自1970年1月1日起经过的毫秒数，以`long`为基础，能够处理更大数据集。

> `int`是一个32位的数据类型，覆盖从-2³¹到2³¹-1的值，而`long`提供了64位存储，能容纳从-2⁶³到2⁶³-1的更大数字。

### 处理整数溢出

尽管可能看似有趣，但`.nanoTime`方法展示了整数溢出。

> 如果连续调用之间的差异超过大约292年（263纳秒），由于数值溢出，可能导致时间计算不准确。

### 信息流动态

**了解信息在不同方法间的流动是至关重要的。**请看以下例子：

```java
public static double convertToDays(double millis) {
    double answers = (millis / 1000 / 60 / 60 / 24);
    return answers;
}
```

在`double millis`中，参数被要求作为输入。同时，方法返回的是`double answers`。

存在一种简单的技巧将双精度浮点型转换为`int`：

```java
double weeks = (int) (days / 7);
```

## 讲座10

### `Scanner`类

引入`Scanner`类是处理Java中用户输入的重要步骤。

```java
// 导入Java实用工具
import java.util.*;
...
Scanner console = new Scanner(System.in);
console.nextInt();
```

确保在每种情况下，输入类型与期望的输出类型匹配至关重要。

## 讲座11

使用`return`关键字是从方法中提取值的必要步骤。记住，私有变量在全局范围内是不可访问的。

### If & Else

使用`if-else`语句有助于防止多次执行多个`if`语句。以下是正确使用`if-else`的示例。

```java
if (test1) {
    statement(1);
} else if (test2) {
    statement(2);
} else if (test3) {
    statement(3);
}
```

重要的是区分`if-if`，`if-else if`，和`if-else`，因为它们的操作方式不同。选择取决于您想要执行的可能分支的数量。

## 讲座12

### 风格错误

**避免**将一个方法嵌套在另一个方法中反复调用。这可能导致所谓的*单向*方法。此外，确保传入方法的参数得到使用。

### 基本类型和对象类型

Java中的基本类型通常以小写字母开头。

### 测试`String`

我们几乎涵盖了`String`类的所有方面，允许您根据需要进行探索和利用。

| 方法                | 描述                          |
| ------------------- | ------------------------------ |
| equals(str)         | 检查两个字符串是否具有相同字符 |
| equalsIgnoreCase(str) | 忽略大小写检查字符相等         |
| startsWith(str)     | 检查一个字符串是否以另一个字符串开头 |
| endsWith(str)       | 检查一个字符串是否以另一个字符串结尾 |
| contains(str)       | 检查一个字符串是否包含另一个字符串  |

记住`.equals()`方法应表现出对称性。

### `String`方法

| 方法                    | 描述                            |
| ----------------------- | ------------------------------- |
| indexOf(str)            | 查找str的第一个索引              |
| length()                | 给出字符串的长度                 |
| substring(index1, index2) | 提取从index1到index2的子字符串  |
| toLowerCase()           | 返回一个**新**的小写字符串     |
| toUpperCase()           | 返回一个**新**的大写字符串     |

## 讲座13

### `While`循环

`while`循环会一直执行其代码块，只要指定的条件为真。

```java
while (test) {
    statement(s);
}
```

- While循环：适用于未知迭代次数的情况，直至条件为假为止。
- For循环：适合已知迭代次数的情况，通常用于遍历序列或范围。

### Fencepost问题

Fencepost问题，或称为“差一错”，出现于未能考虑物品数量与其之间间隔的差异，尽管这可能扩展到更复杂的条件。

## 讲座14

### `Random`类

创建`Random`对象对于生成伪随机数至关重要。

>  伪随机：通过算法生成的随机数。

| 方法         | 描述                                                             |
| ------------ | ---------------------------------------------------------------- |
| nextInt      | 返回一个随机整数                                                 |
| nextInt (max)| 生成[0, max)范围内的随机整数，即从0到*max-1*                     |
| nextDouble() | 产生[0.0, 1.0)范围内的随机数                           |

在每种情况下，首先声明类的一个变量，然后使用其方法。例如：

```java
Random rNumber = new Random();
rNumber.nextInt(10);
```

## 讲座15

> 工程师研究物理学是由于他们在物理世界中创造人工制品。

### 合法输入

指望用户总是提供**有效输入**是不切实际的。

程序的每个组成部分都需要仔细考虑。

## 讲座16

### 类型`boolean`

Java中的这种基本类型，以小写字母表示，代表两个可能的值：true或false。

逻辑操作符：
- Or：`||` 如果任何条件为真。
- And：`&&` 如果所有条件为真。

### 杂项

一旦`return`被执行，方法会立即退出。

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

## 讲座17

函数式编程专注于直接传达意图，避免详细步骤。

### 数组

使用`int[] array`在Java中定义数组。

初始化数组方式：

```java
int[] array = {1, 2, 3, 4, 5};
```

通过`array[n]`访问特定元素，其中`n`为索引。

### 函数式编程

传统Java与函数式编程的主要区别在于其面向对象的范式。

函数式编程强调最少细节，专注于明确描述目标。

| 方面                   | 传统Java（OOP）         | 函数式编程                    |
| ---------------------- | ----------------------- | ----------------------------- |
| **状态管理**           | 可变状态                | 不变值                      |
| **核心单位**           | 类和对象                | 函数                          |
| **副作用**             | 常见                    | 避免                         |
| **数据与行为**         | 一起结合                | 分离                          |
| **执行模型**           | 命令式（如何做）        | 声明式（做什么）             |
| **并发性**             | 由于共享状态而具有挑战性 | 使用不变数据更容易         |
| **错误处理**           | 异常                    | 返回值（例如，Option/Either）|
| **继承**               | 核心特点                | 组合优于继承                 |

比较以下两种风格：

```java
// 传统循环
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

// 函数式方法
Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
```

### 匿名函数：Lambda表达式

`Stream：来源->修饰->终结器`模型至关重要。

Lambda表达式（`element -> System.out.print(element)`）为每个元素指定一个动作。

方法引用（`System.out::print`）提供了一种常用方法的简写。

## 讲座18

计算机科学的一个重要概念涉及文件和输入流的处理。

```java
import java.io.*;
File file = new File("numbers.txt");
```

### 路径

- **绝对路径**：完整的目录列表，如`/Users/username/developer`。
- **相对路径**：相对于**当前工作目录**的路径。

### 管道模型

将数据想象为通过一系列互连管道或组件流动。

`Scanner`充当水龙头，将来源与终结器连接。

```java
import java.io.*;
File file = new File("numbers.txt");
Scanner input = new Scanner(file);
input.nextDouble();
```

确保使用类似如下结构处理*文件未找到异常*：

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

### 舍入误差

1. 有限精度：有限位限制数值表示。
2. 浮点：IEEE 754格式本身具有极限。
3. 二进制表示：某些小数（如0.1）无法在二进制中完美表示。

### 有效输入测试

基于令牌的数据处理方法确保有效性。

| 方法          | 描述                                                                                          |
| ------------- | --------------------------------------------------------------------------------------------- |
| hasNext()     | 检查是否有更多的令牌可用（对于**控制台**输入总是**true**）  |
| hasNextInt()  | 检查下一个令牌是否为整数                              |
| hasNextDouble() | 确认下一个令牌是否为双精度                       |

### `nextDouble()`的逻辑错误

仔细检查是否两次错误调用了`nextDouble()`而未存储。

```java
double number = input.nextDouble();
System.out.println("Number: " + number);
sum += number;
```

在存储时，确保不会意外访问两次。

## 讲座20

### 数组简介

以下是如何在Java中声明数组：

```java
int[] list = new int[10];
list.length();
list;
```

在此片段中，数组被初始化为有10个元素。值得注意的是，访问数组中的元素具备**随机访问**的属性，允许您以相同的效率到达任何索引。

## 讲座21

使用与`i`和`array[i]`类似的变量时，请务必小心以保持它们之间的清晰性。

### `Array`类

位于`java.util.Arrays`下的`Array`类提供了一系列针对数组操作调整的方法，增强了操作的效率。

### 理解引用语义

在方法内修改参数不会改变原始数据；相反，它的表现就像是在创建副本。想象几个人共享相同的地址——每次访问都会将您带到那个相同的位置。

无论它们是基本类型还是引用类型，Java在参数传递过程中仍然遵循变量复制规则。

## 讲座22

```java
char ch;
char letter = 'A';
char unicodeChar = '\u0041';  // 表示 'A' 的 Unicode 表示
char intChar = 65;  // 'A' 的数值表示
```

这一部分展示了`char`数据类型的多功能性，可以包含符号、Unicode和直接整数值。

## 讲座23

Java的架构本质上与面向对象编程（OOP）原则保持一致。

### 从过去汲取灵感：OOP的演变

回顾上世纪70年代在Xerox PARC进行的开创性工作，GUI系统如Xerox Alto的开发激发了从命令行接口（CLI）向图形用户界面（GUI）的过渡，从`动词+名词`命令转变为`名词+动词`交互。

### 类的支柱

类作为对象创建的蓝图，类似于专门生产特定物品的工厂。

### 比较局部和类变量

| 特征                   | 局部变量                   | 类（实例）变量                                           |
| ---------------------- | -------------------------- | -------------------------------------------------------- |
| **定义**               | 在方法、构造函数或块中定义 | 位于类中但在方法之外                                     |
| **作用域**             | 限定在其出现的块中         | 可在整个类中访问                                       |
| **生命周期**           | 仅在块执行期间存在         | 随对象生命周期存在                                     |
| **初始化**             | 需要显式初始设置            | 提供默认值（0, false, null等）                          |
| **访问修饰符**          | 不能使用访问修饰符          | 可使用访问修饰符如private或public                        |
| **存储位置**           | 存储在栈上                 | 存储在堆上                                              |
| **声明位置**           | 在方法或块内               | 在类中，方法外                                          |
| **初始化需求**          | 使用前必须初始化            | 初始化是可选的                                          |
| **访问范围**            | 限于其声明的块             | 对类中的任何方法都可用                                  |
| **静态修饰符**          | 不能为静态                 | 可以是静态（类级变量）                                  |

### 方法：实例与静态

| 特性                      | 实例方法                           | 静态方法                                                    |
| ------------------------- |-----------------------------------|-------------------------------------------------------------|
| 声明方式                  | 省略`static`                       | 使用`static`                                                 |
| 关联性                    | 绑定至实例                         | 绑定至类                                                    |
| 访问方式                  | 通过对象实例调用                   | 通过类访问                                                  |
| 实例数据访问               | 访问实例变量或方法                | 仅限静态数据                                                |
| 静态数据访问               | 可自由访问静态数据                | 仅限静态数据                                                |
| `this`关键字使用           | 当前上下文中允许使用              | 不适用                                                      |
| 内存动态性                 | 每个实例持有自己的副本             | 该类单一副本                                                |
| 合适场景                  | 实例特定逻辑                       | 辅助功能、独立操作                                           |
| 重写能力                  | 在子类中可重写                     | 只能隐藏，不能重写                                           |
| 用例示例                  | 访问器/修改器、核心逻辑            | 辅助或工厂方法、静态常量                                     |

## 讲座24

### 对象视图：外部与内部

从外部角度看，对象呈现了*客户*视图，而内部则代表了*实现*。普遍认为客户应对基础机制保持不知情。

> 一个对象封装了其状态（*字段*，类似于*变量*），并通过方法展示其行为。

### 构造函数

构造函数通过`new`进行唯一调用。

### `private`的作用

`private`关键字是一种强大的属性，确保了类组件的机密性，限制了其对类本身的可访问性。具体而言：

- 无外部代码能直接与私有属性交互。
- 私有成员即使对于包含类的子类也是不可访问的。
- 同一类的对象之间无法访问彼此的私有属性。

由于这种封装，使用*getter*和*setter*来管理私有数据变得必不可少。请参考以下示例：

```java
public class Person {
    private int age;
    
    // 构造函数
    public Person(int age) {
        this.age = age; 
        // 这里，this.age指代实例变量，而age是方法参数。
    }
    
    // 获取器
    public int getAge() {
        return age;
    }
    
    // 设置器
    public void setAge(int age) {
        this.age = age;
    }
}
```

## 讲座25

所有信息均通过代码传达，因此请参考提交信息和注释以获取详细信息。

## 讲座26

**继承** 是面向对象编程中的基本原则。层级结构（*is A*）在整个编程生命周期中起着至关重要的作用。继承的主要目的是有效地重用代码。

> 法务秘书 **是某种类型的** 秘书，法务秘书 **是某种类型的** 文职员工，而文职员工 **是某种类型的** 员工。

优选使用单一的通用库来统一管理所有数据，而不是为各种类别创建单独的副本。

```java
public class A (extend objects) {
    public void methodOne () { Action1; }

    public void methodTwo () { Action2; }
    // A类作为超类
}
public class B extend A {
    public void methodOne() { Action4; }
    public void methodThree() { Action3; }
    // B类是A类的子类
}
```

| 类别 | methodOne | methodTwo | methodThree |
| ----- | --------- | --------- | ----------- |
| A     | Action1   | Action2   | N/A         |
| B     | Action4   | Action2   | Action3     |

上表展示了方法的重写和继承。

需要考虑的几个重要方面是：

- 您可以重写在超类中定义的行为。
- 您还可以继承来自超类的行为。

## 讲座27

`Static`意味着类的所有实例共享一个（属于类）

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