# Singleton Design Pattern

The Singleton Design Pattern is a software design pattern that ensures a class has only one instance and provides a
global point of access to that instance. It is a part of the creational pattern family, which deals with object creation
mechanisms, aiming to create objects in a manner suitable to the situation. The Singleton pattern is particularly useful
when exactly one object is needed to coordinate actions across the system.

# Intent
Ensure that a class has just a single instance.
Provide a global point of access to that instance.
Implementation
Implementing a Singleton pattern involves several key steps:

1. Make the Constructor Private: This prevents other classes from instantiating it directly.
2. Create a Private Static Instance of the Class: This will be the single instance created by the class itself.
3. Provide a Public Static Method That Returns the Instance: This is the global access point for the outer world to get
   the instance of the singleton class.

Example in Java

Here is a simple example of how to implement the Singleton design pattern in Java:

* *
  *[Single Threaded Singleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/singleThreaded)
  **
* **[Eager Loading Singleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/eagerLoading)
  **
* *
  *[Double Checking LockingSingleton Pattern](https://github.com/sidhant97/DesignDoctrine/tree/main/singleton/src/doubleCheckLocking)
  **
# Use Cases

The Singleton pattern is often used in scenarios where a single instance of a class is required to control the action
throughout the execution. Common use cases include:

1. Configuration Classes: Holding configuration settings for an application.
2. Database Connection Pools: Managing a connection pool to a database to limit the number of connections.
3. Logger Classes: Managing access to log files throughout an application.
4. Cache: Implementing cache mechanisms where a single instance controls the cached data.

# Pros
* Ensures only one instance of a class is created.
* Provides a single point of access to that instance.
* Can be lazy-loaded if the instance is not needed until later in the application's lifecycle.
# Cons
* Can introduce global state into an application, which can lead to unintended consequences if not managed carefully.
* The pattern does not inherently solve thread safety in creating the instance; additional work is needed to make it
  thread-safe.
* Can be more difficult to test due to the global state.
* Thread Safety
* To ensure thread safety when creating the singleton instance, consider using synchronization mechanisms or
  initialization-on-demand holder idiom. For example, in Java, you can make the getInstance method synchronized or use a
  static inner class to hold the instance.

# Conclusion

The Singleton design pattern is a powerful tool for ensuring that only one instance of a class is created and accessed
globally. However, it should be used judiciously, considering its impact on application architecture, especially
regarding global state management and testability.