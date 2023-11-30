# CSU Global CSC372 Programming II 

# and CSC400 Data Structures and Algorithms



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
