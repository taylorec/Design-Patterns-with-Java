/*
The adapter design pattern is used to convert an interface of one
class into another interface expected by the system. This design
pattern empowers classes to work in concert with one another regardless
of the compatibility of their interfaces.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/f1ba3a56-450c-45a4-baad-dbf86347494f.png
 */

public class AcreageDeterminatorAdapter {

    AcreageDeterminator determinator;
    Estate estate;

    public double determineAcreage(Estate tEstate) {
        determinator = new AcreageDeterminator();
        estate = tEstate;
        Lot tLot = new Lot();

        tLot.length = estate.length;
        tLot.width = estate.width;

        return (determinator.determineAcreage(tLot) / 43560);
    }
}
