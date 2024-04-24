package com.example.kotlinlearning.lesson4classandobject

/* 4 Main pillars of object orianted programing
Abstraction -> A concept where we define the functions without
functionalities, it needs to be implemented wherever/as required

Encapsulation -> Related to access modifiers and best practices, we should
hide the sensitive information and only expose the read only aspects of the
class (GETTERS) -> USER (Name, Email, Phone, Password)
GETTERS(Name, Email, Phone)

Inheritance -> You can utilise the variable, function, properties from the
parent class to child class without having to create an Object.

Polymorphism -> Poly-MANY, Morph-SHAPES
Overriding -> using parents function directly in child class and we can
modify the functionality
Overloading -> Same name and return type but can have different
parameters, compiler will choose the function based on number of
parameters provided

 */
/*
Classes are blueprints for objects. For example, an Aquarium class is the blueprint for making an aquarium object.
Objects are instances of classes; an aquarium object is one actual Aquarium.
Properties are characteristics of classes, such as the length, width, and height of an Aquarium.
Methods, also called member functions, are the functionality of the class. Methods are what you can "do" with the object. For example, you can fillWithWater() an Aquarium object.
An interface is a specification that a class can implement. For example, cleaning is common to objects other than aquariums, and cleaning generally happens in similar ways for different objects. So you could have an interface called Clean that defines a clean() method. The Aquarium class could implement the Clean interface to clean the aquarium with a soft sponge.
Packages are a way to group related code to keep it organized, or to make a library of code. Once a package is created, you can import the package's contents into another file and reuse the code and classes in it.
 */