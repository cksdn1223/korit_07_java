package org.example;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {
    private String name;
    private double height;
    private double weight;
}
