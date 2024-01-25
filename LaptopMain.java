package HW6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(100, 8, 500, "Windows", "Белый");
        Laptop laptop2 = new Laptop(101, 16, 1000, "MacOS", "Черный");
        Laptop laptop3 = new Laptop(102, 8, 500, "Linux", "Желтый");
        Laptop laptop4 = new Laptop(103, 16, 2000, "Windows", "Зеленый");
        Laptop laptop5 = new Laptop(104, 8, 1000, "Linux", "Красный");
        Laptop laptop6 = new Laptop(105, 16, 2000, "MacOS", "Серый");

        Set<Laptop> rangeLaptop = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));
        for (Laptop laptop : rangeLaptop) {
            System.out.println(laptop);
        }
    }
}
