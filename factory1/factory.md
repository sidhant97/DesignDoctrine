
# Factory Design Pattern
The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is particularly useful when a system needs to encourage flexibility and extensibility in the objects it creates.

# Intent

* To provide a way to create objects without specifying the exact class of object that will be created.
* To offer a method for creating objects where the exact classes of the objects might not be known until runtime.

# Types of Factory Pattern
 * **Simple Factory:** Not a true design pattern by the book, but rather a programming idiom. It's a simple class that has a method for creating objects of various types.

 * **Factory Method:** Defines an interface for creating an object, but lets subclasses decide which class to instantiate. The Factory Method lets a class defer instantiation to subclasses.

 * **Abstract Factory:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

# Example in Java

Here is a simple example of how to implement the Factory design pattern in Java:

* **[Single Threaded Singleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/singleThreaded)**
* **[Eager Loading Singleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/eagerLoading)**
* **[Double Check Locking Singleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/doubleCheckLocking)**

# Use Cases
The Singleton pattern is often used in scenarios where a single instance of a class is required to control the action throughout the execution. Common use cases include:

1. Frameworks and Toolkits: React and Flutter frameworks.
2. Dependency Injection.
3. Cross-Platform Applications.
4. Object Pooling.  

# Pros
* **Flexibility and Scalability:** The Factory Method pattern allows the class code to work with different subclasses of products without modifying the code.
* **Decoupling: Separates product** construction code from the code that uses the product.
* **Single Responsibility Principle:** Moves the product creation code into one place, simplifying the codebase.

# Cons
* **Complexity:** Can introduce additional complexity into the code, especially if many subclasses are created.
* **Development Overhead:** For simple applications, using factory patterns might be overkill and could unnecessarily complicate the design.

# Conclusion
The Factory Design Pattern is powerful for scenarios requiring flexibility and extensibility in object creation, promoting loose coupling and scalability in application development.
