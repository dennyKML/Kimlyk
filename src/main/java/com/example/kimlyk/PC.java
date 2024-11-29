package com.example.kimlyk;

public class PC {
    private final String cpu;
    private final String ram;
    private final String gpu;
    private final String ssd;
    private final String hdd;
    private final String psu;
    private final String os;

    public PC(String cpu, String ram, String gpu, String ssd, String hdd, String psu, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.ssd = ssd;
        this.hdd = hdd;
        this.psu = psu;
        this.os = os;
    }

    @Override
    public String toString() {
        return "PC Configuration:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "GPU: " + gpu + "\n" +
                "SSD: " + ssd + "\n" +
                "HDD: " + hdd + "\n" +
                "PSU: " + psu + "\n" +
                "OS: " + os + "\n";
    }
}
