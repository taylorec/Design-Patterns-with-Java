package MasterClasses;

/*
Proxy, in the Java context, is defined as having the authority to represent another object.

Proxy references can accomplish the following with regards to an object reference:
- Utilize smart pointers that can count the number of references to a given object.
This supports garbage collection.
- Object locking so it cannot be modified by other objects.
- Memory loading enhancements.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/dd7a1945-3d3c-49f4-83d6-ad392c8fa1a4.png
 */


public abstract class Weather {

    public abstract void whoAmI();
}
