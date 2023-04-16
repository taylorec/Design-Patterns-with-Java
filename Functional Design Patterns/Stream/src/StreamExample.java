/*
The streams functional design pattern presents a pipeline functionality used to transform data.

streams functional design pattern workflow
https://static.packt-cdn.com/products/9781789809770/graphics/assets/15703312-0d26-46c3-9875-2356fa38f1af.png
 */

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println();

        Stream.iterate(0, x->x+3)
                .peek(number -> System.out.print("\nPeeked at: "))
                .limit(7)
                .forEach(System.out::println);
    }
}
