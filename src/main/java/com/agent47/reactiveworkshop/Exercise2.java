package com.agent47.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        var stream = ReactiveSources.intNumbersFlux();


        //another thing to consider is their can be multiple subscribers
        stream.subscribe(
                s -> System.out.println("subscriber 1 :" + s)
        );
        stream.subscribe(
                s -> System.out.println("subscriber 2 :" + s)
        );

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux()
                .subscribe(
                        s -> System.out.println(s)
                );

        System.out.println("Press a key to end");
        System.in.read();
    }

}
