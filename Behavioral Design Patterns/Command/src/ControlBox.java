/*
The purpose of the command design pattern is to send requests as objects.
This pattern, also referred to as the transaction or action design pattern,
permits the sending of requests without knowing any details about the receiver
or even about what is being requested. This might sound counter-intuitive, and
requires that it be looked at from a systems perspective and not a human-managed
operation. With the command pattern, we encapsulate requests as objects and transmit
them to a receiver.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/13f0b245-64c4-4d07-ae46-892ceacc4672.png
 */

public class ControlBox {

    // Class Variables - Public / Final
    public static final int SLIDER_MIN = 0;
    public static final int SLIDER_MAX = 100;

    // Class Variables - Private
    private boolean poweredOn;
    private int sliderValue;

    // Constructor
    public ControlBox () {
        poweredOn = false; // default value
        sliderValue = 0;   // default value
    }

    // Accessor Methods
    public int getSliderValue() {
        return sliderValue;
    }

    public boolean hasPower () {
        return poweredOn;
    }

    // Method to turn power on
    public void powerOn() {
        poweredOn = true;
    }

    // Method to turn power off
    public void powerOff() {
        poweredOn = false;
    }

    // Method to increase slider value
    public void sliderIncrease () {
        if (hasPower()) {
            if (getSliderValue() < SLIDER_MAX) {
                sliderValue++;
                System.out.println(sliderValue); // simulate sending value to digital display
            }
        }
    }

    // Method to decrease slider value
    public void sliderDecrease () {
        if (hasPower()) {
            if (getSliderValue() > SLIDER_MIN) {
                sliderValue--;
                System.out.println(sliderValue); // simulate sending value to digital display
            }
        }
    }

}
