This Java program models a simple family tree using object-oriented programming concepts such as inheritance, polymorphism, and method overriding.


Overview >>>


The project consists of three main classes:

Person (Superclass) — Stores common attributes for all people, such as name, age, gender, hair color, eye color, and race.

Parent (Subclass of Person) — Stores a list of Child objects representing their children.

Child (Subclass of Person) — Stores a list of Parent objects representing their parents.


The program demonstrates:

Inheritance — Child and Parent both inherit from Person.

Polymorphism — Using toString() overrides to display each type of person in a custom format.

Dynamic collections — Using ArrayList to store a variable number of children or parents.

Encapsulation — Private fields with getters/setters.


Features:

Add children to a parent and automatically store them in an ArrayList.

Add parents to a child.

Display detailed person info using toString().

Support for families with:

No children

One child

Multiple children

Neatly formatted output for readability.
