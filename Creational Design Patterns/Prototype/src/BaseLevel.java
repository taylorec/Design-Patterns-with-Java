/*
The prototype design pattern allows us to specify a category of objects using a
prototype instance. This instance is then copied in order to create new objects.
The prototype design pattern is ideal for situations when you want object creation
to be independent of the system. For example, we might be developing a game with
multiple levels. Each level is based on a core level and modified thereafter. We can
clone the prototype level in order to create subsequent levels and avoid having to
start level creation from scratch.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/bee318aa-d028-4f17-93ac-82e43bec4f77.png
 */

public abstract class BaseLevel implements Cloneable {

    public String levelName;
    public int numberOfNPCs;
    public int numberOfTokens;

    // accessor methods
    public String getLevelName() {
        return levelName;
    }

    public int getNumberOfNPCs() {
        return numberOfNPCs;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }

    // mutator methods
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setNumberOfNPCs(int npc) {
        this.numberOfNPCs = npc;
    }

    public void setNumberOfTokens(int tokens) {
        this.numberOfTokens = tokens;

    }

    // level clone method
    public BaseLevel clone() throws CloneNotSupportedException {
        return (BaseLevel)super.clone();
    }
}
