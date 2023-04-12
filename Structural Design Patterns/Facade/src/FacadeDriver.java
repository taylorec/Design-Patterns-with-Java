package CH5Facade;

/*
The facade design pattern creates an interface that is served as an interface to
other interfaces within a system or subsystem. The benefits of using this design
pattern are that subsystems are less complex, the reliance components is reduced,
and communication between system components is minimized.
https://static.packt-cdn.com/products/9781789809770/graphics/assets/457a7ddf-21bd-485b-8b25-c38dc757caa1.png
As indicated in the diagram, the facade interface serves as an interface between the system and
subsystem. It can also be correction inferred that the facade interface will prevent the
unnecessary exposure of details to the system.

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/b49aea68-e09c-4738-9efd-da4e74de994e.png
The UML class diagram shows that the MealFacade class serves as a facade for the
MealProtein, MealVegetable, and MealStarch classes.
 */

import CH5Facade.MealFacade.MealFacade;

public class FacadeDriver {

    public static void main(String[] args) {

        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tMeal Assembly Service Demo");
        System.out.println("======================================================");

        // assemble three meals
        MealFacade meal1 = new MealFacade();
        meal1.assembleMeal("Steak", "Asparagus", "Wild Rice");

        MealFacade meal2 = new MealFacade();
        meal2.assembleMeal("Chicken", "Green Beans", "Potato Wedges");

        MealFacade meal3 = new MealFacade();
        meal3.assembleMeal("Meatloaf", "Brussel Sprouts", "Mashed Potatoes");
    }
}
