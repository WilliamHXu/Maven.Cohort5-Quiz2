package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer number;
    public WuTangConcatenator(Integer input) {
        this.number = input;
    }

    public Boolean isWu() {
        return (number % 3 == 0);
    }

    public Boolean isTang() {
        return (number % 5 == 0);
    }

    public Boolean isWuTang() {
        return (number % 15 == 0);
    }
}
