package com.apd.login.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserDataValidations {

    public static boolean checkId(int typeDoc, String id) {
        if (id == null || id.length() != 9) return false;
        switch (typeDoc) {
            case 1: return validarDNI(id);
            case 2: return validarNIE(id);
            default: return false;
        }
    }

    private static boolean validarDNI(String id) {
        for (int i = 0; i < 8; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') return false;
        }
        char letra = id.charAt(8);
        return (letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z');
    }

    private static boolean validarNIE(String id) {
        char inicio = Character.toUpperCase(id.charAt(0));
        if (inicio != 'X' && inicio != 'Y' && inicio != 'Z') return false;
        for (int i = 1; i < 7; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') return false;
        }
        char fin = id.charAt(8);
        return (fin >= 'a' && fin <= 'z') || (fin >= 'A' && fin <= 'Z');
    }

    public static boolean checkEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        boolean tieneArroba = email.contains("@");
        boolean tieneExtension = email.endsWith(".com") || email.endsWith(".es") || email.endsWith(".net") || email.endsWith(".org");
        return tieneArroba && tieneExtension;
    }

    public boolean validateLogin(String email, String pass) {
        return checkEmail(email) && pass.equals("1234");
    }
}