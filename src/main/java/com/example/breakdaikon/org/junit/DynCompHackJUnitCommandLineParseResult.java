package com.example.breakdaikon.org.junit;

// this class tricks DynComp into thinking that JUnit is running, as DynComp doesn't
// pick up on our custom runner will call JUnit
//
// it adds a class that contains "JUnitCommandLineParseResult" w/the method `parse`
// to the call stack, which is what DynComp looks for.
//
// this fixes the "Test class can only have one constructor" error
public class DynCompHackJUnitCommandLineParseResult {
    public static void parse(Runnable runnable) {
        runnable.run();
    }
}
