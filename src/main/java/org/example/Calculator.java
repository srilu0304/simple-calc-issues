package org.example;

public class Calculator {
    private int unusedVariable = 42; // unused

    public int add(int a, int b) {
        return a + b;
    }

    public int duplicateMethod(int a, int b) {
        return a + b; // duplicated code
    }
}
