package com.pbo;

public class Main {

    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat\t: ".concat(warnaKoordinat.getNamaWarna()));
        System.out.println(String.format("Koordinat Sumbu x: %d, y: %d", warnaKoordinat.getX(), warnaKoordinat.getY()));
    }
}
