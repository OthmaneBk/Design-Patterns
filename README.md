# Design-Patterns
  Design-Patterns is a handle we can use to describe a design problem, its solutions, and consequences in a word or two. 
  Naming a pattern immediately increases our design vocabulary. It lets us design at a higher level of abstraction.
  
1- The Builder pattern separates the construction of a complex object from its representation, so that the same construction process can create different representations.

![image](https://github.com/user-attachments/assets/82d55a39-738a-4d3f-b266-01ee65c67337)



2- The Abstract Factory pattern Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

3- Adapter pattern Convert the interface of a class into another interface clients expect. 

![image](https://github.com/user-attachments/assets/592687a5-9a6e-4ad1-8c61-f468509cbef0)

In this example, we want to manage Line and TextShape objects to expose them to the client. Therefore, we need an interface, **Shape**, that represents either a Line or TextShape. **The client (DrawingEditor)** can then draw their own shapes.

﻿# The Project
4- The project on design patterns includes Bridge, Builder, Command, Composite, and Proxy. It manages a process for a file source with functionalities such as Load(), Filter(), Select(), and Print(), presented through a Swing interface.
