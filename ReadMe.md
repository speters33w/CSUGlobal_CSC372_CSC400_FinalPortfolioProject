# CSU Global CSC372 Programming II 

# && CSC400 Data Structures and Algorithms



## CSU Global CSC372 Programming II (Java)

### **Critical Thinking Assignment 1:**

### **Implementing a Superclass Bank Account**

**Part 1**: Implement a superclass [BankAccount](src/main/java/edu/csuglobal/csc372/milestone1/bank_account/BankAccount.java) that has the following fields and methods.

Fields:

- string firstName
- string lastName
- int accountID
- double balance

Methods: 

- constructor():  initialize balance to zero
- deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
- withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
- Setters and getters for firstName, lastName, and accountID
- getBalance() getter to return the balance
- accountSummary() - prints all account information

**Part 2**: Implement a [CheckingAccount](src/main/java/edu/csuglobal/csc372/milestone1/bank_account/CheckingAccount.java) class that inherits from the [BankAccount](src/main/java/edu/csuglobal/csc372/milestone1/bank_account/BankAccount.java) class, that: 

- Has an interest rate attribute
- Allows overdraft withdrawals and charges a $30 fee

Methods:

- processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
- displayAccount() - should display all superclass attributes and provides an additional interest rate

Ensure that your program has the two required classes and a [test class](src/main/java/edu/csuglobal/csc372/milestone1/Main.java).

**Place each Java class into a separate Java source file**.



### **Critical Thinking Assignment 2:**

### **Creating a GUI Bank Balance Application** 

Create a simple [Graphical User Interface (GUI) Bank Balance  application](src/main/java/edu/csuglobal/csc372/milestone1/bank_account/GUIBankAccount.java). The application must obtain the [BankAccount](src/main/java/edu/csuglobal/csc372/milestone1/bank_account/BankAccount.java) balance from a  user, and then display that balance within a JPanel when the user  selects a button. The program should allow for the user to deposit and  withdraw funds from their account using a simple interface. The  remaining balance in the account should be displayed before exiting the  program. Ensure that your application includes the following components:

- JPanel

- JButton
- ActionListener



### **Critical Thinking Assignment 3:**

### **Creating a User Interface**

#### Option #1: **Creating a User Interface I** 

Create a [user interface](src/main/java/edu/csuglobal/csc372/milestone1/user_interface/UserInterface.java) that has a top bar that includes a menu. The menu should have four items. 

- When the user selects the first menu option, then the date and time should be printed in a text box. 
- When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt." 
- When the user selects the third menu item then the frame  background color changes to random color hue of the color green. The  menu option should display the initial random hue each time selected for a single execution of the program.

- When the user selects the fourth menu option then the program exits.

#### Option #2: **Creating a User Interface II** 

Create a [user interface](src/main/java/edu/csuglobal/csc372/milestone1/user_interface/UserInterface.java) that has a top bar that includes a menu. The menu should have four items. 

- When the user selects the first menu option, then the date and time should be printed in a text box. 
- When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt." 
- When the user selects the third menu item then the frame  background color changes to random color hue of the color orange. The  menu option should display the initial random hue each time selected for a single execution of the program.

- When the user selects the fourth menu option then the program exits.



### **Critical Thinking Assignment 4:**

### **Creating an Abstract Class Shape**

#### Option #1: **Creating an Abstract Class Shape I**

Create an abstract class "[Shape](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Shape3D.java)" with the following specifications:

1. An abstract method "surface_area ()" of return type double
2. An abstract method "volume()" of return type double

**I.**

Create a class "[Sphere](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Sphere.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - Radius

1. Constructor:
   - Implement a parameterized constructor needed to initialize the data.

1. toString:
   - Implement a "toString" method that prints out the surface area and volume.

Implement methods to compute the surface area and volume.

**II.**

Create a class "[Cylinder](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Cylinder.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - Radius, height - both of type double

1. Constructor:
   - Implement a parameterized constructor to initialize the data.

1. toString:
   - Implement a "toString" method that prints out the surface area and volume.

Implement methods to compute the surface area and volume.

**III.**

Create a class "[Cone](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Cone.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - Radius, height - both of type double

1. Constructor:
   - Implement a parameterized constructor to initialize the data.

1. toString:
   - Implement a "toString" method that prints out the surface area and volume.

Implement methods to compute the surface area and volume.

**IV.**

Create a driver class named "[ShapeArray](src/main/java/edu/csuglobal/csc372/milestone2/shapes/ShapeArray.java)" with the following specifications:

1. Instantiate one sphere.
2. Instantiate one cylinder.
3. Instantiate one cone.
4. Store the class instances into an array named "shapeArray."
5. Loop through the array and print out the instance data of each object using the object instance's "toString" method.

