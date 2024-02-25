# Decorator Design Pattern

The Decorator Design Pattern is a structural pattern used to extend (decorate) the functionality of objects dynamically,
allowing for a flexible alternative to subclassing for extending functionality. It involves a set of decorator classes
that are used to wrap concrete components without modifying their structure. This pattern is particularly useful when
you want to add responsibilities to individual objects dynamically and transparently, that is, without affecting other
objects of the same class.

# Intent

* To add new functionality to an object dynamically without altering its structure.
* To provide a flexible alternative to subclassing for extending functionality.
* To allow for a dynamic combination of behaviors.

# Implementation

The Decorator pattern typically involves the following components:

* **Component:** An interface or abstract class defining the operations that can be dynamically added to concrete
  implementations.
* **ConcreteComponent:** A class that implements or extends Component, representing objects to which additional
  responsibilities can be attached.
* **Decorator:** An abstract class that implements the Component interface and has a reference to a Component object. It
  delegates all Component methods to the object it decorates and may add additional behavior before or after forwarding
  a request.
* **ConcreteDecorator:** Classes that extend Decorator, adding new functionality to the Component object they decorate.

# Example in Java

Here is a simple example of how to implement the Decorator design pattern in Java:

* [**Two Wheeler**](https://github.com/kbhatia01/LLD1-Jan-7/blob/main/src/Decorator)

# Use Cases

* When you want to add responsibilities to individual objects dynamically and transparently, without affecting other
  objects.
* When extending functionality through subclassing is impractical or impossible due to a large number of subclasses.
* When you want to add functionalities that can be removed later.

# Pros

* More flexibility than static inheritance.
* Avoids feature-laden classes high up in the hierarchy.
* Responsibilities can be added and removed at runtime.
* Combining functionalities by wrapping them together.

# Cons

* Can result in a large number of small classes, making a system harder to understand.
* Can introduce complexity, making it difficult to debug.

# Conclusion

The Decorator Pattern offers an effective way to enhance objects' functionalities dynamically, providing a more flexible
approach than subclassing, especially when managing a wide range of behaviors and responsibilities.