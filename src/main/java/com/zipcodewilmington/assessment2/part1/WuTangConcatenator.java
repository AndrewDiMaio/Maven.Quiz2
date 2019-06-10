package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        boolean result = false;
        if (this.input % 3 == 0) {

            result = true;
        }return result;
    }

    public Boolean isTang() {
        boolean result = false;
        if (this.input % 5 == 0) {

            result = true;
        }return result;
    }

    public Boolean isWuTang() {
        boolean result = false;
        if (this.input % 3 == 0 && this.input % 5 == 0) {

            result = true;
        }return result;
    }
}