Show a [Unified Modeling Language (UML) diagram](uml/Shapes.svg) of your project.

#### Option #2: **Creating an Abstract Class Shape II**

Create an abstract class "[Shape](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Shape2D.java)" with the following specifications:

1. an abstract method "area()" of return type double
2. an abstract method "perimeter()" of return type double.

**I.**

Create a class "[Rectangle](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Rectangle.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - width, length

1. Constructor:
   - Implement a parameterized constructor needed initialize the data.

1. toString:
   - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

**II.**

Create a class "[Circle](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Circle.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - radius

1. Constructor:
   - Implement a parameterized constructor to initialize the data.

1. toString:
   - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

**III.**

Create a class "[Triangle](src/main/java/edu/csuglobal/csc372/milestone2/shapes/Triangle.java)" that extends the Shape class with the following specifications:

1. Attributes:
   - length of side1, length of side2, length of side3, each is a double
2. Constructor:
   - Implement a parameterized constructor to initialize the data.
3. toString:
   - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

**IV.**

Create a driver class named "[ShapeArray](src/main/java/edu/csuglobal/csc372/milestone2/shapes/ShapeArray.java)" with the following specifications:

1. Instantiate one triangle.
2. Instantiate one circle.
3. Instantiate one square.
4. Store the class instances into an array named "shapeArray."
5. Loop through the array and print out the instance data of each object
6. using the object instance's "toString" method.

Show a [UML diagram](uml/Shapes.svg) of your project.



### **Critical Thinking Assignment 5:**

### **Implementing Recursion**

#### Option #1: **Implementing Recursion to Provide a Product**

Using recursion, create a [program](src/main/java/edu/csuglobal/csc372/milestone2/recursion/RecursionRunner.java) that will allow a user to enter  five numbers. The program will provide the product of all five numbers using [recursive methods](src/main/java/edu/csuglobal/csc372/milestone2/recursion/Recurse.java).

#### Option #2: **Implementing Recursion to Provide a Sum** 

Using recursion, create a [program](src/main/java/edu/csuglobal/csc372/milestone2/recursion/RecursionRunner.java) that will allow a user to enter  five numbers. The program will provide the sum of all five numbers using [recursive methods](src/main/java/edu/csuglobal/csc372/milestone2/recursion/Recurse.java).



### **Critical Thinking Assignment 6:**

### **Storing an ArrayList**

#### Option #1: **Storing an ArrayList** 

Create a Java [program](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/Main.java) that will store 10 student objects in an  ArrayList, ArrayList&lt;Student&gt;. A [student](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/Student.java) object consists of the  following fields:

- int rollno
- String name
- String address

Implement two [comparator classes](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/SortStudents.java) to sort student objects by [name](src/main/java/util/speters33w/sort/SelectionSortStudent.java) and  by rollno (roll number). Implement your own [selection sort](src/main/java/util/speters33w/sort/SelectionSort.java) method and place your code in a separate Java source file. Do not use a sort method from the Java collections library.

#### Option #2: **Storing an ArrayList II**

Create a Java [program](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/Main.java) that will store 10 student objects in an  ArrayList, ArrayList&lt;Student&gt;. A [student](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/Student.java) object consists of the  following fields:

- int rollno
- String name
- String address

Implement a [comparator class](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/SortStudents.java) to sort student objects by rollno (roll  number). Implement your own [merge sort](src/main/java/util/speters33w/sort/MergeSort.java) method and place your code in a  separate Java source file. Do not use a sort method from the Java  collections library.



### **Module 8: Portfolio Project**
#### **Final Program**

Write a [Java program](src/main/java/edu/csuglobal/csc372/final_program/Main.java) that incorporates a loop that prompts the user  for student data. Student data are private fields in a [student](src/main/java/edu/csuglobal/csc372/milestone2/sort_students/Student.java) class  including:

- String name
- String address
- double GPA

Each student object is stored in a linked list.

After the user completes the data entry, output the contents of the  linked list in ascending sorted order by name to a regular text file that can be opened and viewed using a simple plain-text editor such as  notepad.

Validate numeric data for Grade Point Average (GPA).



## CSU Global CSC400 Data Structures and Algorithms

### Program 1 (On-Line Food Delivery Service)

Demonstrate an understanding of working with bags in Java by  implementing a class called [ShoppingCart](src/main/java/edu/csuglobal/csc400/milestone1/shopping_bag/ShoppingCart.java) that implements the  [BagInterfaceMyType](src/main/java/com/pearson/carrano/BagInterface.java) in Java. Your implementation should include the  following:

Fields:

- MyType[] myBag;
- int numberofProducts;
- Default_Capacity;

Methods:

