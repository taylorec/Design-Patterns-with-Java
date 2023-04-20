/*
When implementing the stateless design pattern, the classes and objects created do not retain state changes.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/743c54c9-3039-4f42-849d-fed69b2dcb8b.png
 */

public interface CorgiState {

    void awake();
    void eat();
    void play();
    void sit();
    void sleep();
    void walk();
}
