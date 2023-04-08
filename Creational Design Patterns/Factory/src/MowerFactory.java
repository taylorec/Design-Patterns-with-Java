/*
The factory method design pattern allows subclasses to determine
which class to create. This is achieved by removing details about which
class to create away from the framework. Instead, the subclasses are
given the responsibility for object creation.

Class UML Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/abca771a-e6ff-428e-8715-140a28361ca9.png
 */
abstract class MowerFactory {

    public abstract Mower getMowerType(String mowerType);
}
