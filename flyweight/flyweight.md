# Flyweight Design Pattern

The Flyweight Design Pattern is a structural pattern aimed at minimizing memory usage or computational expenses by
sharing as much as possible with similar objects. It is particularly effective when a program must handle a large number
of objects with similar states shared across many objects. Instead of creating new objects every time, the pattern
reuses existing instances, distinguishing the intrinsic state (shared) from the extrinsic state (unique to each
instance).

# Intent

* To reduce the number of objects created, decrease memory footprint and increase performance.
* To reuse existing similar kind of objects by storing them and create a new object when no matching object is found.

# Implementation Components

* **Flyweight:** An interface through which flyweights can receive and act on extrinsic states.
* **ConcreteFlyweight:** Implements the Flyweight interface and stores intrinsic state. ConcreteFlyweight objects must
  be sharable.
* **UnsharedConcreteFlyweight:** Not all Flyweight subclasses need to be shared. This class is not shared and stores
  extrinsic state.
* **FlyweightFactory:** Creates and manages flyweight objects. It ensures that flyweights are shared properly. When a
  client requests a flyweight, the factory supplies an existing instance or creates a new one if none exists.
* **Client:** Uses the FlyweightFactory to obtain flyweight objects.

# Example in Java

Consider an example of a flight transport that needs to handle thousands of passenger data with flight data. The
Flyweight pattern can be used by the application to reduce the overall number of objects it needs to create instead of
creating one for each flight details.

* [**Flight**](https://github.com/sidhant97/DesignDoctrine/tree/main/flyweight)

# Use Cases

* When an application uses a large number of objects that have similar state or behavior, sharing parts of them to
  minimize memory usage.
* When the cost of creating objects is higher than the cost of maintaining them in memory.

# Pros

* Reduces the number of objects, decreasing memory footprint.
* Centralizes state management, making it easier to maintain or update object state.

# Cons

* Increases complexity by adding factory and management layers.
* The distinction between intrinsic and extrinsic state can sometimes be hard to maintain or understand, especially in
  large systems.

# Conclusion

The Flyweight pattern is a powerful tool for optimizing resource usage in scenarios with a vast number of similar
objects, making it a critical component in applications where performance and memory management are of paramount
concern.