package com.company;

public class Main {

    public static void main(String[] args) throws ZionException {
        // Exercise-1
        try {
            int a = 1 / 0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        // * try and then finally is legal but you won't be able to catch the exception.
        // * class Exception is the father class of all the other Exception classes, so every possible exception type will be caught.
        // * The problem with using the Exception handler is that it's too general. I want to handle each type of exception separately.
        // * Exception: catch every exception types. ArithmeticException: exceptional arithmetic condition has occurred.

        // Exercise-2
        Person person = new Person("Zion","123");
        person.getDressed();

        // Exercise-3
        Person theFlash = new Person("Barry alan","1");
        theFlash.useSuperPowers();

        // Exercise-4
        // The result will be an error: abstract classes cannot be instantiated, and the word 'class' is a reserved word of java.

        // Exercise-5: class SuperVillain
        // The result will be an error: Illegal combination of modifiers: 'abstract' and 'final'
        // If the class is only declared final: you can't create an abstract method in non-abstract class,
        // and no other class can inherit from the final class.

        // Exercise-6
        System.out.println("Is the ball round: " + Ball.isRound);
        Ball.isRound = false;

        // Exercise-7
        // Static modifier can't be used in a method

        // Exercise-8
        // the value of 's' is null, which means it wasn't instantiated, and we cannot do any action with it until it does.

        // Exercise-9
        // We don't have to call the garbage collector. The JVM does it automatically.

        // Exercise-10
        // D - Cow is an instance of Cow, Animal and Inter.

        // Exercise-11
        // It make sense to use a try-finally block without catch. For example: If i want to check a button on a website.
        // If the site does not load at all, i have no point in continuing to check the button.

        // Exercise-12
        // the program will throw a RuntimeException and stop.

        // Exercise-13
        // The keyword const is reserved, even though it is not currently used.
        // This may allow a Java compiler to produce better error messages if these C++ keywords incorrectly appear in programs.

        // Exercise-14
        throw new ZionException("That's my Error");
    }
}
