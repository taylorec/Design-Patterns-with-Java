/*
The decorator design pattern allows us to assign responsibilities to an object without impacting the class.

https://static.packt-cdn.com/products/9781789809770/graphics/assets/a3c0c386-2cee-4e37-a81b-1cc2fc4278d8.png
 */

abstract class AbstractDecorator extends Printer {

    protected Printer printer;

    public void selectPrinterToFlush(Printer ptr) {
        printer = ptr;
    }

    public void flushBuffer() {
        if (printer != null) {
            printer.flushBuffer();
        }
    }
}
