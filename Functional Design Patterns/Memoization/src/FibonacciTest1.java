/*
The memoization functional design pattern stores the results of key functions so
that overall processing efficiency is increased. When there are specific processes
that have the same output each time they are invoked, it is less costly, from a
processing time perspective, to cache the results instead of recalculating them each time.

Fibonacci numbers are a mathematical construct where each number is the sum of the two
preceding numbers. The Fibonacci sequence starts with the numbers 0 and 1.
 */

public class FibonacciTest1 {

    public static int computeFibonacciNumber(int number) {

        // this checks for the fibonacci base of 0 and 1
        if ( (number == 0) || ( number == 1) ) {
            return number;
        }

        System.out.println("Computing computeFibonacciNumber(int " + number + ")...");

        return (computeFibonacciNumber(number - 1)) + (computeFibonacciNumber(number - 2));
    }

    public static void main(String[] args) {

        System.out.println();
        computeFibonacciNumber(30);
    }
}
