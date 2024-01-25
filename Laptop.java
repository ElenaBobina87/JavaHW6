package HW6;

import java.util.Objects;

/**
 * Laptop
 */
public class Laptop {
    private int id;
    private int ram;
    private int hardDriveCapasity;
    private String oS;
    private String color;

    public Laptop(int id, int ram, int hardDriveCapasity, String oS, String color) {
        this.id = id;
        this.ram = ram;
        this.hardDriveCapasity = hardDriveCapasity;
        this.oS = oS;
        this.color = color;
    }

    
    public int getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public int getHardDriveCapasity() {
        return hardDriveCapasity;
    }

    public String getOS() {
        return oS;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDriveCapasity(int hardDriveCapasity) {
        this.hardDriveCapasity = hardDriveCapasity;
    }

    public void setOS(String oS) {
        this.oS = oS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        
        return ("ID: " + id + ", ОЗУ(Гб): " + ram + ", Объем ЖД(Гб): " + hardDriveCapasity + ", Операционная система: " + oS + ", Цвет: " + color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Laptop c = (Laptop) obj;
        return id == c.id && ram == c.ram && hardDriveCapasity == c.hardDriveCapasity && oS.equals(c.oS) && color.equals(c.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ram, color, hardDriveCapasity, oS);
    }
    
}

