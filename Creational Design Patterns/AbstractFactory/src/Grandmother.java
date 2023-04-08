/*
The abstract factory design pattern creates an interface that is used to create multiple
objects without knowledge of the concrete class. A concrete class in Java is a non-abstract
class that implements all of the methods in its hierarchy. This is a high-powered demonstration
of encapsulation. This design pattern allows us to change implementations without changing source code.
 */
abstract class Grandmother {

    // Constructor
    Grandmother() {
        System.out.println("Grandmother constructor executed.");
    }
}
