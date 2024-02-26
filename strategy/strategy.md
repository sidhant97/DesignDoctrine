# Strategy Design Pattern

The Strategy Design Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

# Intent

* Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
* Avoid exposing complex, algorithm-specific data structures.
* Promote the use of composition over inheritance to change behavior dynamically.

# Implementation Components

* **Context:** Holds a reference to one of the concrete strategies and communicates with this strategy only via the strategy interface.
* **Strategy Interface:** Declares a common interface for all supported algorithms. Context uses this interface to call the algorithm defined by a Concrete Strategy.
* **Concrete Strategies:** Implement different variations of an algorithm the Strategy interface defines.

# Example in Java

Let's take a straightforward example where we have various navigation modes, and we select one at runtime based on the need.

* [**Navigation System**](https://github.com/sidhant97/DesignDoctrine/tree/main/strategy)

# Use Cases

* When you want to define a class that will have one behavior that is similar to other behaviors in a list.
* When you need to use one of several behaviors dynamically.
* When you want to encapsulate algorithm details from implementation.

# Pros

* Allows for easy introduction of new strategies without changing the context.
* Supports Open/Closed Principle by allowing the behavior of the context to be extended without modifying its code.
* Decouples the implementation details of an algorithm from the code that uses it.

# Cons

* Can increase the number of objects in the system.
* Clients must be aware of the differences between strategies to select the appropriate one.

# Conclusion

The Strategy pattern is instrumental in situations where multiple algorithms might be chosen at runtime depending on the context, providing flexibility and decoupling the algorithm implementation from the code that uses it.