- Constructor(): initialize bag
- add() - will be used to add a new entry.
- toArray() - provides an array of the allocated bag.
- isFull() - test whether the bag is at the maximum capacity.

Implement a [BagDemo](src/main/java/edu/csuglobal/csc400/milestone1/shopping_bag/BagDemo.java) that tests your bag implementation class.

Methods:

- testAddl() - will add the contents to the Bag.
- displayBag() - will display the contents of the Bag.



### Program 2 (Java Postfix Converter)

Create a [Java Postfix converter](src/main/java/edu/csuglobal/csc400/milestone1/postfix/ConvertToPostfix.java) using the algorithm provided in  Segment 5.16 on page 167 (Chapter 5 of Carrano & Henry, 2019, p.  167).

5.16 The infix-to-postfix algorithm. 

The following algorithm encompasses the previous observations about the conversion process. 

For simplicity, all operands in our expression are single-letter variables.  

```pseudocode
Algorithm convertToPostfix(infix) 
{ 
    // Converts an infix expression to an equivalent postfix expression. 
    operatorStack = a new empty stack 
    postfix = a new empty string 
    while (infix has characters left to parse) 
    { 
        nextCharacter = next nonblank character of infix 
        switch (nextCharacter) 
        { 
            case variable: 
                Append nextCharacter to postfix 
                break 
            case '^' : 
                operatorStack.push(nextCharacter) 
                break 
            case '+' : case '-' : case '*' : case '/' : 
                while (!operatorStack.isEmpty() and precedence of nextCharacter <= 
                        precedence of operatorStack.peek()) 
                { 
                    Append operatorStack.peek() to postfix 
                    operatorStack.pop() 
                } 
                operatorStack.push(nextCharacter) 
                break 
            case '( ' : 
                operatorStack.push(nextCharacter) 
                break 
            case ')' : // stack is not empty if infix expression is valid 
                topOperator = operatorStack.pop() 
                while (topOperator != '(') 
                { 
                    Append topOperator to postfix 
                    topOperator = operatorStack.pop() 
                } 
                break 
            default: 
                break 
        } 
        while (!operatorStack.isEmpty()) 
        { 
            topOperator = operatorStack.pop() 
            Append topOperator to postfix 
        } 
    return postfix 
    } 
}
```



### Program 3 (Algorithm Analysis / Big-Oh Notation)

Implement the algorithm outlined in Exercise # 4 (Chapter 9 of Carrano & Henry, 2019, p. 288) in Java.

 Analyze your algorithm in Big-Oh notation and provide the appropriate  analysis, ensuring that your program has the required class and a test  class. 

In addition, compile and submit Exercise 5, the Big-Oh evaluations, and screenshots of your program's execution

4. The factorial of a positive integer n—which we denote as n!—is the product of n and the factorial of n - 1. The factorial of 0 is 1. Write [two different recursive methods](src/main/java/edu/csuglobal/csc400/milestone2/recursion/Factorial.java) that each return the factorial of n. 
5. Write a [recursive method](src/main/java/edu/csuglobal/csc400/milestone2/recursion/ReverseString.java) that displays a portion of a given array backward. Consider the last entry in the portion first.



### Program 4 (Exercise #11)

Implement the algorithm outlined in Exercise #11 (Chapter 15 of Carrano & Henry, 2019, p. 458) in Java.

Ensure that your program has the required class and a test class.

11. Devise an algorithm that detects whether a given array is sorted into ascending order. Write a [Java method that implements your algorithm](src/main/java/util/speters33w/sort/TestSort.java). You can use your method to test whether a sort method has executed correctly.



### Portfolio Project Order List Handler for an Online Retailer

Your Portfolio Project for CSC400 consists of the following:

- Write a program that handles the order list for an online retailer. Your program should contain a minimum of three classes:
  - Order Class
  - Display Class
  - Main Class
- Create a **[Order Class](src/main/java/edu/csuglobal/csc400/portfolio_project/Order.java)** that uses a queue to hold the  orders in the order they were taken. The queue should contain the  customer last name, order number, and order total cost.
- Create a **[Display Class](src/main/java/edu/csuglobal/csc400/portfolio_project/Display.java)** that will store a copy of  the order queue in two arrays. Each array will contain the order list  but one will be sorted by name and the other sorted by order number.  When a order is taken and stored in the Order Class the program will  update the
  Display Class arrays automatically and sort them in  descending order using quick sort and outputs the the contents to the  console upon each entry of new data.
- Create a **[Main Class](src/main/java/edu/csuglobal/csc400/portfolio_project/Main.java)** that will handle operator data  input and when an order is added or removed, the program will update the Order Class and Display Class. The user will be presented a menu to add a order, remove a order and display the order list from the queue.
