# Design-Patterns
  Design-Patterns is a handle we can use to describe a design problem, its solutions, and consequences in a word or two. 
  Naming a pattern immediately increases our design vocabulary. It lets us design at a higher level of abstraction.
  
1- The Builder pattern separates the construction of a complex object from its representation, so that the same construction process can create different representations.

![image](https://github.com/user-attachments/assets/82d55a39-738a-4d3f-b266-01ee65c67337)



2- The Abstract Factory pattern Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

3- Adapter pattern Convert the interface of a class into another interface clients expect. 

![image](https://github.com/user-attachments/assets/592687a5-9a6e-4ad1-8c61-f468509cbef0)

In this example, we want to manage Line and TextShape objects to expose them to the client. Therefore, we need an interface, **Shape**, that represents either a Line or TextShape. **The client (DrawingEditor)** can then draw their own shapes.

# The Project

## Overview
This project implements various **design patterns**, including:
- **Bridge**
- **Builder**
- **Command**
- **Composite**
- **Proxy**

It manages a **file processing system** with the following functionalities:
- `Load()`: Load files from different sources.
- `Filter()`: Filter files based on Predicate<File>.
- `Select()`: Select files by extension.
- `Print()`: Display files in a **Swing interface** with a JTable (showing file names and sizes).


Here’s an example of how to use the Command Pattern to select only files that end with .java


<img width="372" alt="image" src="https://github.com/user-attachments/assets/624a25ca-ae2e-4e25-8d7f-8e61542d25be" />


<img width="435" alt="image" src="https://github.com/user-attachments/assets/187cd144-28de-428c-90f4-decff1110dba" />
