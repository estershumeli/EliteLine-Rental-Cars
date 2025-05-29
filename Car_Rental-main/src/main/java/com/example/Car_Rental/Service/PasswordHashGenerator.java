package com.example.Car_Rental.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordHashGenerator {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "user123";  // 👈 This is the password users will type
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println("BCrypt hash for 'user123':");
        System.out.println(encodedPassword);
    }
}
