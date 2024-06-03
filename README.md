# OOP. Classes, Objects, and Constructors

## OOP in Java

Java is an object-oriented programming language. This means that writing programs in Java should be done using an object-oriented style. This style is based on the use of objects and classes in the program.

### What is an Object?

The world we live in consists of objects. If we look around, we will see that we are surrounded by houses, trees, cars, furniture, dishes, computers. All these items are objects, and each of them has a set of specific characteristics, behavior, and purpose.

In this lesson, we will examine objects and classes in Java, their concepts.

A class can be defined as a template (similar to a blueprint for producing similar items). This template describes the behavior of an object, which in turn has a state and behavior. It is an instance of the class. For example, a dog can have a state — color, name, as well as behavior — wagging, barking, eating.

### Objects in Java

Let's now look at what objects are. If we consider the real world, we will find many objects around us, such as cars, dogs, people, etc. All of them have a state and a lifestyle.

For example, a dog’s state can be its name, breed, color, and its lifestyle can be barking, wagging its tail, running. If we compare a software object in Java with a real-world object, they have very similar characteristics; they also have a state and behavior. The software state is stored in fields, and the behavior is represented through methods.

Thus, in software development, methods work on the internal state of the object, and interactions with others are carried out using methods.

### Classes in Java

Example of creating a class in Java:

```java
public class Dog {
   String name;
   int age;
   String color;

   void bark() {
   }
   
   void eat() {
   }
   
   void sleep() {
   }

   public String getName() {
      return name;
   }
}
```

### Creating an Object of the Dog Class in main()

### Constructor of a Class

When discussing classes, one of the most important subtopics in Java is the constructor. Every class has a constructor. If we do not write it or, for example, forget it, the compiler will create it by default for that class.

Each time a new object is created in Java, at least one constructor will be called. The main rule is that they must have the same name as the class, which can have more than one constructor.

```java
public Dog(String name) {
   // This is a constructor in Java with one parameter, name.
}
```

### Creating an Object

There are several ways to create an object in a class:

- **Declaration**: Declare a variable with the name of the variable and the type of the object.
- **Instantiation**: Use the `new` keyword.
- **Initialization**: The `new` keyword is followed by a call to the constructor. This call initializes the new object.

Example:

```java
public class Dog {

   public Dog(String name) {
      System.out.println("Passed name: " + name); 
   }
   
   public static void main(String[] args) {
      Dog rex = new Dog("Rex");
   }
}
```

### Accessing Instance Variables and Methods in Java

Variables and methods are accessible through created objects. To access an instance variable, the full path should look like this:

```java
Dog rex = new Dog("Rex");
rex.getName();
```

### Enhancing the Dog Class with Getters and Setters

Enhance the Dog class by implementing getter and setter methods for all fields. In the main method, create five objects of type Dog.

### Access Modifiers

Java provides a range of access modifiers to set access levels for classes, variables, methods, and constructors. There are four access levels:

- **Package-private** (default, no modifier required)
- **Private** (visible only to the class)
- **Public** (visible to all)
- **Protected** (visible to the package and all subclasses)

#### Default Access Modifier

The default access modifier means that we do not explicitly declare an access modifier for the class, field, method, etc. A variable or method declared without an access control modifier is accessible to any other class in the same package.

#### Private Access Modifier

The private access modifier means that methods, variables, and constructors declared as private are only accessible within the declared class itself. The private access modifier is the most restrictive access level. Classes and interfaces cannot be private.

Variables declared private can be accessed outside the class if public getter and setter methods are present in the class. Using the private modifier in Java is the primary way to encapsulate data.

#### Public Access Modifier

The public access modifier means that the class, method, constructor, interface, etc., declared as public can be accessed from any other class. Therefore, fields, methods, and blocks declared inside a public class can be accessed from any class.

#### Protected Access Modifier

The protected access modifier means that the variables, methods, and constructors declared as protected in a superclass can be accessed only by subclasses in other packages or any class within the package of the protected members' class.

### Static Modifier

The static modifier is used to create variables and methods of the class.

#### Static Variables

The static keyword is used to create variables that will exist independently of any instances created for the class. Only one copy of the static variable exists, regardless of the number of instances of the class.

Static variables are also known as class variables. In Java, local variables cannot be declared static.

#### Static Methods

The static keyword is used to create methods that will exist independently of any instances created for the class.

### Final Modifier

The final modifier is used to finalize the implementations of classes, methods, and variables.

#### Final Variables

A final variable can only be initialized once. A reference variable declared as final cannot be reassigned to refer to another object. However, the data within the object can be changed. Thus, the state of the object can be changed, but not the reference.

Final variables in Java are often used with static to make the variable a constant.

#### Final Class

The main purpose of using a class declared as final in Java is to prevent the class from being subclassed. If a class is marked as final, no class can inherit any functionality from the final class.

### The `this` Keyword

The `this` keyword is required for a method to refer to the object that invoked it.

```java
public void setName(String newName) {
    name = newName;
}
```

To avoid introducing a new variable `newName` and preventing the compiler from getting confused about which `name` to work with and assign a value to, `this` is used:

```java
public void setName(String name) {
    this.name = name;
}
```

Thus, using `this` allows avoiding additional variables for the same designation, making the code less overloaded with additional variables.

### Constructor Overloading

Constructor overloading is a concept where a class can have more than one constructor with different parameter lists. The constructors will have the same name as the class but different signatures.

---
