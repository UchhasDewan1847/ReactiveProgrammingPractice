package com.agent47.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("First Problem");
        StreamSources.intNumbersStream()
                .forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("2nd Problem");
        StreamSources.intNumbersStream()
                .filter(d -> d < 5)
                .forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("3rd Problem");
        StreamSources.intNumbersStream()
                .filter(d -> d > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("4th Problem");
        var something = StreamSources.intNumbersStream()
                .filter(d -> d > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(something);

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("5th Problem");
        StreamSources.userStream()
                .map(u -> u.getFirstName())
                .forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("6th Problem");
        StreamSources.intNumbersStream()
                .flatMap(d -> StreamSources.userStream().filter(u -> u.getId() == d)
                        .map(user -> user.getFirstName()))
                .forEach(System.out::println);
        //another solution
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream()
                        .anyMatch(i -> i == user.getId()))
                .forEach(System.out::println);

    }

}
