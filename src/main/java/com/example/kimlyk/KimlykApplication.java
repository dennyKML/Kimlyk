package com.example.kimlyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KimlykApplication {

    public static void main(String[] args) {
        SpringApplication.run(KimlykApplication.class, args);

        try {
            PC pc = new PCBuilder()
                    .setCPU("Core i7 7700k")
                    .setRAM("32GB")
                    .setGPU("NVIDIA RTX 4060")
                    .setSSD("1TB")
                    .setHDD("2TB")
                    .setPSU("750W")
                    .setOS("Windows")
                    .build();
            System.out.println(pc);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PC pc = new PCBuilder()
                    .setCPU("Core i7 7700k")
                    .setRAM("32GB")
                    .setHDD("2TB")
                    .setPSU("750W")
                    .build();
            System.out.println(pc);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            PC pc = new PCBuilder()
                    .setCPU("Core i7 7700k")
                    .setRAM("32GB")
                    .setGPU("NVIDIA RTX 4060")
                    .setSSD("1TB")
                    .setHDD("2TB")
                    .setPSU("750W")
                    .setOS("KimlykOS")
                    .build();
            System.out.println(pc);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
