/*
The interpreter design pattern is used to establish a grammatical representation
and an interpreter that interprets language. That might sound a bit complex and,
although the concept is simple, their implementation often is not. This design pattern
can be used for the interpretation of interpreted programming languages or languages
that are compiled in byte code or other intermediate languages such as the
Microsoft Intermediate Language (MSIL).

UML Class Diagram
https://static.packt-cdn.com/products/9781789809770/graphics/assets/21a45df5-70c6-4b6b-b2dd-d340c1d6b36a.png
 */

interface Expression {

    void interpret(Conversion orignalContent);

}
