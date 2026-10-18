# StackQuizJava

A simple Java console application demonstrating the **Stack data structure** using Java's Collections Framework.

## Overview

StackQuizJava is a beginner-friendly Java project that illustrates how a stack stores and removes elements according to the **Last In, First Out (LIFO)** principle.

The program is designed to add shape names to a stack, display the element at the top, remove that element, and print the remaining contents.

**Note:** The current source contains a compilation error that must be fixed before the program can run. See [Known Issues](#known-issues).

## Features

- Creates a stack for shape names.
- Adds elements using `push()`.
- Displays the top element using `peek()`.
- Removes the top element using `pop()`.
- Prints the remaining stack contents.

## Technologies Used

- **Programming Language:** Java
- **Library:** `java.util.Stack`
- **Core Concept:** Stack data structure and LIFO behavior

## Project Structure

```text
StackQuizJava/
├── StackQuiz.java
└── README.md
```

## How It Works

The intended program demonstrates these operations:

1. Creates a stack named `shapes`.
2. Adds `"Triangle"` to the stack.
3. Adds `"Circle"` to the stack.
4. Uses `peek()` to display the element at the top.
5. Uses `pop()` to remove the top element.
6. Prints the remaining stack contents.

A stack follows the **Last In, First Out (LIFO)** principle. Since `"Circle"` is added after `"Triangle"`, Circle is at the top and is removed first.

## Requirements

- Java Development Kit (JDK)
- A terminal or command prompt, or a Java-compatible IDE

No third-party libraries are required.

## How to Run

After fixing the compilation error described below:

1. Open a terminal in the project directory.
2. Compile the source file:

   ```bash
   javac StackQuiz.java
   ```

3. Run the program:

   ```bash
   java StackQuiz
   ```

## Expected Output After the Fix

```text
Circle is at the top of the stack.
The stack contains: [Triangle]
```

This output assumes the first `push()` statement is corrected to use the declared variable `shapes`.

## Known Issues

### Compilation Error

The source declares the stack variable as:

```java
Stack shapes = new Stack();
```

But the next statement uses a different variable name:

```java
shape.push("Triangle");
```

The variable `shape` is not declared. This causes a compilation error.

**Fix:** Change the statement to:

```java
shapes.push("Triangle");
```

### Additional Improvements

- Use `Stack<String>` instead of a raw `Stack` type to improve type safety.
- Follow Java naming and formatting conventions consistently.
- Add explanatory comments for each stack operation.
- Consider demonstrating what happens when `peek()` or `pop()` is called on an empty stack.
- If the project is intended to be a quiz, add questions, answer validation, and score tracking. These features are not currently implemented.

## Project Purpose

This project serves as a basic educational example of stack operations in Java. It can be extended into a more interactive learning exercise for students studying data structures.

## Author

**Ichiro Yamazaki**

GitHub: [@ichiroyamazaki](https://github.com/ichiroyamazaki)

## License

No license is specified in the repository. Check with the repository owner before redistributing or reusing the source code.
