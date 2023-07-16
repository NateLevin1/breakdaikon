package com.example.breakdaikon;

import com.example.breakdaikon.org.junit.DynCompHackJUnitCommandLineParseResult;

public class BreakDaikon {
    public static void main(String[] args) {
        // the below line causes DynComp to think JUnit is running,
        // we could just run with JUnit but that adds a lot of noise to this example
        DynCompHackJUnitCommandLineParseResult.parse(() -> {
            // the error results because of this line:
            System.out.println((new TestClass<Integer>() {
                @Override
                public Integer test() {
                    return 1;
                }
            }).test());
        });
    }
}
