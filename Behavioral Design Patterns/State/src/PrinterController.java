/*
The state design pattern allows an object to change its behavior
based on internal state changes. The effect is that the object may seem to change its class.

UML Class Design
https://static.packt-cdn.com/products/9781789809770/graphics/assets/28229b1e-2eef-403f-aa64-339d8917bcb6.png
 */

abstract class PrinterController {

    public abstract void pushPrint(Printer printJob);
}
