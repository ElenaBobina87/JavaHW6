package HW6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(100, 8, 500, "Windows", "White");
        Laptop laptop2 = new Laptop(101, 16, 1000, "MacOS", "White");
        Laptop laptop3 = new Laptop(102, 8, 500, "Linux", "Black");
        Laptop laptop4 = new Laptop(103, 16, 2000, "Windows", "Black");
        Laptop laptop5 = new Laptop(104, 8, 1000, "Linux", "Red");
        Laptop laptop6 = new Laptop(105, 16, 2000, "MacOS", "Red");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6));
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        Set<Laptop> filteredLaptops = filterLaptop(laptops);
        System.out.println("Под критерии подходят следующие ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }

        

        

    }

    public static Set<Laptop> filterLaptop(Set<Laptop> laptops) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:\r\n" + //
                "1 - ОЗУ\r\n" + //
                "2 - Объем ЖД\r\n" + //
                "3 - Операционная система\r\n" + //
                "4 - Цвет");
        Scanner iScanner = new Scanner(System.in);
        String criterion = iScanner.nextLine();
        

        
        Map<String, Object> filterCriterion = new HashMap<>();
        Set<Laptop> filteredLaptops = new HashSet<>();

        switch (criterion) {
            case "1":
                Set<Integer> allRam = getAllRam(laptops);
                System.out.println("Введите минимальный желаемый ОЗУ: " + allRam);
                int ram = iScanner.nextInt();
                filterCriterion.put("ОЗУ", ram);
                for (Laptop laptop : laptops) {
                    if (laptop.getRam() >= ram) {
                        filteredLaptops.add(laptop);
                    }
                }
                return filteredLaptops;
            case "2":
                Set<Integer> allHardDriveCapasity = getAllHardDriveCapasity(laptops);
                System.out.println("Введите минимальный желаемый объем жесткого диска: " + allHardDriveCapasity);
                int hardDriveCapacity = iScanner.nextInt();
                filterCriterion.put("объем ЖД", hardDriveCapacity);
                for (Laptop laptop : laptops) {
                    if (laptop.getHardDriveCapasity() >= hardDriveCapacity) {
                        filteredLaptops.add(laptop);
                    }
                }
                return filteredLaptops;
            case "3":
                Set<String> allOS = getAllOS(laptops);
                System.out.println("Введите желаемую операционную систему: " + allOS);
                String oS = iScanner.nextLine();
                filterCriterion.put("OC", oS);
                for (Laptop laptop : laptops) {
                    if (laptop.getOS().equals(oS)) {
                        filteredLaptops.add(laptop);
                    }
                }
                return filteredLaptops;
            case "4":
                Set<String> allColor = getAllColor(laptops);
                System.out.println("Введите желаемый цвет: " + allColor);
                String color = iScanner.nextLine();
                filterCriterion.put("Цвет", color);
                for (Laptop laptop : laptops) {
                    if (laptop.getColor().equals(color)) {
                        filteredLaptops.add(laptop);
                    }
                }
                return filteredLaptops;
            
        }
        return filteredLaptops;
        

        



    }

    

    public static Set<Integer> getAllRam(Set<Laptop> set) {
        Set<Integer> allRams = new TreeSet<>();
        for (Laptop laptop : set) {
            int rams = laptop.getRam();
            allRams.add(rams);
        }
        return allRams;
    }

    public static Set<Integer> getAllHardDriveCapasity(Set<Laptop> set) {
        Set<Integer> allHardDriveCapasity = new TreeSet<>();
        for (Laptop laptop : set) {
            int hardDriveCapasity = laptop.getHardDriveCapasity();
            allHardDriveCapasity.add(hardDriveCapasity);
        }
        return allHardDriveCapasity;
    }

    public static Set<String> getAllOS(Set<Laptop> set) {
        Set<String> allOS = new HashSet<>();
        for (Laptop laptop : set) {
            String oS = laptop.getOS();
            allOS.add(oS);
        }
        return allOS;
    }

    public static Set<String> getAllColor(Set<Laptop> set) {
        Set<String> allColor = new HashSet<>();
        for (Laptop laptop : set) {
            String color = laptop.getColor();
            allColor.add(color);
        }
        return allColor;
    }

   
}
