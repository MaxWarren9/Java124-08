package lab2;

import java.util.Arrays;
/*
Создать класс, который обозначает какую-либо сущность.
Определить у него несколько конструкторов - конструктор
без параметров и конструктор со всеми параметрами.
Определить для него несколько параметров.
 */
public class Phone {
    private String brand;
    private String model;
    private String country;
    private int year;
    private double memory;

    public Phone() {
        this.brand = null;
        this.model = null;
        this.year = 0;
        this.country = null;
        this.memory = 0;
    }
    public Phone (String brand, String model, String country, int year, double memory) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.memory = memory;
    }

}
