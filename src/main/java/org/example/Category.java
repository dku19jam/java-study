package org.example;

public enum Category {
    food("음식"),
    beverage("음료");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
