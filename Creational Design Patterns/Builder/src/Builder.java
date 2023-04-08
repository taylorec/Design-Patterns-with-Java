/*
The builder design pattern is used to create a separation
between object instantiation and representation. The purpose
is to permit different representations with the same instantiation process.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/59922670-d669-4c82-be2a-ff28a7004ccd.png
 */

public interface Builder {

    void buildCoolingTray();
    void buildExhaustSystem();
    void buildGasBurner();
    void buildPlatform();
    void buildMotor();
    void buildThermocouples();
    void buildInnerDrum();
    void buildMainBody();

    Roaster getRoaster();
}
