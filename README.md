# Design Patterns

## Behavioral

### Chain of responsability

Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### Iterator



### Memento



### State



### Template Method



### Command



### Mediator



### Observer



### Strategy



### Visitor



## Creational

### Abstract factory

Used to produce families of related objects without specifying their concrete classes.

### Builder

Used to construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

### Factory Method

Provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Prototype

Used to copy existing objects without making your code dependent on their classes.

### Singleton

It is used to you ensure that a class has only one instance, while providing a global access point to this instance.

## Structural

### Adapter

It allows objects with incompatible interfaces to collaborate.

### Bridge

Used to split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

### Composite

Used to compose objects into tree structures and then work with these structures as if they were individual objects.

### Decorator

Used to attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

### Facade

It provides a simplified interface to a library, a framework, or any other complex set of classes.

Having a facade is useful when you need to integrate your app with a sophisticated library that has dozens of features, but you just need a tiny bit of its functionality.

### Flyweight

Used to fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

### Proxy

It provides a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
