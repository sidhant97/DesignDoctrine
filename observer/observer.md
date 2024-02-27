# Observer Design Pattern
The Observer design pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is essential in implementing distributed event handling systems, such as the model-view-controller (MVC) architectural pattern often used in web applications. The Observer pattern is widely used in programming languages that support event-driven programming, such as JavaScript, and frameworks like React.js, Angular, and Vue.js.

# Participants
The Observer pattern involves two main types of participants:

**Subject (Observable):**
* The entity that holds the state of interest.
* Maintains a list of its dependents, called observers.
* Sends a notification to its observers when its state changes.

**Observer:**

* An interface or abstract class defining the update method that will be called when the Subject's state changes.
* Concrete implementations of the Observer update themselves based on information from the Subject.

**Workflow**
* The Subject maintains a list of Observers and provides methods to add or remove Observers from this list.
* When an event occurs that changes the state of the Subject, it notifies all registered Observers by calling their update method.
* Each Observer then takes the necessary action to reflect the change in the Subject's state, often by retrieving new state information from the Subject.

# Implementation Steps
* Define the Observer interface: This interface should include a method (e.g., update()) that will be called when the Subject's state changes.
* Create Concrete Observers: Implement the Observer interface in concrete classes. These implementations should specify what actions to take when they are notified of a change in the Subject.
* Define the Subject interface: This interface declares methods for attaching and detaching Observers (e.g., attach(observer), detach(observer)) and a method for notifying Observers of state changes.
* Create a Concrete Subject: Implement the Subject interface. This class maintains a list of its Observers and implements the method to notify them of changes.

# Example in Java

Consider a weather station application (the Subject) that tracks weather data (temperature, humidity, pressure) and multiple display elements (Observers) that show weather updates in different formats.

* The weather station will update its data periodically.
* Each display element subscribes to the weather station to receive updates.
* When the weather data changes, the weather station notifies all subscribed display elements.
* Each display element then updates its display with the new weather information.

[**Weather Station Example**](https://github.com/sidhant97/DesignDoctrine/tree/main/observer)

# Use Cases
* In Graphical User Interface (GUI) applications, the Observer pattern is extensively used to handle user interactions and update the UI accordingly. For instance, a model representing the application state (Subject) can notify various UI components (Observers) to update themselves when the state changes, such as enabling or disabling buttons, showing notifications, or updating data displays.
* In financial applications, real-time data feeds, such as stock market tickers, can act as Subjects, with various display widgets acting as Observers. These widgets could include charts, tables, and summary statistics that need to update in real-time as new data arrives.
* Event-driven systems, especially in software frameworks and libraries, utilize the Observer pattern to handle events such as mouse clicks, keyboard input, or custom application events. Objects interested in these events will subscribe as Observers to the event source (Subject).
* Social media platforms often implement the Observer pattern to notify users of various events, such as new posts by people they follow, comments on their posts, or direct messages.
* In IoT (Internet of Things) applications, sensor networks often employ the Observer pattern to monitor environmental changes, such as temperature, humidity, or motion, and trigger actions or alerts in response.
* In game development, the Observer pattern can be used to update game elements in response to events, such as changes in player state, game level changes, or in-game notifications.

# Pros

* **Loose Coupling:** The Subject doesn't need to know the details of its Observers, only that they implement the Observer interface.
* **Dynamic Relationships:** Observers can be added or removed at runtime without affecting the Subject or other Observers.

# Cons

* **Memory Leaks:** If not implemented carefully (especially in languages without automatic garbage collection), it can lead to memory leaks due to lingering references to deleted Observers.
* **Unexpected Updates:** Observers are notified in an unspecified order, which can sometimes lead to race conditions or inconsistent states if not managed properly.

# Conclusion
The Observer pattern is a fundamental pattern for event handling and is foundational to many modern programming paradigms and frameworks.