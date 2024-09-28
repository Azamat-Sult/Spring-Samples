package ru.example.sample1.enums;

public enum ResultCode {

    SUCCESS("SUCCESS"),
    NEED_TO_CHECK("NEED_TO_CHECK"),
    FAIL("FAIL");

    private String value;

    ResultCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}