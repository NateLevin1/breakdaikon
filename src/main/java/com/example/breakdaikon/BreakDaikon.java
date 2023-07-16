package com.example.breakdaikon;

import com.example.breakdaikon.org.junit.DynCompHackJUnitCommandLineParseResult;

public class BreakDaikon {
    public static void main(String[] args) {
        DynCompHackJUnitCommandLineParseResult.parse(() -> {
            System.out.println((new TestClass<Integer>() {
                @Override
                public Integer test() {
                    return 1;
                }
            }).test());
        });
    }
}
