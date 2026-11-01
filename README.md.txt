# COS 201 - Computer Programming I

## Student Details
- Name: Olagunju Samuel Toluwani
- Programme: CYB (Cybersecurity)
- Course Code: COS 201

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise
Created and executed my first Java programme. It prints a welcome message, then displays my course, programme, three reasons programming matters in cybersecurity, and a learning goal.

### File
- week01/FirstProgram.java

### How to Run
`cd week01`, then `javac FirstProgram.java`, then `java FirstProgram`

### Skills Practised
- Java class and main method
- Output statements (`System.out.println`)
- Compilation and execution (`javac` and `java`)
- Modifying source code and re-running it
- GitHub version control

---

## Week 2: Development Environment and Java

### Practical Exercise
Set up the JDK and Visual Studio Code, then wrote a Hello World programme that displays a greeting, a welcome message for COS 201, and a statement about learning Java.

### File
- week02/HelloWorld.java

### How to Run
`cd week02`, then `javac HelloWorld.java`, then `java HelloWorld`

### Sample Output
```
Hello, World!
Welcome to COS 201.
I am learning Java programming.
```

### Skills Practised
- Installing and checking the JDK (`javac -version`, `java -version`)
- Using VS Code to create and save Java files
- Matching the file name to the public class name
- Compiling and running a Java programme

---

## Week 3: Input, Processing and Output

### Practical 1: Simple Calculator
Reads two numbers and calculates their sum, difference, product and quotient. It checks for a zero divisor before dividing.

- File: week03/SimpleCalculator.java
- Run: `javac SimpleCalculator.java`, then `java SimpleCalculator`
- Sample run: inputs 20 and 4 give Sum 24.00, Difference 16.00, Product 80.00, Quotient 5.00

**Skills Practised**
- Reading keyboard input with `Scanner`
- `double` variables and arithmetic operators
- Formatted output with `printf` (`%.2f`)
- `if-else` to handle division by zero

### Practical 2: Average Calculator
Reads a student's name and three course scores, then displays the total and average. It validates that each score is between 0 and 100.

- File: week03/AverageCalculator.java
- Run: `javac AverageCalculator.java`, then `java AverageCalculator`
- Sample run: scores 70, 80 and 90 give Total 240.00 and Average 80.00

**Skills Practised**
- Reading `String` and `double` input
- Calculating totals and averages
- Input validation with `if-else` and logical operators (`||`)

### Practical 3: Item Cost
Reads an item name, quantity and unit price, then displays a purchase summary with the total cost. It rejects invalid quantities and negative prices.

- File: week03/ItemCost.java
- Run: `javac ItemCost.java`, then `java ItemCost`
- Sample run: quantity 3 and unit price 1500 give Total cost 4500.00

**Skills Practised**
- Using `int` and `double` together
- Applying programming to an inventory scenario
- Validating input before calculating

---

## Folder Structure
- COS201-Programming-I/README.md
- COS201-Programming-I/week01/FirstProgram.java
- COS201-Programming-I/week02/HelloWorld.java
- COS201-Programming-I/week03/SimpleCalculator.java
- COS201-Programming-I/week03/AverageCalculator.java
- COS201-Programming-I/week03/ItemCost.java