/*
The memento design pattern saves an object's current internal state as a
memento so that it can be referred to and restored to.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/c24767b8-a994-4371-8d8f-e41c77f2a28a.png
 */

public class GameMission {

    // class variables
    private int percentageCompleted;
    int previousPercentageCompleted;

    // constructor
    public GameMission() {
        percentageCompleted = 0;
        previousPercentageCompleted = 0;
    }

    // mutator
    public void setPercentageCompeted(int percentage) {
        previousPercentageCompleted = percentageCompleted;
        percentageCompleted = percentage;
    }

    // accessor
    public int getPercentageCompleted() {
        return percentageCompleted;
    }
}
