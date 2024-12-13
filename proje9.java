package org.example;

import java.util.Scanner;

public class proje9 {
    //burç bulma programı
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        String ay = s.nextLine();
        System.out.print("Doğduğunuz günü giriniz: ");
        int gun = s.nextInt();

        String burc = " ";

        if (ay.equalsIgnoreCase("Aralık")) {
            if (gun <= 21) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        } else if (ay.equalsIgnoreCase("Ocak")) {
            if (gun <= 20) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (ay.equalsIgnoreCase("Şubat")) {
            if (gun <= 19) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (ay.equalsIgnoreCase("Mart")) {
            if (gun <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (ay.equalsIgnoreCase("Nisan")) {
            if (gun <= 20) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (ay.equalsIgnoreCase("Mayıs")) {
            if (gun <= 21) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (ay.equalsIgnoreCase("Haziran")) {
            if (gun <= 21) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (ay.equalsIgnoreCase("Temmuz")) {
            if (gun <= 22) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (ay.equalsIgnoreCase("Ağustos")) {
            if (gun <= 22) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (ay.equalsIgnoreCase("Eylül")) {
            if (gun <= 22) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (ay.equalsIgnoreCase("Ekim")) {
            if (gun <= 22) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (ay.equalsIgnoreCase("Kasım")) {
            if (gun <= 21) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else {
            System.out.println("Geçerli bir ay giriniz.");
            return;
        }

        System.out.println("Burcunuz: " + burc);

        s.close();
    }
}