package com.hazem.BuggyApp.utility;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtility {
    static public boolean checkPasswordStructureValidity(String password) {  // Au moins 8 caractères, une majuscule et un chiffre
        String regx = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        return password.matches(regx);
    }
    static public String generatePasswordHash(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Le texte d'entrée ne peut pas être null");
        }
        try {
            // Obtention de l'instance SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Calcul du digest sur les octets UTF-8 de la chaîne
            byte[] hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));

            // Conversion en hexadécimal
            StringBuilder hexString = new StringBuilder(2 * hashBytes.length);
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            // SHA-256 est toujours disponible dans la JVM standard, mais on gère l'exception
            throw new RuntimeException("Impossible de trouver l'algorithme SHA-256", e);
        }
    }
}
