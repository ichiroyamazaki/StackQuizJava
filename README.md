# MutualRecursionJava

A simple Java console application demonstrating **mutual recursion** by determining whether an integer is even or odd.

## Overview

MutualRecursionJava is a beginner-friendly Java project that demonstrates how two methods can call each other recursively.

The program asks the user to enter an integer and then uses two methods, `Even()` and `Odd()`, to determine whether the number is even or odd.

This project is intended for students learning recursion, method calls, Boolean return values, and basic console input in Java.

## Features

- Accepts integer input through the console.
- Uses mutual recursion to determine parity.
- Displays whether the entered number is even or odd.
- Demonstrates base cases and recursive method calls.

## Technologies Used

- **Programming Language:** Java
- **Input Handling:** `Scanner`
- **Core Concept:** Mutual recursion

## Project Structure

```text
MutualRecursionJava/
├── MutualRecursion.java
└── README.md
```

## How It Works

The program uses two methods:

- **`Even(int n)`** returns `true` when `n` reaches zero. Otherwise, it calls `Odd(n - 1)`.
- **`Odd(int n)`** returns `false` when `n` reaches zero. Otherwise, it calls `Even(n - 1)`.

For positive integers, the methods alternate calls while decreasing the number until the base case is reached.

For example, when checking `4`, the calls alternate between `Even()` and `Odd()` until `Even(0)` returns `true`.

## Requirements

- Java Development Kit (JDK)
- A terminal or command prompt, or a Java-compatible IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code with Java support.

No third-party libraries are required.

## How to Run

1. Clone or download the repository.
2. Open a terminal in the project directory.
3. Compile the Java source file:

   ```bash
   javac MutualRecursion.java
   ```

4. Run the program:

   ```bash
   java MutualRecursion
   ```

## Example Output

```text
Enter a Number: 4
4 is an even number.

Enter a Number: 7
7 is an odd number.
```

The program continues prompting for additional numbers after each result.

## Current Limitations

- The program runs continuously and has no built-in exit command.
- The recursive methods work for nonnegative integers but do not correctly handle negative integers.
- Entering non-integer input causes an input exception.
- Large positive integers may cause a `StackOverflowError` because each recursive call adds another stack frame.
- The input scanner is not closed because the program does not have a normal termination path.
- Method names use uppercase initial letters, which differs from the usual Java naming convention for methods.

## Possible Improvements

- Add an option to exit the program.
- Handle negative integers correctly, for example by checking the remainder using `% 2`.
- Validate user input before processing it.
- Use iterative logic or a direct parity check when recursion is not the learning objective.
- Rename methods to `isEven()` and `isOdd()` to follow Java naming conventions.
- Add comments explaining the recursive call sequence and base cases.

## Project Purpose

This project is an educational example of mutual recursion in Java. It shows how two methods can cooperate through recursive calls to solve a simple classification problem.

## Author

**Ichiro Yamazaki**

GitHub: [@ichiroyamazaki](https://github.com/ichiroyamazaki)

## License

No license is specified in the repository. Check with the repository owner before redistributing or reusing the source code.
