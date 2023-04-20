/*
The concept of caching is to temporarily store data that
makes accessing it faster. Caching is employed to help save on the use of resources.

diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/e88b05f3-7a7d-4234-b672-129d244f6d84.png
 */
public class Player {

    int playerJersey;
    int playerPoints;
    Player before;
    Player next;

    // constructor
    public Player(int jersey, int points) {
        this.playerJersey = jersey;
        this.playerPoints = points;
    }
}
